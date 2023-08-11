/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.miempresa.webapp03tarea;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jhons
 */
@WebServlet(name = "ServletMultiplicar", urlPatterns = {"/ServletMultiplicar"})
public class ServletMultiplicar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String num = request.getParameter("num");
            int cant = Integer.parseInt(num);

            out.println("<link rel=\"stylesheet\" \n"
                    + "href=\"webjars/bootstrap/5.1.0/css/bootstrap.min.css\" type=\"text/css\" />"
                    + "<br><br><h3 style=\"text-align:center\">Las " + cant + " primeras tablas de multiplicar son:</h3><br>"
                    + "<div class=\"row p-4 text-center\">\n");
            for (int i=1; i<cant+1;i++){
                out.println( "<div class=\"col-2 container p-4 text-center\" >"
                    + "<div class=\"card text-light bg-success\" >\n"
                    + "  <div class=\"card-body\">\n"
                    + "    <h5 class=\"card-title\">Tabla del "+i+"</h5>\n"
                    + "  </div>\n"
                    + "  <ul class=\"list-group list-group-flush\">\n");
                for (int x=0; x<13;x++){
                    out.println("<li class=\"list-group-item\">"+x+" * "+i+" = "+x*i+"</li>");
                }                  
                out.println("</ul>\n"
                    + "</div>"
                    + "</div>\n");
            }                        
            out.println("</div>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
