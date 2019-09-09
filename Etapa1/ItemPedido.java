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

    protected double getValorItem() {
        double valor;
        valor = produto.getValor() * this.quantidade;
        return valor;
    }
    
    protected Produto getProduto() {
        return produto;
    }

    protected void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto inválido");
        }
        this.produto = produto;
    }

    protected int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        this.quantidade = quantidade;
    }    
}
