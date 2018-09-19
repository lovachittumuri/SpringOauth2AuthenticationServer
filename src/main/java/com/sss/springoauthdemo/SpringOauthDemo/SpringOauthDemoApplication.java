package com.sss.springoauthdemo.SpringOauthDemo;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
//@EnableOAuth2Sso
public class SpringOauthDemoApplication {

	@Autowired
	private OAuth2ClientContext oAuth2ClientContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthDemoApplication.class, args);
	}

	@RequestMapping("/user")
	public Principal getuser(Principal user) {
		return user;
	}

}