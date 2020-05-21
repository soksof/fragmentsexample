package gr.example.thymeleaf.fragmentsexample.service;

import gr.example.thymeleaf.fragmentsexample.model.Tour;

import java.util.List;

public interface TourService {
    void saveTour(Tour tour);
    List<Tour> getAll();
    void init();
    void updateTour(Tour tour);
    Tour findByTitle(String title);
}
