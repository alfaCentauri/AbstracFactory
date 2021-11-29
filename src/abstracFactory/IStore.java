package abstractFactory;
/**
 * Indica los métodos que son comunes en los objetos que lo implementan.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public interface IStore {
    /** Es para indicar en consola un mensaje informativo, el contenido del mensaje varia
     * dependiendo de la clase. **/
    public String mensaje();
}
