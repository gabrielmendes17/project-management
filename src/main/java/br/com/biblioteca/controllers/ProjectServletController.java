package br.com.biblioteca.controllers;

import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "Servlet" , urlPatterns = {"/projectServletController"})
public class ProjectServletController extends HttpServlet {

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("Name");
        String initialDateString = request.getParameter("InitialDate");
        Date initialDate = new SimpleDateFormat("yyyy-MM-dd").parse(initialDateString);
        String responsibleManager = request.getParameter("ResponsibleManager");
        String realEndDateString = request.getParameter("RealEndDate");
        Date realEndDate = new SimpleDateFormat("yyyy-MM-dd").parse(realEndDateString);
        String totalBudget = request.getParameter("TotalBudget");
        String description = request.getParameter("Description");
        String status = request.getParameter("Status");


        

        System.out.println(status);
    }
}
