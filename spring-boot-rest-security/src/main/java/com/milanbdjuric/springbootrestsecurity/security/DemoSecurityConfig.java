package com.milanbdjuric.springbootrestsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){

        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/synths").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "/api/synths/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "/api/synths").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "/api/synths").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/api/synths/**").hasRole("ADMIN")
        );

        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf -> csrf.disable());

        return http.build();



    }









        /*
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


     */

}
