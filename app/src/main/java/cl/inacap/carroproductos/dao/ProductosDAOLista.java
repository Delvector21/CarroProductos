package cl.inacap.carroproductos.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carroproductos.dto.Producto;

public class ProductosDAOLista  implements ProductosDAO{

    private List<Producto> productos = new ArrayList<>();

    //2. atributo de la misma clase, debe existir una instancia estatica de si misma
    private static ProductosDAOLista instancia;

    //Implementar un patron singleton
    //1.- costructor sea privado
    private ProductosDAOLista(){

        Producto p = new Producto();
        p.setNombre("Coca Cola Zero");
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book");
        p.setPrecio(1000);
        p.setFoto("https://www.espanolaonline.cl/wp-content/uploads/2020/03/Coca-Cola-Zero-15-L.png");
        productos.add(p);
        p = new Producto();
        p.setFoto("https://www.zancada.com/wp-content/imagenes//imagenescentella.jpg");
        p.setNombre("Centella");
        p.setPrecio(500);
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book");
        productos.add(p);
        p = new Producto();
        p.setFoto("https://www.distribucionmayorista.online/2939-thickbox_default/toblerone-50g.jpg");
        p.setNombre("Toblerone");
        p.setPrecio(2500);
        p.setDescripcion("Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book");
        productos.add(p);
    }

    //3. metodo estatico que permita acceso a la unica instancia
    public static ProductosDAOLista getInstance(){
        if(instancia == null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }

    @Override
    public List<Producto> getAll() {
        return productos;
    }

    @Override
    public Producto save(Producto p) {
        return null;
    }
}
