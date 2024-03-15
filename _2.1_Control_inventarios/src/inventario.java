import java.util.ArrayList;

public class inventario {
    private ArrayList<Producto> listaProductos;

    public inventario() {
        this.listaProductos = new ArrayList<>();
    }


    //Métodos

    public void agreagarProducto(Producto producto){
        this.listaProductos.add(producto);

    }

    public boolean eliminarProducto(int id){
        return listaProductos.removeIf(producto -> producto.getId() == id);
    }

    public Producto buscarPorNombre(String nombreBuscar){
        for (Producto objProducto: this.listaProductos){
            if(objProducto.getNombre().equalsIgnoreCase(nombreBuscar) ){
                return objProducto;
            }
        }
        return null;
    }

    public void ListarProductos(){
        for (Producto producto : this.listaProductos){
            System.out.println("id: " + producto.getId() + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio());
        }

    }
}
