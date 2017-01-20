package market.web;

import market.Utilites.Hex;
import market.dto.UserDTO;
import market.entity.UserRole;
import market.service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * Created by ivegotaname on 09.12.16.
 */
@WebServlet("/AuthorisationServlet")
public class AuthorisationServlet extends HttpServlet {


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        password = Hex.hexSHA512(password);
//        User user = new UserDAO().findByLoginPassword(login, password);
        UserDTO userDTO = new UserDTO();
        userDTO.setLogin(login);
        userDTO.setPassword(password);
        UserService userService = new UserService();
        userDTO = userService.findUserByLoginAndPassword(userDTO);
            if (userDTO != null && userDTO.getRole() == UserRole.ADMIN) {
                HttpSession httpSession = req.getSession();
                httpSession.setAttribute("user", userDTO);
                resp.sendRedirect("/AdminServlet");

            } else if (userDTO != null) {
                HttpSession httpSession = req.getSession();
                httpSession.setAttribute("user", userDTO);
                resp.sendRedirect("/html/mainIN.jsp");
            } else {
                resp.sendRedirect("/html/home.jsp");

            }
        }




    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/home.jsp");
        rd.forward(req, resp);
    }
}
