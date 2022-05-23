package controlador;

import dao.ProductoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Productos;

@Named(value = "productoC")
@SessionScoped
public class ProductoC implements Serializable {

    private Productos pro;
    private ProductoImpl dao;
    private List<Productos> listadoPro;

    public ProductoC() {
        pro = new Productos();
        dao = new ProductoImpl();
        listadoPro = new ArrayList<>();
    }

    public void listar() {
        try {
            listadoPro = dao.listar();
        } catch (Exception e) {
            System.out.println("Error en LISTAR ProductoC: " + e.getMessage());
        }
    }

    public Productos getPro() {
        return pro;
    }

    public void setPro(Productos pro) {
        this.pro = pro;
    }

    public ProductoImpl getDao() {
        return dao;
    }

    public void setDao(ProductoImpl dao) {
        this.dao = dao;
    }

    public List<Productos> getListadoPro() {
        return listadoPro;
    }

    public void setListadoPro(List<Productos> listadoPro) {
        this.listadoPro = listadoPro;
    }
}
