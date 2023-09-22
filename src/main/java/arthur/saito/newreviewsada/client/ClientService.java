package arthur.saito.newreviewsada.client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientJPARepository repository;

    public ClientService(ClientJPARepository repository) {
        this.repository = repository;
    }
    public List<Client> listAll(){
        return this.repository.findAll();
    }
}
