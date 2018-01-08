package com.pluralsight.eventtracker;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
 * The @EnableWebMvc annotation is effectively used in place of the previous servlet-config.xml file.
 * The bean definitions that were made within there are now all instead created within this WebConfig class.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.pluralsight.eventtracker")
public class WebConfig
{

}
