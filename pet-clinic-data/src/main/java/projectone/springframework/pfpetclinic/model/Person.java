package projectone.springframework.pfpetclinic.model;

/**
 * Created by pfuks on 1/4/2019.
 */
public class Person extends BaseEntity{
    private String fristName;
    private String lastName;

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
