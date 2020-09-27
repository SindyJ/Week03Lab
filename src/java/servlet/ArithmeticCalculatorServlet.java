package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 726772
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String finput = request.getParameter("first");
        String sinput = request.getParameter("second");

        String a = request.getParameter("submit");
        
        
        request.setAttribute("first", finput);
        request.setAttribute("second", sinput);
        
        
        if(finput == null || finput.equals("") || finput.matches("[a-zA-Z]+") || sinput == null || sinput.equals("") || sinput.matches("[a-zA-Z]+")) {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        
        int f = Integer.parseInt(finput);
        int s = Integer.parseInt(sinput);
        
        if(a.equals("+")){
            request.setAttribute("result", f+s);
        }
        else if(a.equals("-")){
            request.setAttribute("result", f-s);
        }
        else if(a.equals("*")){
            request.setAttribute("result", f*s);
        }
        else {
            request.setAttribute("result", f%s);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }

}
