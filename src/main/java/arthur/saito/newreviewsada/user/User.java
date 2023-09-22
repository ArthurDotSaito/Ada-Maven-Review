package arthur.saito.newreviewsada.user;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

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
