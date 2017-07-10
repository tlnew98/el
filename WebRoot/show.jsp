<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://www.tlnew.cn/c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>EL Show</title>
  </head>
  
  <body> 
 	<% 
 	List all=(List)request.getAttribute("allEmps");
 	Iterator iter=all.iterator();
 	while(iter.hasNext()){
 	pageContext.setAttribute("emp", iter.next());
 	 %>
 	 <div>
 	 ${emp.empno}
 	 ${emp.ename}
 	 ${emp.dept.deptno}
 	 ${emp.dept.dname}
 	 </div>
 	<%
 	}
 	 %>
 	 <c:if test="判断条件，利用EL完成" var="保存判断结果属性名称" scope="设置的保存范围 "></c:if>
  </body>
</html>
