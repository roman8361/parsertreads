package ru.kravchenko.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kravchenko.sb.api.service.IBootstrapService;

/**
 * Hello world!
 */

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        IBootstrapService bootstrapService = SpringApplication.run(App.class, args).getBean(IBootstrapService.class);
        bootstrapService.init();
    }

}
