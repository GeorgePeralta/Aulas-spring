package peralta.george.exemplolombok.model;

import lombok.*;

/**
 * @author George Peralta
 */

@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;


    /**
     * @return vai retornar a idade em meses
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }
}