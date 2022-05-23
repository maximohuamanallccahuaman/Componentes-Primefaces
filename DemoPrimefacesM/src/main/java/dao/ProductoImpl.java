package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Productos;

public class ProductoImpl extends Conexion implements ICRUD<Productos> {

    @Override
    public List<Productos> listar() throws Exception {
        List<Productos> listado = null;
        Productos pro;
        String sql = "SELECT * FROM PRODUCTO WHERE ESTPRO = 'A' ORDER BY IDPRO DESC";
        try {
            listado = new ArrayList();
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                pro = new Productos();
                pro.setId(rs.getInt("IDPRO"));
                pro.setImagen(rs.getString("IMGPROD"));
                pro.setNombre(rs.getString("NOMPRO"));
                pro.setPresentacion(rs.getString("PRESPRO"));
                pro.setPrecio(rs.getDouble("PRECPRO"));
                pro.setStock(rs.getString("STOCPRO"));
                listado.add(pro);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error en listar ProductoImpl: " + e.getMessage());
        } finally {
            this.cerrar();
        }
        return listado;
    }

    @Override
    public void registrar(Productos generic) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Productos generic) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Productos generic) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
