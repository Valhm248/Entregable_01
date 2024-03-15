/*Crear un sistema para manejar el inventario de un almacén, aplicando
encapsulamiento y herencia, y utilizando ArrayList para almacenar los productos.

Principios de POO aplicados: Encapsulamiento, Herencia.

Requisitos:

Clase Producto: Base para todos los productos, con propiedades como id, nombre, y
precio. Implementa getters y setters para aplicar el encapsulamiento.
Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
categoria o marca.
Clase Inventario: Utiliza un ArrayList de objetos Producto para gestionar el inventario.
Implementa métodos para añadir, eliminar, y listar productos, además de buscar productos
por nombre o categoría.*/

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
