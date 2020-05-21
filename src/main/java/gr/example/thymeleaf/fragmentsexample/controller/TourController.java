package gr.example.thymeleaf.fragmentsexample.controller;

import gr.example.thymeleaf.fragmentsexample.model.Tour;
import gr.example.thymeleaf.fragmentsexample.service.TourService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TourController {
    TourService tourService;

    public TourController(TourService tourService){
        this.tourService = tourService;
    }

    @GetMapping("/tour/new")
    public String newTour(Model model){
        Tour newTour = new Tour();
        model.addAttribute("newTour", newTour);
        return "fragments/tour/new";
    }

    @PostMapping("/tour/new")
    public String saveNewTour(@ModelAttribute("newTour") Tour tour, BindingResult result, Model model){
        System.out.println("I am sending you the new tour with the title: "+tour.getTitle());
        tourService.saveTour(tour);
        return "redirect:/index";
    }


    @GetMapping("/tour/update/{title}")
    public String updateTour(@PathVariable String title, Model model){
        Tour newTour = tourService.findByTitle(title);
        model.addAttribute("newTour", newTour);
        return "fragments/tour/update";
    }

    @PostMapping("/tour/update")
    public String updateTour(@ModelAttribute("newTour") Tour tour, BindingResult result, Model model){
        System.out.println("I am sending you the updated tour with the title: "+tour.getTitle());
        tourService.updateTour(tour);
        return "redirect:/index";
    }
}
