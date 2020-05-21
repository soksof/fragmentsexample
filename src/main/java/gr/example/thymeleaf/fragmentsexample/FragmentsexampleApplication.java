package gr.example.thymeleaf.fragmentsexample;

import gr.example.thymeleaf.fragmentsexample.model.Tour;
import gr.example.thymeleaf.fragmentsexample.service.TourService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FragmentsexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FragmentsexampleApplication.class, args);
    }

    @Bean
    ApplicationRunner init(TourService tc){
        return args -> {
            tc.init();
        };
    }
}
