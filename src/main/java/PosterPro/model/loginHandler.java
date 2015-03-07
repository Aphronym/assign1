/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PosterPro.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ronald
 */
@WebServlet(name = "loginHandler", urlPatterns = {"/loginHandler"})
public class loginHandler extends HttpServlet {

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
        
        String userName = request.getParameter("user");
        String passWord = request.getParameter("pass");
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/var/lib/openshift/54f12fc7e0b8cd301d0001c1/app-root/data/user.txt"));
            
            String line;
            
            while ((line = reader.readLine()) != null) {
                String credentials = line;
                
                if (credentials.equals(userName + passWord)) {
                    request.getSession().setAttribute("name", userName);
                    request.getRequestDispatcher("AddPost.jsp").forward(request, response);
                }
                else if (credentials.equals(null)) {
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("/var/lib/openshift/54f12fc7e0b8cd301d0001c1/app-root/data/user.txt", true));
        
                        writer.write(userName + passWord + "\n");
                        writer.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                }
                else
                {
                    request.getRequestDispatcher("badLogin.jsp").forward(request, response);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
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
