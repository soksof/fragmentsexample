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
        model.addAttribute("header", "Welcome to the HAEC fullstack Explore Greece project");
        model.addAttribute("title", "Welcome!");
        String subHeader = "page created by Sokratis";
        model.addAttribute("subHeader", subHeader);

        List<Tour> tours = new ArrayList<>();
        tours.add(new Tour("Athina", "Attiki", 6, 200, 600, "athens"));
        tours.add(new Tour("Thessaloniki", "Makedonia", 5, 140, 600, "thessaloniki"));
        tours.add(new Tour("Ioannina", "Hpeiros", 7, 60, 150, "ioannina"));
        tours.add(new Tour("Chania", "Kriti", 4, 80, 900, "chania"));

        model.addAttribute("tours", tours);

        return "index";
    }

    @GetMapping("about")
    public String about(){
        return "about";
    }
}
