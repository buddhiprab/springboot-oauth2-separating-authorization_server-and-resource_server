package com.buddhi.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableResourceServer
@RestController
public class ResourceServer {

	public static void main(String[] args) {
		SpringApplication.run(ResourceServer.class, args);
	}

	@GetMapping("/account")
	public String getAccount() {
		return "account 1";
	}

    @Bean
    public ResourceServerTokenServices tokenService() {
        RemoteTokenServices tokenServices = new RemoteTokenServices();
        tokenServices.setClientId("b");
        tokenServices.setClientSecret("b");
        tokenServices.setCheckTokenEndpointUrl("http://localhost:8100/oauth/check_token");
        return tokenServices;
    }
}
