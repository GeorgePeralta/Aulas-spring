package peralta.george.exemplocliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import peralta.george.exemplocliente.model.Client;

@SpringBootApplication
public class ExemploclienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploclienteApplication.class, args);

		//objeto 1
		Client client = new Client();
		client.setName("George");
		client.setLastname("Peralta");
		System.out.println(client);

		//objeto 2
		Client client1 = new Client("Claudiane","Peralta");
		System.out.println(client1);

		//objeto 3
		System.out.println(new Client("Ronaldo","Nazario"));
	}
}
