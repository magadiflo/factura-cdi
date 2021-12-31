package com.magadiflo.configs;

import com.magadiflo.models.LineaFactura;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ProducerResources {

    @Produces
    private List<LineaFactura> detalleFactura() {
        List<LineaFactura> detalle = new ArrayList<>();
        LineaFactura lf1 = new LineaFactura();
        lf1.setNombreProducto("Monitor LG LCD 24");
        lf1.setPrecio(250);
        lf1.setCantidad(2);

        LineaFactura lf2 = new LineaFactura();
        lf2.setNombreProducto("Notebook Asus");
        lf2.setPrecio(500);
        lf2.setCantidad(1);

        LineaFactura lf3 = new LineaFactura();
        lf3.setNombreProducto("Impresora HP Multifuncional");
        lf3.setPrecio(80);
        lf3.setCantidad(3);

        detalle.add(lf1);
        detalle.add(lf2);
        detalle.add(lf3);
        return detalle;
    }

}
