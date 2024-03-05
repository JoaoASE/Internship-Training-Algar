import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    private PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public Pagamento cadastrarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.cadastrarPagamento(pagamento);
    }

    @PutMapping("/{id}")
    public Pagamento atualizarPagamento(@PathVariable Long id, @RequestBody Pagamento pagamento) {
        pagamento.setId(id);
        return pagamentoService.atualizarPagamento(pagamento);
    }

    @DeleteMapping("/{id}")
    public void excluirPagamento(@PathVariable Long id) {
        pagamentoService.excluirPagamento(id);
    }

    @GetMapping("/{id}")
    public Pagamento buscarPagamento(@PathVariable Long id) {
        return pagamentoService.buscarPagamento(id);
    }

    @GetMapping
    public List<Pagamento> listarPagamentos() {
        return pagamentoService.listarPagamentos();
    }
}
