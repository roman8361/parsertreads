package ru.kravchenko.sb.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author Roman Kravchenko
 */

@Configuration
@ComponentScan("ru.kravchenko.sb.service")
@EnableAsync
public class SpringAsyncConfig {
}
