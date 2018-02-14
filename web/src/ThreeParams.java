import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ThreeParams extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println(req.getParameter("param1"));
        pw.println("<br/>");
        pw.println(req.getParameter("param2"));
        pw.println("<br/>");
        pw.println(req.getParameter("param3"));
        pw.println("<br/>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        PrintWriter pw = resp.getWriter();
//        pw.println(req.getParameter("param1"));
//        pw.println("<br/>");
//        pw.println(req.getParameter("param2"));
//        pw.println("<br/>");
//        pw.println(req.getParameter("param3"));
//        pw.println("<br/>");
//        System.out.println("doPost");
        doGet(req,resp);
    }
}
