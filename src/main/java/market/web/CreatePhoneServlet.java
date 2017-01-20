package market.web;

import market.dto.PhoneDTO;
import market.entity.Manufacturer;
import market.service.impl.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ivegotaname on 14.12.16.
 */
@WebServlet("/CreatePhoneServlet")
public class CreatePhoneServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String model = req.getParameter("model");
            Integer code = Integer.parseInt(req.getParameter("code"));
            Manufacturer manufacturer = new Manufacturer();
            Integer id = Integer.parseInt(req.getParameter("manufacturer"));
            manufacturer.setId(id);
            String description = req.getParameter("description");
            String sizes = req.getParameter("sizes");
            String pricePolicy = req.getParameter("pricePolicy");
            Integer garantyDays = Integer.parseInt(req.getParameter("garantyDays"));
            Integer count = Integer.parseInt(req.getParameter("count"));
            Integer price = Integer.parseInt(req.getParameter("price"));

            PhoneService phoneService = new PhoneService();
            PhoneDTO phoneDTO = new PhoneDTO();
            phoneDTO.setModel(model);
            phoneDTO.setCode(code);
            phoneDTO.setManufacturerID(manufacturer);
            phoneDTO.setDescription(description);
            phoneDTO.setSizes(sizes);
            phoneDTO.setPricePolicy(pricePolicy);
            phoneDTO.setGarantyDays(garantyDays);
            phoneDTO.setCount(count);
            phoneDTO.setPrice(price);
            phoneService.create(phoneDTO);


            resp.sendRedirect("/html/adminMain.jsp");
        } catch (Exception e) {
            resp.sendRedirect("/html/adminMain.jsp");
        }

    }
}
