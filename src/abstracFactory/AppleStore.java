package abstractFactory;
/**
 * AppleStore.java describe los métodos de la interfaz IAbstractFactory. Muestra que debe hacer cada método.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class AppleStore implements IAbstractFactory, IStore{
    @Override
    public IComputadora crearComputadora() {
        return new MacBookPro();
    }

    @Override
    public ITablet crearTablet() {
        return new IPad();
    }

    @Override
    public IPhone crearMovil() {
        return new IPhoneXS();
    }

    @Override
    public String mensaje(){
        return "Saludos desde la clase AppleStore.";
    }
}
