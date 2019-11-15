package al.prodream.embedded.logic.services;

import al.prodream.embedded.api.v1.consumers.HotelResourceConsumer;
import al.prodream.embedded.api.v1.dto.RoomDTO;
import al.prodream.embedded.api.v1.filters.FreeRoomsFilter;
import org.springframework.stereotype.Service;

/**
 * @author aleksruci on 14/Nov/2019
 */

@Service
public class HotelService {

    private final HotelResourceConsumer hotelResourceConsumer;

    public HotelService(HotelResourceConsumer hotelResourceConsumer) {
        this.hotelResourceConsumer = hotelResourceConsumer;
    }

    public RoomDTO[] getFreeRooms(FreeRoomsFilter filter) {
        return hotelResourceConsumer.getFreeRooms(filter);
    }
}
