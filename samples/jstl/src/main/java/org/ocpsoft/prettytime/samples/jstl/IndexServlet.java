package org.ocpsoft.prettytime.samples.jstl;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet
{

    private static final long serialVersionUID = 3698098463023956514L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setAttribute("myDate", new Date());
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

}
