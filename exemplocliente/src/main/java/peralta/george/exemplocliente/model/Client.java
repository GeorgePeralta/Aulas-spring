package peralta.george.exemplocliente.model;

/**
 * @author George Peralta
 * @since 14/06/2020 - 19:21
 * @version 1.0
 */
public class Client {

    private String name;
    private String lastname;

    public Client() {
    }

    /**
     *
     * @param name
     * @param lastname
     */
    public Client(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return  "\nname = " + this.name +
                "\nlastname = " + this.lastname;
    }
}