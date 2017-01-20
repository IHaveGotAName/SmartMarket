package market.web;

import market.dto.HistoryDTO;
import market.dto.UserDTO;
import market.service.impl.HistoryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by ivegotaname on 09.12.16.
 */
public class UserServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        HistoryService historyService = new HistoryService();
        UserDTO userDTO = (UserDTO) session.getAttribute("user");
        HistoryDTO historyDTO = historyService.findById(userDTO.getId());
        session.setAttribute("historyDTO", historyDTO);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/profile.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        UserDTO userDTO = (UserDTO) session.getAttribute("user");
        HistoryService historyService = new HistoryService();
        HistoryDTO historyDTO = historyService.findById(userDTO.getId());

        session.setAttribute("historyDTO", historyDTO);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/profile.jsp");
        rd.forward(req, resp);
    }
}


