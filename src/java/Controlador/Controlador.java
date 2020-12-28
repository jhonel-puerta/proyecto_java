/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.personaDAO;

/**
 *
 * @author cieli
 */
public class Controlador extends HttpServlet {
    String listar="vistas/listar.jsp";
    String add = "vistas/add.jsp";
    String edit = "vistas/edit.jsp";
    Persona persona = new Persona();
    personaDAO dao = new personaDAO();
    
    
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
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
        String link = "";
        String action = request.getParameter("accion");
        
        if(action.equals("listar")){
            link=listar;
        }else if(action.equals("add")){
            link = add;
        }else if(action.equals("Agregar")){
            String name = request.getParameter("nombres");
            String apellidos = request.getParameter("apellidos");
            String nota1 = request.getParameter("nota1");
            String nota2 = request.getParameter("nota2");
            float promedio = (Float.parseFloat(nota1)+Float.parseFloat(nota2));
            persona.setNombre(name);
            persona.setApellidos(apellidos);
            persona.setNota1(Float.parseFloat(nota1));
            persona.setNota2(Float.parseFloat(nota2));
            persona.setPromedio(promedio/2);
            dao.add(persona);
            link = listar;
            
        }else if(action.equals("editar")){
            request.setAttribute("id", request.getParameter("id"));
            link = edit;
        }else if(action.equals("Actualizar")){
            int id=Integer.parseInt(request.getParameter("txtid"));
            String name = request.getParameter("nombres");
            String apellidos = request.getParameter("apellidos");
            String nota1 = request.getParameter("nota1");
            String nota2 = request.getParameter("nota2");
            float promedio = (Float.parseFloat(nota1)+Float.parseFloat(nota2));
            persona.setId(id);
            persona.setNombre(name);
            persona.setApellidos(apellidos);
            persona.setNota1(Float.parseFloat(nota1));
            persona.setNota2(Float.parseFloat(nota2));
            persona.setPromedio(promedio/2);
            dao.edit(persona);
            link = listar;
        }else if(action.equals("eliminar")){
            int id = Integer.parseInt(request.getParameter("id"));
            persona.setId(id);
            dao.eliminar(id);
            link = listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(link);
        vista.forward(request, response);
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

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
