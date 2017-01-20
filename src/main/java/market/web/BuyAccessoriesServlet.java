package market.web;

import market.dto.AccessoriesDTO;
import market.service.impl.AccessoriesService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ivegotaname on 15.12.16.
 */
@WebServlet("/BuyAccessoriesServlet")
public class BuyAccessoriesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccessoriesService accessoriesService = new AccessoriesService();
        AccessoriesDTO accessoriesDTO = new AccessoriesDTO();
        int id = Integer.parseInt(req.getParameter("idAccessoriesBuy"));
        accessoriesDTO.setId(id);
        HttpSession session = req.getSession(false);

        if (session.getAttribute("user") != null){
            accessoriesDTO = accessoriesService.findById(accessoriesDTO.getId());
            if (accessoriesDTO.getCount() != 0) {
                accessoriesDTO.setCount(accessoriesDTO.getCount()-1);
                accessoriesService.update(accessoriesDTO);

                PrintWriter out = resp.getWriter();
                out.println("<html>" +
                        "<body>" +
                        "<center>" +
                        "<h2>" +
                        "<font color=\"red\">You've bought your new accessories!</font>" +
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
                        "<font color=\"red\">No accessories left</font>" +
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
