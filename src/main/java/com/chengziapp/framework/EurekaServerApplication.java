package com.chengziapp.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication
{
    public static void main( String[] args )
    {
       SpringApplication.run(EurekaServerApplication.class,args);
    }

    /*@Configuration
    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter{
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
        }
    }*/
}
