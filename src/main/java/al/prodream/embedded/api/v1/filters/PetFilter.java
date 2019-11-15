package al.prodream.embedded.api.v1.filters;

/**
 * @author aleksruci on 14/Nov/2019
 */

public class PetFilter extends Filter {

    private PetFilter() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long petId;
        private Long number;

        public Builder petId(Long petId) {
            this.petId = petId;
            return this;
        }

        public Builder number(Long number) {
            this.number = number;
            return this;
        }

        public PetFilter build() {
            PetFilter filter = new PetFilter();

            filter.addPathParam(petId, 1);
            filter.addPathParam("number", number, 2);

            return filter;
        }
    }
}
