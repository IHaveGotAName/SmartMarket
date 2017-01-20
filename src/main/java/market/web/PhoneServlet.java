package market.web;

import market.dto.PhoneDTO;
import market.service.impl.PhoneService;

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
 * Created by ivegotaname on 14.12.16.
 */
@WebServlet("/PhoneServlet")
public class PhoneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        if (session.getAttribute("user") != null){


        PhoneService phoneService = new PhoneService();
        List<PhoneDTO> phoneDTOs = phoneService.findAll();
        req.getSession().setAttribute("phoneDTOs", phoneDTOs);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/telephoneIN.jsp");
        rd.forward(req, resp);} else {

            PhoneService phoneService = new PhoneService();
            List<PhoneDTO> phoneDTOs = phoneService.findAll();
            req.getSession().setAttribute("phoneDTOs", phoneDTOs);

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/telephone.jsp");
            rd.forward(req, resp);
        }


    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session = req.getSession(false);

        if (session.getAttribute("user") != null){


            PhoneService phoneService = new PhoneService();
            List<PhoneDTO> phoneDTOs = phoneService.findAll();
            req.getSession().setAttribute("phoneDTOs", phoneDTOs);

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/telephoneIN.jsp");
            rd.forward(req, resp);} else {

            PhoneService phoneService = new PhoneService();
            List<PhoneDTO> phoneDTOs = phoneService.findAll();
            req.getSession().setAttribute("phoneDTOs", phoneDTOs);

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/telephone.jsp");
            rd.forward(req, resp);
        }


    }
}
