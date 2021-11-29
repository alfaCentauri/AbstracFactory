package abstractFactory;
/**
 * AppleStore.java describe los métodos de la interfaz IAbstractFactory. Muestra que debe hacer cada método.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class AppleStore implements IAbstractFactory, IStore{
    /**
     * Este método cumple con el principio SOLID. El objeto que regresa es de tipo MacBookPro y puede ser sustituido por
     * su interfaz IComputadora.
     * @return Regresa un objeto hijo de la interfaz IComputadora.
     */
    @Override
    public IComputadora crearComputadora() {
        return new MacBookPro();
    }

    /**
     * Permite instanciar un nuevo IPad.
     * @return Regresa un objeto IPad.
     */
    @Override
    public ITablet crearTablet() {
        return new IPad();
    }

    /**
     * Permite instanciar un nuevo IPhone.
     * @return Regresa un objeto IPhoneXS.
     */
    @Override
    public IPhone crearMovil() {
        return new IPhoneXS();
    }

    /**
     * Permite generar un mensaje.
     * @return Regresa una cadena de caracteres.
     */
    @Override
    public String mensaje(){
        return "Saludos desde la clase AppleStore.";
    }
}
