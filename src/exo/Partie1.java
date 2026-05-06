package exo;

import models.Trip;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class Partie1 {
    Predicate<Trip> longTrip = trip -> trip.distanceKm() > 10;
    Predicate<Trip> expensiveTrip = trip -> trip.price() > 20;
    Predicate<Trip> badTrip = trip -> trip.rating() < 3;
    Predicate<Trip> recentTrip = trip -> {
        LocalDate tripDate = trip.startTime().toLocalDate();
        LocalDate today = LocalDate.now();
        return tripDate.equals(today) || tripDate.equals(today.minusDays(1));
    };
    public List<Trip> longAndExpensiveTrips(List<Trip> trips) {
        // distance > 10km et prix > 20€
        return trips.stream()
            .filter(longTrip.and(expensiveTrip))
            .toList();
    }

    public List<Trip> badTrips(List<Trip> trips) {
        // rating < 3
        return trips.stream()
            .filter(badTrip)
            .toList();
    }

    public List<Trip> recentTrips(List<Trip> trips) {
        // aujourd’hui ou hier
        return trips.stream()
            .filter(recentTrip)
            .toList();
    }
}
