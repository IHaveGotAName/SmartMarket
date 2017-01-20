package market.web;

import market.dto.AccessoriesDTO;
import market.service.impl.AccessoriesService;

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
@WebServlet("/DeleteAccessoriesServlet")
public class DeleteAccessoriesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Integer accessoriesId = Integer.valueOf(req.getParameter("idAccessoriesDelete"));
            AccessoriesService accessoriesService = new AccessoriesService();
            AccessoriesDTO accessoriesDTO = accessoriesService.findById(accessoriesId);
            accessoriesService.delete(accessoriesDTO);

        } finally {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminServlet");
            rd.forward(req, resp);
        }


    }
}
