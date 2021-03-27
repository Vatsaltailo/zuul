package com.vanguard.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.vanguard.zuulFilter.*;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayServerApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayServerApplication.class, args);
		
	}

	/*@Bean
	public PreFilter filter()
	{
		//logger.info("yo");
		return new PreFilter();
	}*/
}
