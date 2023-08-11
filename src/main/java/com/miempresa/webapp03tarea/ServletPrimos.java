/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.miempresa.webapp03tarea;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jhons
 */
@WebServlet(name = "ServletPrimos", urlPatterns = {"/ServletPrimos"})
public class ServletPrimos extends HttpServlet {

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
            out.print("<link rel=\"stylesheet\" \n"
                    + "href=\"webjars/bootstrap/5.1.0/css/bootstrap.min.css\" type=\"text/css\" />");
            String num = request.getParameter("num");
            int cant = Integer.parseInt(num);
            int n = 3;
            ArrayList<Integer> primos = new ArrayList<Integer>();
            primos.add(2);
            out.println("<div class=\"row\">\n"
                    + "            <div class=\"container col-5\">"
                    + "<br><br><h3 style=\"text-align:center mt-20\">Los " + cant + " primeros números primos son:</h3><br>"
                    + "<div class=\"alert alert-primary text-center\" role=\"alert\">\n");
            
            while(primos.size()<cant){
                for(int i=2;i<=n-1;i++){
                    if (n%i==0){
                        break;
                    }else if(i==n-1){
                        primos.add(n);
                    }
                }
                n = n+1;
            }
            out.println(primos);
            out.println("</div>"
                    + "</div>\n"
                    + "        </div>");
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
