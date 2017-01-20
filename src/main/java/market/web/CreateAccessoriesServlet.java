package market.web;

import market.dto.AccessoriesDTO;
import market.entity.Manufacturer;
import market.service.impl.AccessoriesService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ivegotaname on 15.12.16.
 */
@WebServlet("/CreateAccessoriesServlet")
public class CreateAccessoriesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String model = req.getParameter("model");
            Integer price = Integer.parseInt(req.getParameter("price"));
            Manufacturer manufacturer = new Manufacturer();
            Integer id = Integer.parseInt(req.getParameter("manufacturer"));
            manufacturer.setId(id);
            String description = req.getParameter("description");
            String sertificate = req.getParameter("sertificate");
            String accessoryType = req.getParameter("accessoriesType");

            AccessoriesService accessoriesService = new AccessoriesService();
            AccessoriesDTO accessoriesDTO = new AccessoriesDTO();
            accessoriesDTO.setAccessoryType(accessoryType);
            accessoriesDTO.setManufacturer(manufacturer);
            accessoriesDTO.setModel(model);
            accessoriesDTO.setPrice(price);
            accessoriesDTO.setDescription(description);
            accessoriesDTO.setSertificate(sertificate);
            accessoriesService.create(accessoriesDTO);


            resp.sendRedirect("/html/adminMain.jsp");
        } catch (Exception e) {
            resp.sendRedirect("/html/adminMain.jsp");
        }

    }
}
