package arthur.saito.newreviewsada.client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {
    @Id
    @GeneratedValue
    private Long _id;
    private UUID _uuid;
    private String _name;
    private String _email;
    private LocalDate _dayOfBirth;
}
