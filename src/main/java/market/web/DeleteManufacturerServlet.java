package market.web;

import market.dto.ManufacturerDTO;
import market.service.impl.ManufacturerService;

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
@WebServlet("/DeleteManufacturerServlet")
public class DeleteManufacturerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Integer manufacturerId = Integer.valueOf(req.getParameter("idManufacturerDelete"));
            ManufacturerService manufacturerService = new ManufacturerService();
            ManufacturerDTO manufacturerDTO = manufacturerService.findById(manufacturerId);
            manufacturerService.delete(manufacturerDTO);

        } finally {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminServlet");
            rd.forward(req, resp);
        }


    }
}
