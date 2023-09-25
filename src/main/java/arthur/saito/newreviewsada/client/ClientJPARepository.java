package arthur.saito.newreviewsada.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientJPARepository extends JpaRepository<Client, Long> {
    Optional<Client> findById(Long id);
}
