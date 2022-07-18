package com.example.hotelproject.servlets;

import com.example.hotelproject.models.Room;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "AddReservationServlet", value = "/reservation/addReservation")
public class AddReservationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            String firstName =
                    request.getParameter
                    ("firstName");
            String lastName =
                    request.getParameter
                    ("lastName");
            LocalDate birthDate =
                    LocalDate.parse
                    (request.getParameter
                    ("birthDate"));

            Long roomPrice =
                    Long.parseLong(
                    request.getParameter
                    ("roomPrice"));

            LocalDate enterDat =
                    LocalDate.parse
                    (request.getParameter
                    ("enterDate"));

            LocalDate exitDate =
                    LocalDate.parse
                    (request.getParameter
                    ("exitDate"));

        }
        catch (NumberFormatException ex){
            request.getRequestDispatcher
                    ("/reservation/addReservation.jsp")
                    .forward(request,response);
        }
    }
}
