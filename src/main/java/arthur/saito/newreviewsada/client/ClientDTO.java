package arthur.saito.newreviewsada.client;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private UUID _uuid;
    private String _name;
    private String _email;
    private LocalDate _dayOfBirth;
}
