package al.prodream.embedded.api.v1.controllers;

import al.prodream.embedded.api.v1.dto.ReservationDTO;
import al.prodream.embedded.logic.services.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author aleksruci on 14/Nov/2019
 */

@RestController
@RequestMapping("/api/v1/reservations")
public class ReservationController {

    // TODO add url to get reservation in the header location

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createReservation(@RequestBody ReservationDTO reservation) {
        reservationService.createReservation(reservation);
    }
}
