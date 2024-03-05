import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recargas")
public class RecargaController {
    private RecargaService recargaService;

    public RecargaController(RecargaService recargaService) {
        this.recargaService = recargaService;
    }

    @PostMapping
    public Recarga realizarRecarga(@RequestBody Recarga recarga) {
        return recargaService.realizarRecarga(recarga);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Recarga> listarRecargasDoCliente(@PathVariable Long clienteId) {
        return recargaService.listarRecargasDoCliente(clienteId);
    }
}
