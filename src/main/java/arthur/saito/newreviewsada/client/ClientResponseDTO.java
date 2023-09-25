package arthur.saito.newreviewsada.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ClientResponseDTO(UUID uuid, String email) {
    public ClientResponseDTO(ClientDTO clientDTO){
        this(clientDTO.get_uuid(), clientDTO.get_email());
    }
}
