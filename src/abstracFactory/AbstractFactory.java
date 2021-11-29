package abstractFactory;
/**
 * Implementa el método main para la ejecución del programa.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class AbstractFactory {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SamsungStore samsung = new SamsungStore();
        AppleStore apple = new AppleStore();

        IComputadora mac = apple.crearComputadora();
        ITablet ipad = apple.crearTablet();
        IPhone smartPhone = apple.crearMovil();

        IComputadora pc = samsung.crearComputadora();
        ITablet tabletSamsung = samsung.crearTablet();
        IPhone galaxy = samsung.crearMovil();

        System.out.println("Ejemplo de aplicación del patroncreacional Abstract Factory.");
        System.out.println(apple.mensaje());
        System.out.println(samsung.mensaje());
    }
}
