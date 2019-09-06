/**
 *
 * @author agern
 */
public class ItemPedido {
    
    private Produto produto;
    private int quantidade;

    protected ItemPedido(Produto produto, int quantidade) {
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto inválido");
        }
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        this.quantidade = quantidade;
    }
    
    
    
}
