package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.models.Guitare;

@Configuration
@ComponentScan({ "com.example.*" })
public class AppConfig {

	@Bean(name = "imusicien")
	public Guitare getMusicien() {
		return new Guitare();
	}

}
