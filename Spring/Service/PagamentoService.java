import java.util.List;

public class PagamentoService {
    private PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public Pagamento cadastrarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public Pagamento atualizarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public void excluirPagamento(Long id) {
        pagamentoRepository.deleteById(id);
    }

    public Pagamento buscarPagamento(Long id) {
        return pagamentoRepository.findById(id).orElse(null);
    }

    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }
}
