package market.web;

import market.dto.PhoneDTO;
import market.service.impl.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ivegotaname on 13.12.16.
 */
@WebServlet("/BuyPhoneServlet")
public class BuyPhoneServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PhoneService phoneService = new PhoneService();
    PhoneDTO phoneDTO = new PhoneDTO();
        int id = Integer.parseInt(req.getParameter("idPhoneBuy"));
        phoneDTO.setId(id);
        HttpSession session = req.getSession(false);

        if (session.getAttribute("user") != null){
            phoneDTO = phoneService.findById(phoneDTO.getId());
            if (phoneDTO.getCount() != 0) {
                phoneDTO.setCount(phoneDTO.getCount()-1);
                phoneService.update(phoneDTO);

                PrintWriter out = resp.getWriter();
                out.println("<html>" +
                        "<body>" +
                        "<center>" +
                        "<h2>" +
                        "<font color=\"red\">You've bought your new phone!</font>" +
                        "</h2>" +
                        "</center>" +
                        "</body>" +
                        "</<html>");
  /*                RequestDispatcher rd = getServletContext().getRequestDispatcher("/PhoneServlet");
                rd.forward(req, resp);*/
            }else {
                PrintWriter out = resp.getWriter();
                out.println("<html>" +
                        "<body>" +
                        "<center>" +
                        "<h1>" +
                        "<font color=\"red\">No phones have left</font>" +
                        "</h1>" +
                        "</center>" +
                        "</body>" +
                        "</<html>");
            }
        }else {
            PrintWriter out = resp.getWriter();
            out.println("<html>" +
                    "<body>" +
                    "<center>" +
                    "<h1>" +
                    "<font color=\"red\">you need to be authorized</font>" +
                    "</h1>" +
                    "</center>" +
                    "</body>" +
                    "</<html>");

        }
    }
}
