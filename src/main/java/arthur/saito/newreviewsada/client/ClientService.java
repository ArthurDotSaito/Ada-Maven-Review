package arthur.saito.newreviewsada.client;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {
    private final ClientJPARepository repository;
    private final ModelMapper modelMapper;

    public ClientService(ClientJPARepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    private ClientDTO convertToDto(Client client){
        return this.modelMapper.map(client, ClientDTO.class);
    }
    public List<Client> listAll(){
        return this.repository.findAll();
    }
    public Optional<ClientDTO> findById(UUID uuid){
        return this.repository.findById(uuid).map(this::convertToDto);
    }

}
