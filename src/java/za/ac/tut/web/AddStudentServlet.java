/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author ezram
 */
public class AddStudentServlet extends HttpServlet {

 

    @EJB
    private StudentFacadeLocal stu;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long studentNum = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        
        Student student = generateStudent(studentNum, name, age);
        stu.createStudet(student);
        
        RequestDispatcher disp = request.getRequestDispatcher("addstudent_outcome.jsp");
        disp.forward(request, response);
    }
    
    private Student generateStudent(Long studentNum, String name, Integer age){
         Student student = new Student();
         student.setName(name);
         student.setId(studentNum);
         student.setAge(age);
         student.setCreationDate(new Date());
         
         return student;
    }

}
