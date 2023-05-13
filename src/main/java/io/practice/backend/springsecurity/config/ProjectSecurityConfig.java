package io.practice.backend.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests()
                .requestMatchers("/api/v1/account", "/api/v1/balance", "/api/v1/loans", "/api/v1/cards").authenticated()
                .requestMatchers("/api/v1/notice", "/api/v1/contact").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return httpSecurity.build();
    }
}
