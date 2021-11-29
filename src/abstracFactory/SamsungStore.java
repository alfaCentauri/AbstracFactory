package abstractFactory;
/**
 * SamsungStore.java describe los métodos de la interfaz IAbstractFactory. Muestra que debe hacer cada método.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class SamsungStore implements IAbstractFactory, IStore{
    @Override
    public IComputadora crearComputadora() {
        return new Notebook9Pro();
    }

    @Override
    public ITablet crearTablet() {
        return new TabS10();
    }

    @Override
    public IPhone crearMovil() {
        return new GalaxyS3();
    }

    @Override
    public String mensaje(){
        return "Saludos desde la clase SamsungStore.";
    }
}
