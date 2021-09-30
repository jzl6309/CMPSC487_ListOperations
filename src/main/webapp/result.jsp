<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Items
</h1>
<%
List result= (List) request.getAttribute("items");
Iterator it = result.iterator();
out.println("<br>Items: <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
<h3>"Wanna sort by name"</h3>
        <form method="post" action="SortServletName">
        <input type="submit" value="Sort By Name">
        </form>
<h3>"Wanna sort by ID"</h3>
        <form method="post" action="SortServletID">
        <input type="submit" value="Sort By ID">
        </form>
<h3>"Wanna add an item"</h3>
        <form method="post" action="AddItemServlet">
        Name:
        <input type="text" name="NewName" placeholder="Enter Item Name"/>
        Desc:
        <input type="text" name="NewDesc" placeholder="Enter a Description"/>
        <input type="submit" value="Add Item">
        </form>
<h3>"Wanna remove an item"</h3>
        <form method="post" action="RemoveItemServlet">
        ID:
        <input type="text" name="ID" placeholder="Enter Item ID"/>
        <input type="submit" value="Remove Item">
        </form>
<h3>"Wanna edit an item"</h3>
        <form method="post" action="EditServlet">
        ID:
        <input type="text" name="ID" placeholder="ID of item to edit"/>
        Name:
        <input type="text" name="editName" placeholder="Enter New Name"/>
        Desc:
        <input type="text" name="editDesc" placeholder="Enter New Description"/>
        <input type="submit" value="Update Item">
        </form>
<h3>"Wanna search by ID"</h3>
        <form method="post" action="SearchByIDServlet">
        Search by ID:
        <input type="text" name="ID" placeholder="Enter Item ID"/>
        <input type="submit" value="Search ID">
        </form>

<h3>"Wanna search by keyword"</h3>
        <form method="post" action="SearchByKeywordServlet">
        Search by Keyword:
        <input type="text" name="keyword" placeholder="Enter a keyword"/>
        <input type="submit" value="Search Keyword">
        </form>
</body>
</html>