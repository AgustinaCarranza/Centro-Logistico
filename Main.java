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

        //guarda los movimientos de inventario
        PilaMovimientos pila = new PilaMovimientos();

        pila.apilar(entrada);
        pila.apilar(salida);

        MovimientoInventario ultimo = pila.desapilar();

        System.out.println("Último " + ultimo.mostrarDetalles());

        //representa un pedido compuesto por uno o varios productos
        Pedido pedido = new Pedido(1, 5);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        //administra los pedidos en orden de llegada mediante una cola circular
        ColaCircularPedidos cola = new ColaCircularPedidos(5);

        cola.encolar(pedido);

        Pedido atendido = cola.desencolar();

        System.out.println("Pedido atendido: " + atendido.getId());
        
    }

}
