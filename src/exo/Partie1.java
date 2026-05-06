package exo;

import models.Trip;

import java.time.LocalDate;
import java.util.List;

public class Partie1 {

    public List<Trip> longAndExpensiveTrips(List<Trip> trips) {
        // distance > 10km et prix > 20€
        return trips.stream()
            .filter(trip -> trip.distanceKm() > 10 && trip.price() > 20)
            .toList();
    }

    public List<Trip> badTrips(List<Trip> trips) {
        // rating < 3
        return trips.stream()
            .filter(trip -> trip.rating() < 3)
            .toList();
    }

    public List<Trip> recentTrips(List<Trip> trips) {
        // aujourd’hui ou hier
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        return trips.stream()
            .filter(trip -> {
                LocalDate tripDate = trip.startTime().toLocalDate();
                return tripDate.equals(today) || tripDate.equals(yesterday);
            })
            .toList();
    }
}
