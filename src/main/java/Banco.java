import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Banco {
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public Banco(Cliente cliente) {
        this.clientes = new ArrayList<>();
        this.clientes.add(cliente);
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
