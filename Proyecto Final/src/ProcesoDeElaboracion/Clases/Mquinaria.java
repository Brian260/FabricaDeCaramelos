package ProcesoDeElaboracion.Clases;

import Controlers.BaseDatos;
import Controlers.GenerarID;
import VentaDeCaramelos.Clases.ProductosDeConfituras;

import java.io.Serializable;

public class Mquinaria implements Serializable {
    private MateriaPrima materiaPrima;

    private String tipoDeCaramelo;

    public Mquinaria() {
    }

    public Mquinaria(MateriaPrima materiaPrima, String tipoDeCaramelo) {
        this.materiaPrima = materiaPrima;
        this.tipoDeCaramelo=tipoDeCaramelo;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public ProductosDeConfituras elaborarDulces(){
        ProductosDeConfituras productosDeConfituras ;
        if (tipoDeCaramelo=="Chocolate" && materiaPrima.getCantidad() >= 10){
            productosDeConfituras = new ProductosDeConfituras("Chocolate", new GenerarID().generarRandomID(), materiaPrima.getCantidad()/10);
        } else if (tipoDeCaramelo=="Chicle" && materiaPrima.getCantidad() >= 5) {
            productosDeConfituras = new ProductosDeConfituras("Chicle", new GenerarID().generarRandomID(), materiaPrima.getCantidad()/5);
        } else if (tipoDeCaramelo=="M&M´S" && materiaPrima.getCantidad() >= 7) {
            productosDeConfituras = new ProductosDeConfituras("M&M´S", new GenerarID().generarRandomID(), materiaPrima.getCantidad()/7);
        }else if (tipoDeCaramelo=="Gomitas" && materiaPrima.getCantidad() >= 12){
            productosDeConfituras = new ProductosDeConfituras("Gomitas", new GenerarID().generarRandomID(), materiaPrima.getCantidad()/7);
            //"Chocolate", "Chicle", "M&M´S", "Gomitas"
        }else {
            productosDeConfituras = new ProductosDeConfituras();
        }
        new BaseDatos().guardarDatos(productosDeConfituras);
        return productosDeConfituras;
    }
}
