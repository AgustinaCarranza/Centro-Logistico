public class PilaMovimientos {
    private NodoMovimiento tope;

    public PilaMovimientos() {
        tope = null;
    }

    public void apilar(MovimientoInventario mov) {
        NodoMovimiento nuevo = new NodoMovimiento(mov);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public MovimientoInventario desapilar() {

        if (tope == null) {
            return null;
        }

        MovimientoInventario mov = tope.dato;
        tope = tope.siguiente;

        return mov;
    }

    public boolean estaVacia() {
        return tope == null;
    }
}
