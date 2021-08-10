package com.cognizant.policymicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.policymicroservice.model.AuthenticationResponse;

@FeignClient(name = "authenticationFeignClient",url = "http://authorizationservice-env-1.eba-qaz2ping.us-east-2.elasticbeanstalk.com/")
public interface AuthClient {

	@GetMapping("/authorization/validate") 
	  public AuthenticationResponse getValidity(@RequestHeader("Authorization") final String token);
}
