package modelo;


public class Productos {
    private int id;
    private String imagen;
    private String nombre;
    private String presentacion;
    private double precio;
    private String stock;
    private String estado;

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", imagen=" + imagen + ", nombre=" + nombre + ", presentacion=" + presentacion + ", precio=" + precio + ", stock=" + stock + ", estado=" + estado + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    

}
