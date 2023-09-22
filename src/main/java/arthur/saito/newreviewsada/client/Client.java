package arthur.saito.newreviewsada.client;

import arthur.saito.newreviewsada.user.User;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private UUID _uuid;
    private String _name;
    private String _email;
    private LocalDate _dayOfBirth;

    @ToString.Exclude
    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "user__id")
    private User user;

}
