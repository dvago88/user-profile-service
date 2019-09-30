package com.globant.userprofileservice.resource;

import com.globant.userprofileservice.dto.NewRegistry;
import com.globant.userprofileservice.model.PaymentInformation;
import com.globant.userprofileservice.model.Record;
import com.globant.userprofileservice.model.User;
import com.globant.userprofileservice.model.UserLessons;
import com.globant.userprofileservice.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/userprofile")
public class UserProfileResource {

  private RestTemplate restTemplate;

  @Autowired
  public UserProfileResource(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping("/{userId}")
  private UserProfile getUserProfile(@PathVariable("userId") String userId) {
    // Call user-info-service
    User userInfo = restTemplate.getForObject("http://user-info-service/user/" + userId, User.class);

    // Call lessons-info-service
    Record lessonsReceived = restTemplate.getForObject("http://lessons-info-service/lessons/numberoflessons/" + userId, Record.class);

    // Call payment-info-service
    UserLessons userLessons = restTemplate.getForObject("http://payment-info-service/payment/" + userId, UserLessons.class);

    // Return the user profile
    return new UserProfile(userInfo, userLessons, lessonsReceived.getLessons().size());
  }

  @PostMapping(value = "/",
      consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public UserProfile createUserProfile(@RequestBody NewRegistry newRegistry) {
    // Create the user
    User user = restTemplate.postForObject("http://user-info-service/user/",
        new User(newRegistry.getName(), newRegistry.getIdentification(), newRegistry.getPhone()),
        User.class);

    // Call payment-info-service
    UserLessons userLessons = restTemplate.postForObject("http://payment-info-service/payment/",
        new PaymentInformation(newRegistry.getAmountPaid(), newRegistry.getPaymentDate(), newRegistry.getNumberOfLessons(), user.getUserId()),
        UserLessons.class);

    return new UserProfile(user, userLessons, 0);
  }
}
