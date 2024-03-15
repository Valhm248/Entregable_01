
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        Inventario objInventario = new Inventario();

        Producto pro1 = new Producto(1, "Lápiz", 2000);
        Producto pro2 = new Producto(1, "Cuaderno", 4000);

        objInventario.agregarProducto(pro1);
        objInventario.agregarProducto(pro2);

        System.out.println("Lista de productos");
        objInventario.ListarProductos();

        objInventario.eliminarProducto();
        System.out.println("Lista después de eliminar producto");
        objInventario.ListarProductos();

        System.out.println(objInventario.buscarProducto("Cuaderno"));
    }
}