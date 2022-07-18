package com.example.hotelproject.servlets;

import com.example.hotelproject.models.Room;
import com.example.hotelproject.service.ReservatonService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "AddReservationServlet", value = "/reservation/addReservation")
public class AddReservationServlet extends HttpServlet {

    private final ReservatonService service = ReservatonService.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            long price = Long.parseLong(
                    request.getParameter
                    ("roomPrice"));

            LocalDate enterDate = request.getParameter("enterDate") == null ? null :
                    LocalDate.parse
                    (request.getParameter
                    ("enterDate"));
            LocalDate exitDate = request.getParameter("exitDate") == null ? null :
                    LocalDate.parse
                    (request.getParameter
                    ("exitDate"));

            long id = service.insert
                    (new Room(price,enterDate,exitDate));

            response.sendRedirect
                    (request.getContextPath()+
                    "/reservation/getOneReservation.jsp?id="+id);

        }
        catch (NumberFormatException ex){
            request.getRequestDispatcher
                    ("/reservation/addReservation.jsp")
                    .forward(request,response);
        }
    }
}
