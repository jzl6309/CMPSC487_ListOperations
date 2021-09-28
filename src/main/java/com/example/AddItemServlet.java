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
        name = "AddItemServlet",
        urlPatterns = "/AddItemServlet"
)

public class AddItemServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        ItemService itemService = ItemService.getInstance();
        itemService.addItem(req.getParameter("NewName"), req.getParameter("NewDesc"));

        List items = itemService.getItemList();

        req.setAttribute("items",items);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
