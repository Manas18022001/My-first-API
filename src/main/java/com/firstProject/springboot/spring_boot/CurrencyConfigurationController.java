package com.firstProject.springboot.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
		@Autowired
		private CurrencyServiceConfiguration configuration;
		@RequestMapping("/currency-config")
		public CurrencyServiceConfiguration retrieveAllCourses() {
			return configuration;
		}
}
