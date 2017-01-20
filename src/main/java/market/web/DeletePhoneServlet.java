package market.web;

import market.dto.PhoneDTO;
import market.service.impl.PhoneService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ivegotaname on 15.12.16.
 */
@WebServlet("/DeletePhoneServlet")
public class DeletePhoneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Integer idPhone = Integer.valueOf(req.getParameter("idPhoneDelete"));
            PhoneService phoneService = new PhoneService();
            PhoneDTO phoneDTO = phoneService.findById(idPhone);
            phoneService.delete(phoneDTO);

        } finally {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminServlet");
            rd.forward(req, resp);
        }


    }
}
