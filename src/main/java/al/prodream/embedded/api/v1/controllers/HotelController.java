package al.prodream.embedded.api.v1.controllers;

import al.prodream.embedded.api.v1.dto.PetDTO;
import al.prodream.embedded.api.v1.filters.PetFilter;
import al.prodream.embedded.logic.services.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author aleksruci on 14/Nov/2019
 */

@RestController
@RequestMapping("/api/v2/pet")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    //TODO what if no filter specified for a value

    @GetMapping(value = "/{petId}/{checkIn}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public PetDTO getPet(@PathVariable Long petId,
                         @PathVariable Long checkIn) {

        PetFilter filter = PetFilter.builder().petId(petId).number(checkIn).build();

        return hotelService.getPet(filter);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void postPet(@RequestBody PetDTO pet) {

        hotelService.postPet(pet);
    }

    //TODO make it consume every type of represantation
    //TODO add @ApiOperation for documentation
    //TODO specify default value for checkIn
}
