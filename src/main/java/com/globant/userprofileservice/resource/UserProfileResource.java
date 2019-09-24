package com.globant.userprofileservice.resource;

import com.globant.userprofileservice.model.Record;
import com.globant.userprofileservice.model.User;
import com.globant.userprofileservice.model.UserNumberOfLessons;
import com.globant.userprofileservice.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    UserNumberOfLessons userNumberOfLessons = restTemplate.getForObject("http://payment-info-service/payment/" + userId, UserNumberOfLessons.class);

    // Return the user profile
    return new UserProfile(userInfo, userNumberOfLessons, lessonsReceived.getLessons().size());
  }
}
