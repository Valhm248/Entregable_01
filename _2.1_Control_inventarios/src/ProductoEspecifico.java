public class ProductoEspecifico extends Producto{

    private String marca;
    private String categoria;

    public ProductoEspecifico(int id, String nombre, double precio, String categoria, String marca){
        super(id,nombre,precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ProductoEspecifico{" +
                "marca='" + marca + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
