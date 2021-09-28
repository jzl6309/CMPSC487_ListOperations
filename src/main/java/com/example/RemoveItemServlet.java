package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "RemoveItemServlet",
        urlPatterns = "/RemoveItemServlet"
)

public class RemoveItemServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        ItemService itemService = ItemService.getInstance();
        itemService.removeItem(Integer.parseInt(req.getParameter("ID")));

        List items = itemService.getItemList();

        req.setAttribute("items",items);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
