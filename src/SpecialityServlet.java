import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectspecialityservlet",
        urlPatterns = "/SelectSpeciality"
)

public class SpecialityServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String specialityType = req.getParameter("Type");
        SpecialityService specialityService = new SpecialityService();
        SpecialityType s = SpecialityType.valueOf(specialityType);

        List groups = specialityService.getAvailableGroups(s);
        req.setAttribute("group", groups);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }
}
