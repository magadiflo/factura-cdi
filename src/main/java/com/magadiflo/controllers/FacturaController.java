package com.magadiflo.controllers;


import com.magadiflo.models.Factura;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({"/index.html"})
public class FacturaController extends HttpServlet {

    @Inject
    @Named("factura")
    private Factura factura;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("factura", factura);
        getServletContext().getRequestDispatcher("/factura.jsp").forward(req, resp);
    }
}
