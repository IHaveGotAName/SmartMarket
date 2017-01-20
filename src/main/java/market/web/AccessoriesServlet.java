package market.web;

import market.dto.AccessoriesDTO;
import market.service.impl.AccessoriesService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by ivegotaname on 25.12.16.
 */
@WebServlet("/AccessoriesServlet")
public class AccessoriesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        if (session.getAttribute("user") != null){

        AccessoriesService accessoriesService = new AccessoriesService();
        List<AccessoriesDTO> accessoriesDTOs = accessoriesService.findAll();
        req.getSession().setAttribute("accessoriesDTOs", accessoriesDTOs);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/accessoriesIN.jsp");
        rd.forward(req, resp);} else {
            AccessoriesService accessoriesService = new AccessoriesService();
            List<AccessoriesDTO> accessoriesDTOs = accessoriesService.findAll();
            req.getSession().setAttribute("accessoriesDTOs", accessoriesDTOs);

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/accessories.jsp");
            rd.forward(req,resp);
        }


    }

}
