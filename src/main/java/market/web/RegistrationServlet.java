package market.web;

import market.Utilites.Hex;
import market.dto.UserDTO;
import market.entity.UserRole;
import market.entity.UserSex;
import market.service.impl.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by ivegotaname on 09.12.16.
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("firstname");
        String surname = req.getParameter("secondname");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        password = Hex.hexSHA512(password);
        String birthday = req.getParameter("birthday");
        String email = req.getParameter("email");
        String sex = req.getParameter("sex");


        UserService userService = new UserService();
        if (!userService.checkLoginToEquals(login)) {
            UserDTO userDTO = new UserDTO();
            if (sex == "male") {
                userDTO.setSex(UserSex.MALE);
            } else {
                userDTO.setSex(UserSex.FEMALE);
            }
            userDTO.setFirstName(name);
            userDTO.setSecondName(surname);
            userDTO.setLogin(login);
            userDTO.setPassword(password);
            userDTO.setBirthday(birthday);
            userDTO.setEmail(email);
            userDTO.setRole(UserRole.USER);
            userService.create(userDTO);

            resp.sendRedirect("/html/home.jsp");

        }else {
            PrintWriter out = resp.getWriter();
            out.println("<font color=\"red\">Login is occupied!</font>");
            RequestDispatcher rs = req.getRequestDispatcher("/html/registration.jsp");
            rs.include(req, resp);
        }
    }
}