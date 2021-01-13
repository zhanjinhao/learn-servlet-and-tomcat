package so.controller.dispatch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @Author ISJINHAO
 * @Date 2021/1/11 20:08
 */
@WebServlet("/dispatch/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("dispatch", "RedirectServlet");

        resp.sendRedirect("/dispatch/finalResponse");

    }

}
