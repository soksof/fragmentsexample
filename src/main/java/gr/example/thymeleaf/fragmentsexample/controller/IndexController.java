package gr.example.thymeleaf.fragmentsexample.controller;

import gr.example.thymeleaf.fragmentsexample.model.Tour;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @GetMapping({"/", "/index"})
    public String welcome(Model model) {
        model.addAttribute("header", "Welcome to the HAEC fullstack Explore Crete project");
        model.addAttribute("title", "Welcome!");

        List<Tour> tours = new ArrayList<>();
        tours.add(new Tour("Athina", "Attiki", 6, 200, 600));
        tours.add(new Tour("Thessaloniki", "Notia Makedonia", 5, 140, 600));
        tours.add(new Tour("Ioannina", "Kentro toy Kosmou", 7, 60, 150));
        tours.add(new Tour("Chania", "Kriti", 4, 80, 900));

        model.addAttribute("tours", tours);

        return "index";
    }

    @GetMapping("about")
    public String about(){
        return "about";
    }
}
