package gr.example.thymeleaf.fragmentsexample.mapper;

import gr.example.thymeleaf.fragmentsexample.model.Tour;
import org.springframework.stereotype.Component;

@Component
public class TourMapper {

    public Tour map(TourForm tourForm){
        Tour tour = new Tour();
        tour.setDays(tourForm.getDays());
        tour.setTitle(tourForm.getPlace());
        tour.setSubtitle(tourForm.getRegion());
        tour.setPrice(tourForm.getPrice());
        return tour;
    }
}
