/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-29 22:20:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("<h1>\n");
      out.write("    Available Brands\n");
      out.write("</h1>\n");

List result= (List) request.getAttribute("items");
Iterator it = result.iterator();
out.println("<br>Items: <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}

      out.write("\n");
      out.write("<h3>\"Wanna sort by name\"</h3>\n");
      out.write("        <form method=\"post\" action=\"SortServletName\">\n");
      out.write("        <input type=\"submit\" value=\"Sort By Name\">\n");
      out.write("        </form>\n");
      out.write("<h3>\"Wanna sort by ID\"</h3>\n");
      out.write("        <form method=\"post\" action=\"SortServletID\">\n");
      out.write("        <input type=\"submit\" value=\"Sort By ID\">\n");
      out.write("        </form>\n");
      out.write("<h3>\"Wanna add an item\"</h3>\n");
      out.write("        <form method=\"post\" action=\"AddItemServlet\">\n");
      out.write("        Name:\n");
      out.write("        <input type=\"text\" name=\"NewName\" placeholder=\"Enter Item Name\"/>\n");
      out.write("        Desc:\n");
      out.write("        <input type=\"text\" name=\"NewDesc\" placeholder=\"Enter a Description\"/>\n");
      out.write("        <input type=\"submit\" value=\"Add Item\">\n");
      out.write("        </form>\n");
      out.write("<h3>\"Wanna remove an item\"</h3>\n");
      out.write("        <form method=\"post\" action=\"RemoveItemServlet\">\n");
      out.write("        ID:\n");
      out.write("        <input type=\"text\" name=\"ID\" placeholder=\"Enter Item ID\"/>\n");
      out.write("        <input type=\"submit\" value=\"Remove Item\">\n");
      out.write("        </form>\n");
      out.write("<h3>\"Wanna search by ID\"</h3>\n");
      out.write("        <form method=\"post\" action=\"SearchByIDServlet\">\n");
      out.write("        Search by ID:\n");
      out.write("        <input type=\"text\" name=\"ID\" placeholder=\"Enter Item ID\"/>\n");
      out.write("        <input type=\"submit\" value=\"Search ID\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("<h3>\"Wanna search by keyword\"</h3>\n");
      out.write("        <form method=\"post\" action=\"SearchByKeywordServlet\">\n");
      out.write("        Search by Keyword:\n");
      out.write("        <input type=\"text\" name=\"keyword\" placeholder=\"Enter a keyword\"/>\n");
      out.write("        <input type=\"submit\" value=\"Search Keyword\">\n");
      out.write("        </form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
