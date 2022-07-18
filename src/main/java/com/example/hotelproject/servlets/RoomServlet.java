package com.example.hotelproject.servlets;

import com.example.hotelproject.service.ReservatonService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "RoomServlet", value = "/RoomServlet")
public class RoomServlet extends HttpServlet {


    private final ReservatonService pService = ReservatonService.getInstance();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        int id = 0;
//        try{
//            id = Integer.parseInt(request.getParameter("id"));
//            String firstName = request.getParameter("name");
//            String lastName = request.getParameter("name");
//            LocalDate date = request.getParameter("name");
//
//            double price = Double.parseDouble(request.getParameter("price"));
//
//        }catch (Exception ex){
//            response.sendError(404);
//        }

    }
}
