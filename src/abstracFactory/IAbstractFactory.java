package abstractFactory;

public interface IAbstractFactory {
    IComputadora crearComputadora();
    ITablet crearTablet();
    IPhone crearMovil();
}
