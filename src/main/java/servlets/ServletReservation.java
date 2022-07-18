package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "ServletReservation", value = "/ServletReservation/add")
public class ServletReservation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("ServletReservation/add.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");

        String lastName = request.getParameter("lastName");



        try {
            double price = Double.parseDouble( request.getParameter("price") );

            // request.getRequestDispatcher( "/product/getOne.jsp?id=" + id ).forward(request, response); // continue la creation de la reponse autre part
        }
        catch (NumberFormatException ex){
            request.getRequestDispatcher("/product/add.jsp" ).forward(request, response);
        }

    }
}
