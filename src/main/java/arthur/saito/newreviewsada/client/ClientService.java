package arthur.saito.newreviewsada.client;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientJPARepository repository;
    private final ModelMapper

    public ClientService(ClientJPARepository repository) {
        this.repository = repository;
    }

    private ClientDTO convertToDto(Client client){
        return this.
    }
    public List<Client> listAll(){
        return this.repository.findAll();
    }
    public Client findById(Long id){
        return this.repository.findById(id).map(this::convertToDto);
    }
}
