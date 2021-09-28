package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@WebServlet(
        name = "SortServletName",
        urlPatterns = "/SortServletName"
)

public class SortServletName extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        ItemService itemService = ItemService.getInstance();

        List items = itemService.getItemList();

        Collections.sort(items, new Comparator<Item>() {
            public int compare(Item item1, Item item2){
                return item1.getName().compareTo(item2.getName());
            }
        });

        req.setAttribute("items",items);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }

}
