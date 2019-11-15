package al.prodream.embedded.api.v1.filters;

/**
 * @author aleksruci on 14/Nov/2019
 */

public class FreeRoomsFilter extends Filter {

    private FreeRoomsFilter() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long hotelId;
        private Long checkIn;
        private Long checkOut;
        private Integer nrAdults;
        private Integer nrChildren;
        private Integer nrRooms;

        public Builder hotelId(Long hotelId) {
            this.hotelId = hotelId;
            return this;
        }

        public Builder checkIn(Long checkIn) {
            this.checkIn = checkIn;
            return this;
        }

        public Builder checkOut(Long checkOut) {
            this.checkOut = checkOut;
            return this;
        }

        public Builder nrAdults(Integer nrAdults) {
            this.nrAdults = nrAdults;
            return this;
        }

        public Builder nrChildren(Integer nrChildren) {
            this.nrChildren = nrChildren;
            return this;
        }

        public Builder nrRooms(Integer nrRooms) {
            this.nrRooms = nrRooms;
            return this;
        }

        public FreeRoomsFilter build() {
            FreeRoomsFilter filter = new FreeRoomsFilter();
            //todo if null values don't include in the filter
            filter.put("hotelId", String.valueOf(hotelId));
            filter.put("checkIn", String.valueOf(checkIn));
            filter.put("checkOut", String.valueOf(checkOut));
            filter.put("nrAdults", String.valueOf(nrAdults));
            filter.put("nrChildren", String.valueOf(nrChildren));
            filter.put("nrRooms", String.valueOf(nrRooms));

            return filter;
        }
    }
}
