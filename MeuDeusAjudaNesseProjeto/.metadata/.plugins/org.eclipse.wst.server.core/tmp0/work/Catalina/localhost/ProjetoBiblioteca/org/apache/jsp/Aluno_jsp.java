/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2018-08-22 12:35:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Aluno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/20151074010433/Downloads/MeuDeusAjudaNesseProjeto/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProjetoBiblioteca/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1308137770000L));
    _jspx_dependants.put("jar:file:/C:/Users/20151074010433/Downloads/MeuDeusAjudaNesseProjeto/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProjetoBiblioteca/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/c.tld", Long.valueOf(1308137770000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl-1.2.jar", Long.valueOf(1530713177854L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\turl(\"data:image/jpeg;base64,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\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button{\r\n");
      out.write("width: 40%;\r\n");
      out.write("margin-left: 30%;\r\n");
      out.write("margin-right: 30%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".area-header {\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tbackground-color:;\r\n");
      out.write("}\r\n");
      out.write(".icone {\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\twidth:60px;\r\n");
      out.write("\theight:60px;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".name-proj {\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tmargin-top:15px;\r\n");
      out.write("\tmargin-left:15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 20px;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#formulario {\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\tpadding: 3% 2%;\r\n");
      out.write("\tmargin: 2% 13%;\r\n");
      out.write("\tbackground-color: rgba(200,200,200,0.5);\r\n");
      out.write("\tborder-radius: 40px ;\r\n");
      out.write("\tpadding: 1%;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("input[type=text], label{\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\tmargin: 0% 25%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Cadastro de Alunos</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"servico\" id=\"formulario\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<h2>Adicionar aluno:</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<label>CPF </label> <input type=\"text\" name=\"cpf\" maxlength=\"11\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aluno.cpf }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/><br/>\r\n");
      out.write("\t\t<label>Nome: </label> <input type=\"text\" name=\"nome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aluno.nome }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /><br/>\r\n");
      out.write("\t\t<label>Matricula: </label> <input type=\"text\" name=\"matricula\" maxlength=\"14\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aluno.matricula }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/><br/>\r\n");
      out.write("\t\t<label>Endereço: </label> <input type=\"text\" name=\"endereco\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aluno.endereco }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/><br/>\r\n");
      out.write("\t\t<label>Data de Nascimento: </label> <input type=\"text\" name=\"dataNascimento\" value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\" /><br/>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"comandos\" value=\"AdicionarAluno\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<button type=\"submit\">Adicionar Aluno</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<form action=\"servico\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"comandos\" value=\"BuscaAluno\">\r\n");
      out.write("\t\t<button type=\"submit\">Listar Todos</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<form action=\"servico\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"comandos\" value=\"GerarRelatorios\">\r\n");
      out.write("\t\t<button type=\"submit\">Relatorios</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /Aluno.jsp(77,86) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aluno.dataNascimento.time }", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /Aluno.jsp(77,86) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /Aluno.jsp(81,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty aluno}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aluno.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }
}
