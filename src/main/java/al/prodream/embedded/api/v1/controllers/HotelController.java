package al.prodream.embedded.api.v1.controllers;

import al.prodream.embedded.api.v1.dto.RoomDTO;
import al.prodream.embedded.api.v1.filters.FreeRoomsFilter;
import al.prodream.embedded.logic.model.Room;
import al.prodream.embedded.logic.services.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author aleksruci on 14/Nov/2019
 */

@RestController
@RequestMapping("/api/v1/hotels")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    //TODO what if no filter specified for a value

    @GetMapping(value = "/{hotelId}/free-rooms", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public RoomDTO[] getFreeRooms(@PathVariable Long hotelId, // TODO try to specify string hotelId
                                @RequestParam(required = false, defaultValue = "") Long checkIn,
                                @RequestParam(required = false) Long checkOut,
                                @RequestParam(required = false, defaultValue = "1") int nrAdults,
                                @RequestParam(required = false, defaultValue = "0") int nrChildren,
                                @RequestParam(required = false, defaultValue = "1") int nrRooms) {

        FreeRoomsFilter filter = FreeRoomsFilter.builder().hotelId(hotelId)
                .checkIn(checkIn)
                .checkOut(checkOut)
                .nrAdults(nrAdults)
                .nrChildren(nrChildren)
                .nrRooms(nrRooms)
                .build();

        return hotelService.getFreeRooms(filter);
    }

    //TODO make it consume every type of represantation
    //TODO add @ApiOperation for documentation
    //TODO specify default value for checkIn
}
