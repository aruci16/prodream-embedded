package al.prodream.embedded.logic.services;

import al.prodream.embedded.api.v1.consumers.HotelResourceConsumer;
import al.prodream.embedded.api.v1.dto.ReservationDTO;
import org.springframework.stereotype.Service;

/**
 * @author aleksruci on 14/Nov/2019
 */

@Service
public class ReservationService {

    private final HotelResourceConsumer hotelResourceConsumer;

    public ReservationService(HotelResourceConsumer hotelResourceConsumer) {
        this.hotelResourceConsumer = hotelResourceConsumer;
    }

    public ReservationDTO createReservation(ReservationDTO reservation) {
        return hotelResourceConsumer.createReservation(reservation);
    }

}
