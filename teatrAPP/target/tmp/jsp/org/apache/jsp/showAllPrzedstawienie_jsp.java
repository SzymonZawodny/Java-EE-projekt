package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.zawodny.domain.Przedstawienie;

public final class showAllPrzedstawienie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_forEach_varStatus_var_items.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<title>Baza Przedstawienia</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write(" <style rel=\"stylesheet\" type=\"text/css\">\n");
      out.write(" body {    background-color: #ffcc66; }\n");
      out.write(" a { color: red ; font-weight: bold; text-align: center;}\n");
      out.write("            p{margin-left: 10cm; }\n");
      out.write("\n");
      out.write(" </style>\n");
      out.write("<body>\n");
      out.write("\t");
      main.java.com.zawodny.service.PrzedstawienieManager przedstawieniemanager = null;
      synchronized (application) {
        przedstawieniemanager = (main.java.com.zawodny.service.PrzedstawienieManager) _jspx_page_context.getAttribute("przedstawieniemanager", PageContext.APPLICATION_SCOPE);
        if (przedstawieniemanager == null){
          przedstawieniemanager = new main.java.com.zawodny.service.PrzedstawienieManager();
          _jspx_page_context.setAttribute("przedstawieniemanager", przedstawieniemanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("<table style=\"width:80% \" border=\"1\";>\n");
      out.write("    <tr>\n");
      out.write("    \t<th>ID Przedstawienie</th>\n");
      out.write("        <th>Tytuł</th>\n");
      out.write("        <th>Data rozpoczęcia</th>\n");
      out.write("        <th>Data zakończenia</th>\n");
      out.write("        <th>ID Sceny </th>\n");
      out.write("        <th>Obsługa</th>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("\t ");
      if (_jspx_meth_p_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("  <a class=\"btn btn-default\" href=\"getPrzedstawienieData.jsp\"><b><font color=\"red\">Dodaj przedstawienie</a></h2> &nbsp; &nbsp; &nbsp; &nbsp; <br><br><br>\n");
      out.write("    <a class=\"btn btn-default\" href=\"index.jsp\"><b><font color=\"red\">Powrót do strony głównej</a></h2> <br><br>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_p_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_p_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_p_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_p_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_p_forEach_0.setParent(null);
    _jspx_th_p_forEach_0.setVar("przedstawienie");
    _jspx_th_p_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${przedstawieniemanager.getAllPrzedstawienie()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_p_forEach_0.setVarStatus("no");
    int[] _jspx_push_body_count_p_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_p_forEach_0 = _jspx_th_p_forEach_0.doStartTag();
      if (_jspx_eval_p_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t    <tr>\n");
          out.write("\t     <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${przedstawienie.przedstawienie_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${przedstawienie.tytul}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${przedstawienie.data_rozp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("             <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${przedstawienie.data_zak}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("             <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${przedstawienie.scena_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("             <td><form action=\"deletePrzedstawienie\">\n");
          out.write("      <input type='hidden' name='delete' value= ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${przedstawienie.przedstawienie_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" />\n");
          out.write("      <input type='submit' value=\"USUŃ\" />\n");
          out.write("    </form>\n");
          out.write("          <form action=\"updatePrzedstawienie.jsp\">\n");
          out.write("      <input type='hidden' name='update'  value= ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${przedstawienie.przedstawienie_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" />\n");
          out.write("      <input type='submit' value=\"EDYTUJ\" />\n");
          out.write("    </form></td>\n");
          out.write("        </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_p_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_p_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_p_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_p_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_p_forEach_0.doFinally();
      _jspx_tagPool_p_forEach_varStatus_var_items.reuse(_jspx_th_p_forEach_0);
    }
    return false;
  }
}
