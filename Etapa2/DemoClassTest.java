/**
 *
 * @author akrehn
 */
public class DemoClassTest {

    public static void main(String[] args) {

        Pedido p = new Pedido();
        p.setStrategy(PacStrategy.getInstancia());
        System.out.println(p.getValorTotal());
        p.setStrategy(SedexStrategy.getInstancia());
        System.out.println(p.getValorTotal());
        p.setStrategy(RetiradaLocalStrategy.getInstancia());
        System.out.println(p.getValorTotal());
        p.setStrategy(MotoboyStrategy.getInstancia());
        System.out.println(p.getValorTotal());

    }
}
