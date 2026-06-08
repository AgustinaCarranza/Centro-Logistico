public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Leche",55555,89);
        Producto p2 = new Producto("Arroz", 90988980, 123);

        //guarda los datos en el diccionario
        DiccionarioProductos diccionario = new DiccionarioProductos(10);
        diccionario.insertar(p1.getCodigo(),p1);
        diccionario.insertar(p2.getCodigo(), p2);

        //entrada y salida
        MovimientoInventario entrada = new MovimientoInventario(p1,6,"entrada");
        entrada.movimiento();
        System.out.println(entrada.mostrarDetalles());

        MovimientoInventario salida = new MovimientoInventario(p1,20,"salida");
        salida.movimiento();
        System.out.println(salida.mostrarDetalles());

        //nos permite buscar por codigo un producto
        Producto buscado = diccionario.recuperar(90988980);
        System.out.println("Encontrado " + buscado.getNombre());
    }

}
