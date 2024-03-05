import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecargaRepository extends JpaRepository<Recarga, Long> {
    List<Recarga> findByClienteId(Long clienteId);
    
}
