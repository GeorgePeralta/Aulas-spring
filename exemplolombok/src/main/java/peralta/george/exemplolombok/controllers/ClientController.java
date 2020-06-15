package peralta.george.exemplolombok.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import peralta.george.exemplolombok.model.Client;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient() {

        //base de dados... banco de dados.
        Client client = new Client();
        client.setName("George");
        client.setLastName("Peralta");
        client.setAge(26);

        return client;
    }


    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        //base de dados... banco de dados.
        Client client = new Client();
        client.setName("George");
        client.setLastName("Peralta");
        client.setAge(26);

        Client client1 = new Client();
        client1.setName("Pedro");
        client1.setLastName("Silva");
        client1.setAge(29);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
