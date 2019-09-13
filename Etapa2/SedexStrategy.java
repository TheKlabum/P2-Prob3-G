/**
 *
 * @author akrehn
 */
public class SedexStrategy implements EntregaStrategy {

    private static SedexStrategy instancia;

    public static SedexStrategy getInstancia() {
        if (instancia == null) {
            instancia = new SedexStrategy();
        }
        return instancia;
    }

    private SedexStrategy() {

    }

    @Override
    public double getValor(Pedido pedido) {
        double massa = pedido.getMassa();
        if (massa < 500) {
            return 12.5;
        } else if (massa < 750) {
            return 20;
        } else if (massa < 1200) {
            return 30;
        } else if (massa < 2000) {
            return 45;
        } else {
            return 45 + (massa - 2000) * 1.5;
        }
    }

}




