package arthur.saito.newreviewsada.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {
    private UUID uuid;
    @Email
    @NotBlank
    private String email;
}
