package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/addProduct.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=RocknRoll+One&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Add product</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <div class=\"row\" style=\"margin-left: 0px;margin-right: 0px;height: 100px\">\n");
      out.write("                        <div class=\"col-md-4 text-left bg-info \">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 text-center bg-info\">\n");
      out.write("                            <h2 class=\"my-md-3 site-title text-center\">Online Store</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4  bg-info\">\n");
      out.write("                            <p class=\"my-md-4 header-links text-center\">\n");
      out.write("                                <a href=\"login.jsp\" style=\"font-family: monospace;color:#ffffff\" text-light><i class=\"far fa-user-circle\"></i> Sign in|</a>\n");
      out.write("                                <a href=\"#\" style=\"font-family: monospace;color:#ffffff\">Sign up <i class=\"fas fa-user-plus\"></i></a>\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-expand-xl navbar-light bg-light\">\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse position-sticky\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-dark\" href=\"listPro?ctid=1\">Iphone</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-dark\" href=\"listPro?ctid=3\">SamSung</a>\n");
      out.write("                            </li><li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-dark\" href=\"listPro?ctid=2\">Oppo</a>\n");
      out.write("                            </li><li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-dark\" href=\"#\">Vinsmart</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc==null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <a class=\"nav-link text-dark\" href=\"login.jsp\"><i class=\"fas fa-shopping-cart\"></i></a>\n");
      out.write("                        </c:if>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <section class=\"jumbotron text-center\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h1 class=\"jumbotron-heading\">ADD PRODUCT</h1>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <section>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 mb-4\">\n");
      out.write("                            <div class=\"card wish-list pb-1\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <div class=\"md-form md-outline mb-0\">\n");
      out.write("                                                <label for=\"firstName\">Ten San Pham</label>\n");
      out.write("                                                <input type=\"text\" id=\"firstName\" class=\"form-control mb-0 mb-lg-2\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"md-form md-outline mb-0\">\n");
      out.write("                                                <label for=\"firstName\">Price</label>\n");
      out.write("                                                <input type=\"text\" id=\"firstName\" class=\"form-control mb-0 mb-lg-2\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"md-form md-outline mb-0\">\n");
      out.write("                                                <label for=\"firstName\">Color</label>\n");
      out.write("                                                <input type=\"text\" id=\"firstName\" class=\"form-control mb-0 mb-lg-2\">\n");
      out.write("                                            </div>\n");
      out.write("                                           \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("\n");
      out.write("                                    <!-- Additional information -->\n");
      out.write("                                    <div class=\"md-form md-outline\">\n");
      out.write("                                        <label for=\"form76\">Note Information</label>\n");
      out.write("                                        <textarea id=\"form76\" class=\"md-textarea form-control\" rows=\"4\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"md-form md-outline  text-center\"id=\"button-complete\">\n");
      out.write("                                        <button class=\"btn btn-lg btn-block btn-success text-uppercase text-center\"style=\"margin-top:20px\">Upload Product</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Card -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4\">\n");
      out.write("                            <!-- Card -->\n");
      out.write("                            <div class=\"card mb-4\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"mb-3\">The total amount of</h5>\n");
      out.write("                                    <ul class=\"list-group list-group-flush\">\n");
      out.write("                                        <li class=\"list-group-item d-flex justify-content-between align-items-center border-0 px-0 pb-0\">\n");
      out.write("                                            Temporary amount\n");
      out.write("                                            <span>$53.98</span>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item d-flex justify-content-between align-items-center px-0\">\n");
      out.write("                                            Shipping\n");
      out.write("                                            <span>Gratis</span>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item d-flex justify-content-between align-items-center border-0 px-0 mb-3\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <strong>The total amount of</strong>\n");
      out.write("                                                <strong>\n");
      out.write("                                                    <p class=\"mb-0\">(including VAT)</p>\n");
      out.write("                                                </strong>\n");
      out.write("                                            </div>\n");
      out.write("                                            <span><strong>$53.98</strong></span>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary btn-block waves-effect waves-light\">Make purchase</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"text-light container\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" id=\"footer-color\">\n");
      out.write("                    <div class=\"col-md-3 col-lg-4 col-xl-3\">\n");
      out.write("                        <h5>About</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <p class=\"mb-0\">\n");
      out.write("                            My shop is one of the best shop in viet nam.So many product that is luxury where is export from Americe and China\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                        <h5>Informations</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"\">Trung tâm trợ giúp</a></li>\n");
      out.write("                            <li><a href=\"\">Tư Vấn Khách Hàng</a></li>\n");
      out.write("                            <li><a href=\"\">Chăm sóc khách hàng</a></li>\n");
      out.write("                            <li><a href=\"\">Chăm sóc bảo hành</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                        <h5>Others links</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"\">Giới Thiệu 1</a></li>\n");
      out.write("                            <li><a href=\"\">Điều Khoản Bảo mật 2</a></li>\n");
      out.write("                            <li><a href=\"\">Liên Hệ truyền Thông</a></li>\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-lg-3 col-xl-3\">\n");
      out.write("                        <h5>Contact</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><i class=\"fa fa-home mr-2\"></i> My Shop</li>\n");
      out.write("                            <li><i class=\"fa fa-envelope mr-2\"></i> ngocquang2000fpt@gmail.com</li>\n");
      out.write("                            <li><i class=\"fa fa-phone mr-2\"></i> +0966773851</li>\n");
      out.write("                            <li><i class=\"fa fa-print mr-2\"></i> +https://www.facebook.com/</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
}