import exo.Partie1;
import exo.Partie2;
import exo.Partie3;
import factory.TripFactory;
import models.Trip;

void main() {
    // appeler les méthodes des exos ici
    // pour tester si ça marche bien, générer une liste de 10 éléments et afficher le résultat
    List<Trip> trips = TripFactory.generateTrips(10);

    Partie1 partie1 = new Partie1();
    Partie2 partie2 = new Partie2();
    Partie3 partie3 = new Partie3();

    System.out.println("PARTIE 1");
    System.out.println("Trajets longs et chers : " + partie1.longAndExpensiveTrips(trips).size());
    System.out.println("Mauvais trajets : " + partie1.badTrips(trips).size());
    System.out.println("Trajets récents : " + partie1.recentTrips(trips).size());

    System.out.println("\nPARTIE 2");
    System.out.println("Par ville : " + partie2.countByCity(trips));
    System.out.println("Revenu par chauffeur : " + partie2.revenueByDriver(trips));
    System.out.println("Durée moyenne par ville : " + partie2.avgDurationByCity(trips));

    System.out.println("\nPARTIE 3");
    System.out.println("Top 10 chers : " + partie3.top10ExpensiveTrips(trips).size());
    System.out.println("Meilleur trajet : " + partie3.bestTrip(trips));
}