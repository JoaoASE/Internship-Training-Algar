import java.util.List;

public class RecargaService {
    private RecargaRepository recargaRepository;

    public RecargaService(RecargaRepository recargaRepository) {
        this.recargaRepository = recargaRepository;
    }

    public Recarga realizarRecarga(Recarga recarga) {
        return recargaRepository.save(recarga);
    }

    public List<Recarga> listarRecargasDoCliente(Long clienteId) {
        return recargaRepository.findByClienteId(clienteId);
    }
}
