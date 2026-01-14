package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            // 요청별 접근 권한 설정
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/login", "/css/**", "/js/**").permitAll()
                .anyRequest().authenticated()
            )

            // 기본 로그인 페이지 사용
            .formLogin(form -> form 
            		.loginPage("/login")
            		.defaultSuccessUrl("/" , true)
            		.permitAll()
            		)

            // 로그아웃 허용
            .logout(Customizer.withDefaults());

        return http.build();
    }
}