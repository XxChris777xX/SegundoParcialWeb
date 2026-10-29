package org.gerdoc.servlet;

import org.gerdoc.model.Login;
import org.gerdoc.service.LoginService;
import org.gerdoc.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
    @Serial
    private static final long serialVersionUID = 1L;
    private final LoginService loginService = new LoginServiceImpl( );

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String accion = req.getParameter("accion");
        if ("delete".equals(accion))
        {
            Long id = Long.parseLong(req.getParameter("id"));
            loginService.deleteById(id);
            resp.sendRedirect("Logins.jsp");
            return;
        }
        String nombre = req.getParameter("nombre" );
        String pasword = req.getParameter("pasword" );
        Integer edad = Integer.parseInt( req.getParameter("edad" ) );



        Login login = Login.builder( )
                .nombre( nombre )
                .pasword( pasword )
                .edad( edad )

                .build();
        if( "update".equals(accion) )
        {
            loginService.save( login );
        }
        resp.sendRedirect("Logins.jsp");
    }
}
