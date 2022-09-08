package com.sinensia.MyMovieApi.Security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

public class Security {

	@Autowired
	DataSource dataSource;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authz) -> authz.antMatchers("/").permitAll().antMatchers("/user").hasRole("USER")
				.antMatchers("/admin").hasRole("ADMIN").antMatchers("/manage/**").hasRole("ADMIN")).sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().csrf().disable()
				.httpBasic(Customizer.withDefaults());
		return http.build();
	}

	@Bean
	UserDetailsManager users(DataSource dataSource) {
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("user").password("password").roles("USER")
				.build();
		UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("admin").roles("USER", "ADMIN")
				.build();
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
		users.createUser(user);
		users.createUser(admin);
		return users;
	}

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
	}
}
