package arthur.saito.newreviewsada.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientJPARepository extends JpaRepository<Client, Long> {
    Optional<Client> findById(UUID uuid);
}
