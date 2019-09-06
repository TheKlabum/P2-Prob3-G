
import java.util.Date;

/**
 *
 * @author agern
 */
public class Pedido {
    
    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número do pedido inválido");
        }
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Endereço do cliente inválido");
        }
        this.endereco = endereco;
    }
    
    
}
