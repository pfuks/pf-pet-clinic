package projectone.springframework.pfpetclinic.model;

/**
 * Created by pfuks on 1/4/2019.
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
