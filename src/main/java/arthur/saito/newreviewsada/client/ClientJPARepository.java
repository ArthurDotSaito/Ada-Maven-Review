package arthur.saito.newreviewsada.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientJPARepository extends JpaRepository<Client, Long> {

}
