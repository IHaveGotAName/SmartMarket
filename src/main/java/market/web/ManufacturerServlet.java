package market.web;

import market.dto.ManufacturerDTO;
import market.service.impl.ManufacturerService;

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
 * Created by ivegotaname on 15.12.16.
 */
@WebServlet("/ManufacturerServlet")
public class ManufacturerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session.getAttribute("user") != null){

        ManufacturerService manufacturerService = new ManufacturerService();
        List<ManufacturerDTO> manufacturerDTOs = manufacturerService.findAll();
        req.getSession().setAttribute("manufacturerDTOs", manufacturerDTOs);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/manufacturerIN.jsp");
        rd.forward(req, resp);} else {
            ManufacturerService manufacturerService = new ManufacturerService();
            List<ManufacturerDTO> manufacturerDTOs = manufacturerService.findAll();
            req.getSession().setAttribute("manufacturerDTOs", manufacturerDTOs);

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/manufacturer.jsp");
            rd.forward(req, resp);
        }


    }
}
