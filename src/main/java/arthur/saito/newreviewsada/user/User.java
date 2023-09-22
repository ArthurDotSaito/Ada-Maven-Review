package arthur.saito.newreviewsada.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private UUID _uuid;
    @Column(unique = true)
    private String _email;
    @Column(unique = true)
    private String _login;
}
