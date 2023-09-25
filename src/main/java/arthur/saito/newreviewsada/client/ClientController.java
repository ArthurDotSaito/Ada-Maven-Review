package arthur.saito.newreviewsada.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
]
    @GetMapping("/{uuid}")
     public Optional<ClientDTO> findById(@PathVariable  UUID uuid){
        return this.service.findById(uuid);
    }
}
