public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Leche",55555,89);

        MovimientoInventario entrada = new MovimientoInventario(p1,6,"entrada");
        entrada.movimiento();
        System.out.println(entrada.mostrarDetalles());

        MovimientoInventario salida = new MovimientoInventario(p1,20,"salida");
        salida.movimiento();
        System.out.println(salida.mostrarDetalles());
    }

}
