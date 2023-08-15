package com.milanbdjuric.springbootrestsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails mirko = User.builder()
                .username("mirko")
                .password("{noop}mirko123")
                .roles("EMPLOYEE")
                .build();

        UserDetails slavko = User.builder()
                .username("slavko")
                .password("{noop}slavko123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails bosko = User.builder()
                .username("bosko")
                .password("{noop}bosko123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(mirko, slavko, bosko);
    }
}
