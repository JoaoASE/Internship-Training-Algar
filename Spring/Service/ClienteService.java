import java.util.List;

public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente buscarCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}
