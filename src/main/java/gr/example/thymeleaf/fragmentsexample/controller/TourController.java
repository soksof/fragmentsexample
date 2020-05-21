package gr.example.thymeleaf.fragmentsexample.controller;

import gr.example.thymeleaf.fragmentsexample.model.Tour;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TourController {

    @GetMapping("/tour/new")
    public String newTour(Model model){
        Tour newTour = new Tour();
        return "fragments/tour/new";
    }
}
