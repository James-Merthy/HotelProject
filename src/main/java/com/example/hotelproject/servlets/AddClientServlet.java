package com.example.hotelproject.servlets;

import com.example.hotelproject.models.Client;
import com.example.hotelproject.service.ReservatonService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "AddClientServlet", value = "/reservation/addClient")
public class AddClientServlet extends HttpServlet {
    private final ReservatonService service = ReservatonService.getInstance();
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
            LocalDate birthDate = request.getParameter("birthDate") == null ? null :
                    LocalDate.parse
                    (request.getParameter
                    ("birthDate"));

            long id = service.insertClient
                    (new Client(firstName,lastName,birthDate));

            response.sendRedirect
                    (request.getContextPath()+
                    "/reservation/getOneClient.jsp?id="+id);
        }
        catch (NumberFormatException ex){
            request.getRequestDispatcher
                    ("/reservation/addClient.jsp")
                    .forward(request,response);
        }
    }
}
