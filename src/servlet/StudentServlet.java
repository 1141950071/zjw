package servlet;

import bean.Student;
import com.fasterxml.jackson.databind.ObjectMapper;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Student stu1 = new Student(1,"mary",18);
        Student stu2 = new Student(2,"t55",18);
        Student stu3 = new Student(3,"ja5k",18);
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(list);
        System.out.println(res);
        PrintWriter out = response.getWriter();
        out.print(res);
        out.close();
    }
}