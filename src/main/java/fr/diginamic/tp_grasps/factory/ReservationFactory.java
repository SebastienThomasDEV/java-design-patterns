package fr.diginamic.tp_grasps.factory;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

import java.time.LocalDateTime;

public class ReservationFactory {

    public static Reservation createReservationForClient(LocalDateTime dateReservation, int nbPlaces, Client client, TypeReservation type) {
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);
        client.getReservations().add(reservation);
        double total = type.getMontant() * nbPlaces;
        if (client.isPremium()) {
            reservation.setTotal(total*(1-type.getReductionPourcent()/100.0));
        }
        else {
            reservation.setTotal(total);
        }
        return reservation;
    }

    public static Reservation bindClientToReservation(Reservation reservation, Client client) {
        reservation.setClient(client);
        client.getReservations().add(reservation);
        return reservation;
    }
}
