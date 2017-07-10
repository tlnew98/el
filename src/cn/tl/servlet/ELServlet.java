package cn.tl.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.tl.vo.Dept;
import cn.tl.vo.Emp;

@SuppressWarnings("serial")
public class ELServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Emp> all=new ArrayList<Emp>();
		for(int i=0;i<10;i++){
		Emp emp=new Emp();
		Dept dept=new Dept();
		emp.setEmpno(1+i);
		emp.setEname("tanlin"+i);
		dept.setDeptno(90+i);
		dept.setDname("技术部"+i);
		emp.setDept(dept);
		all.add(emp);
		}
		request.setAttribute("allEmps",all);
		request.getRequestDispatcher("/show.jsp").forward(request, response);
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
