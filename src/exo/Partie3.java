package exo;

import models.Trip;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Partie3 {

    public List<Trip> top10ExpensiveTrips(List<Trip> trips) {
        // coder ici
        return trips.stream()
            .sorted(Comparator.comparingDouble(Trip::price).reversed())
            .limit(10)
            .toList();
    }

    public Optional<Trip> bestTrip(List<Trip> trips) {
        // coder ici
        return trips.stream()
            .max(Comparator.comparingDouble(Trip::rating));
    }
}
