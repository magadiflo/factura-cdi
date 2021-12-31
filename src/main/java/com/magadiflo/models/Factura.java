package com.magadiflo.models;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

/***
 * @Named("factura"), Por defecto tendría el nombre de la clase en minúscula e
 * iría de esta manera @Named, pero se agregó explícitamente ("factura")
 * para saber que puede tener cualquier otro nombre
 */
@RequestScoped
@Named("factura")
public class Factura {

    private Cliente cliente;

    private Integer numeroFactura;
    private String descripcion;

    @Inject
    private List<LineaFactura> lineasFactura;

    public Factura() {}

    @PostConstruct
    public void inicializar() {
        this.numeroFactura = 101478523;
        this.descripcion = "Comprobante de pago oficial";
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Inject
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<LineaFactura> getLineasFactura() {
        return lineasFactura;
    }

    public void setLineasFactura(List<LineaFactura> lineasFactura) {
        this.lineasFactura = lineasFactura;
    }
}
