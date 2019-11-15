package al.prodream.embedded.api.v1.consumers;

import al.prodream.embedded.api.v1.dto.ReservationDTO;
import al.prodream.embedded.api.v1.dto.PetDTO;
import al.prodream.embedded.api.v1.filters.PetFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author aleksruci on 14/Nov/2019
 */

@Component
public class HotelResourceConsumer extends ResourceConsumer {

    private static final String RESOURCE_URI = V1_BASE_URI + "/pet";

    public HotelResourceConsumer(RestTemplate restTemplate) {
        super(restTemplate);
    }

    public PetDTO getPet(PetFilter filter) {
        return consumeGet(RESOURCE_URI, filter, PetDTO.class);
    }

    public void createReservation(ReservationDTO reservationDTO) {
        consumePost(RESOURCE_URI + "/createReservation", reservationDTO);
    }

}