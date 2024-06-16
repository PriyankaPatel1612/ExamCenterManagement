
package Controller;

import Bean.Student;
import DAO.StudentDeclarartion;
import DAO.StudentOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentController", urlPatterns = {"/StudentController"})
public class StudentController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String username, name, address, contact, admission_date, course, payment, password;
        double fees;
        name = req.getParameter("name");
        address = req.getParameter("address");
        contact = req.getParameter("contact");
        admission_date = req.getParameter("admission_date");
        course = req.getParameter("course");
        payment = req.getParameter("payment");
        username = req.getParameter("username");
        password = req.getParameter("password");
        fees = Double.parseDouble(req.getParameter("fees"));
        
        Student st = new Student(name, address, contact, fees, admission_date, course, payment, username, password);
        StudentDeclarartion sd = new StudentOperation();
        long id = sd.insertStudent(st);
        if(id>0){
            out.println("Inserted successfully!");
        }else{
            out.println("Something went wrong!!");
        }
   
    }
    
}
