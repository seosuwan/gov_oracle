<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<jsp:include page="../common/Head.jsp">
<body>

<h2>유저 수정</h2>

<form action="${contextPath}/customer/detail" method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="customerId"><b>customerId</b></label>
    <input type="text" placeholder="Enter customerId" name="customerId" required>
    
    <label for="customerName"><b>customerName</b></label>
    <input type="text" placeholder="Enter customerName" name="customerName" required>
    
    <label for="address"><b>address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>

    <label for="phoneN"><b>phoneN</b></label>
    <input type="text" placeholder="phoneN" name="phoneN" required>
    
    
    <button type="submit">유저 수정</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>