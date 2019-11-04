package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>home</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#main\r\n");
      out.write("{\r\n");
      out.write("width: 100%;\r\n");
      out.write("height: 100%;\r\n");
      out.write("border: 2px solid white;\r\n");
      out.write("}\r\n");
      out.write("#homeHead\r\n");
      out.write("{\r\n");
      out.write("background-color: #ACDF87;\r\n");
      out.write("border-radius:0px 0px 20px 20px;\r\n");
      out.write("}\r\n");
      out.write("#blank1\r\n");
      out.write("{\r\n");
      out.write("width: 100%;\r\n");
      out.write("height: 5px;\r\n");
      out.write("}\r\n");
      out.write("#homeBody\r\n");
      out.write("{\r\n");
      out.write("background-color: #ACDF87;\r\n");
      out.write("border-top:2px solid;\r\n");
      out.write("width: 100%;\r\n");
      out.write("height: 600px;\r\n");
      out.write("border: 2px;\r\n");
      out.write("border-color:limegreen;\r\n");
      out.write("border-radius:20px 20px 20px 20px;\r\n");
      out.write("}\r\n");
      out.write("#homeImage\r\n");
      out.write("{\r\n");
      out.write("height: 100%;\r\n");
      out.write("width: 50%;\r\n");
      out.write("}\r\n");
      out.write("#homeContent\r\n");
      out.write("{\r\n");
      out.write("height: 100%;\r\n");
      out.write("width: 50%;\r\n");
      out.write("}\r\n");
      out.write("#homeBody img\r\n");
      out.write("{\r\n");
      out.write("height:450px;\r\n");
      out.write("width:300px;\r\n");
      out.write("padding-left: 38%;\r\n");
      out.write("padding-top: 3%;\r\n");
      out.write("}\r\n");
      out.write("#QuickHelp\r\n");
      out.write("{\r\n");
      out.write("border:2px;\r\n");
      out.write("border-color: #ACDF87;\r\n");
      out.write("padding-top:1%;\r\n");
      out.write("padding-left: 45%;\r\n");
      out.write("padding-bottom:1%;\r\n");
      out.write("background-color: #ACDF87;\r\n");
      out.write("border-radius:0px 0px 20px 20px;\r\n");
      out.write("}\r\n");
      out.write("#blank2\r\n");
      out.write("{\r\n");
      out.write("width: 100%;\r\n");
      out.write("height:30px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<div id=\"homeHead\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"blank1\"></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"homeBody\">\r\n");
      out.write("\t<div style=\"float: left; width: 50%\"><img alt=\"home1\" src=\"images\\crop selection.jpg\" ></div>\r\n");
      out.write("\t<div style=\"float: right; text-align: left; text-decoration: blink; padding-right:30px; padding-top: 45px\";>\r\n");
      out.write("\t<p><h4>Different crops need different type of soils, different types and amounts \r\n");
      out.write("\t<br>of nutrients, and different types and amounts of water.\r\n");
      out.write("\t<br>The amount of water required by the plant is also dependent on the \r\n");
      out.write("\t<br>growing season and the climate where it is grown. By selecting the \r\n");
      out.write("\t<br>right crop for the given soil conditions and climate, one can optimise\r\n");
      out.write("\t<br> yields and save water requirements for irrigation.<br>\r\n");
      out.write("\t<br>By selecting the right crop for given conditions, one can increase yields\r\n");
      out.write("\t<br>by proper selection of the crops</h4></p>\r\n");
      out.write("\t<div id=\"QuickHelp\">                                                   \r\n");
      out.write("<a href=\"QuickHelp.jsp\"><button>Quick Help</button></a>\r\n");
      out.write("</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"blank2\"></div>\r\n");
      out.write("<div id=\"homeFoot\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
