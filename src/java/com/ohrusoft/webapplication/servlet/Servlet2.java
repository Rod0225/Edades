/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohrusoft.webapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "Servlet2", urlPatterns = {"/Servlet2"})
public class Servlet2 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String par1= null;
            String par2=null;
            String par3=null;
            String par4=null;
            String par5=null;
            String old1=null;
            String old2=null;
            String old3=null;
            String old4=null;
            String old5=null;
            par1=request.getParameter("para");
            par2=request.getParameter("para3");
            par3=request.getParameter("para4");
            par4=request.getParameter("para5");
            par5=request.getParameter("para6");
            old1=request.getParameter("year");
            old2=request.getParameter("year1");
            old3=request.getParameter("year2");
            old4=request.getParameter("year3");
            old5=request.getParameter("year4");
            int edad1=Integer.parseInt(old1);
            int edad2=Integer.parseInt(old2);
            int edad3=Integer.parseInt(old3);
            int edad4=Integer.parseInt(old4);
            int edad5=Integer.parseInt(old5);
            String image2=("descarga.jfif");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> De mayor a menor " + "</h1>");
            if (edad1>edad2){
                if(edad1>edad3){
                    if(edad1>edad4){
                        if (edad1>edad5){
                            out.println("<ul>");
                            out.println("<li><h2>Mi papá es "+par1+" y tiene "+edad1+" años"+"</h2></li>");
                            out.println("<li><h2>Mi mamá es "+par2+" y tiene "+edad2+" años"+"</h2></li>");
                            out.println("<li><h2>Mi hermana mayor es "+par3+" y tiene "+edad3+" años"+"</h2></li>");
                            out.println("<li><h2>Mi hermano mayor es "+par4+" y tiene "+edad4+" años"+"</h2></li>");
                            out.println("<li><h2>Yo soy "+par5+" y tengo "+edad5+" años"+"</h2></li>");
                            out.println("</ul>");
                        }
                    }
                }
            }
            out.println("<h1> De menor a mayor " + "</h1>");
            if(edad5<edad4)
                if(edad5<edad3)
                    if (edad5<edad2)
                        if (edad5<edad1){
                            out.println("<ul>");
                            out.println("<li><h2>Yo soy "+par5+" y tengo "+edad5+" años"+"</h2></li>");
                            out.println("<li><h2>Mi hermano mayor es "+par4+" y tiene "+edad4+" años"+"</h2></li>");
                            out.println("<li><h2>Mi hermana mayor es "+par3+" y tiene "+edad3+" años"+"</h2></li>");
                            out.println("<li><h2>Mi mamá es "+par2+" y tiene "+edad2+" años"+"</h2></li>");
                            out.println("<li><h2>Mi papá es "+par1+" y tiene "+edad1+" años"+"</h2></li>");
                            out.println("</ul>");
                        }
            out.println(String.format("<center><img alt =\"\" src=\"%s\" /></center>", image2));
            out.println("</body>");
            out.println("</html>");
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
