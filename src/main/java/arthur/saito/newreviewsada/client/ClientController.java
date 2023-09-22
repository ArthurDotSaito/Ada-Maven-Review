package arthur.saito.newreviewsada.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService service;

    public ClientController(ClientService service){
        this.service = service;
    }

    @GetMapping
     public List<Client> listAll(){
        return this.service.listAll();
     }
}
