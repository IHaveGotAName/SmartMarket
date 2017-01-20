package market.web;

import market.dto.ManufacturerDTO;
import market.service.impl.ManufacturerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ivegotaname on 15.12.16.
 */
@WebServlet("/CreateManufacturerServlet")
public class CreateManufacturerServlet extends HttpServlet {

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
        String nameMan = req.getParameter("nameMan");
        String country = req.getParameter("country");
        String deliveryType = req.getParameter("deliveryType");
        Integer deliveryDays = Integer.parseInt(req.getParameter("deliveryDays"));

        ManufacturerService manufacturerService = new ManufacturerService();
        ManufacturerDTO manufacturerDTO = new ManufacturerDTO();
        manufacturerDTO.setNameMan(nameMan);
        manufacturerDTO.setCountry(country);
        manufacturerDTO.setDeliveryTpe(deliveryType);
        manufacturerDTO.setDeliveryDays(deliveryDays);
        manufacturerService.create(manufacturerDTO);


        resp.sendRedirect("/html/adminMain.jsp");
    } catch (Exception e) {
        resp.sendRedirect("/html/adminMain.jsp");
    }

}

}
