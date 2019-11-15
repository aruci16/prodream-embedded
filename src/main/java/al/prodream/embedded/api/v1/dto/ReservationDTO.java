package al.prodream.embedded.api.v1.dto;

import al.prodream.embedded.logic.model.ReservationStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author aleksruci on 14/Nov/2019
 */

@Getter
@Setter
@NoArgsConstructor
public class ReservationDTO {
    private Long hotelId;
    private Long roomId;
    private ReservationStatus status;
    private String description;
    private int nrAdults;
    private int nrChildren;
    private Long checkIn;
    private Long checkOut;
    private Long clientId;
    private Long ratePlanId;
}
