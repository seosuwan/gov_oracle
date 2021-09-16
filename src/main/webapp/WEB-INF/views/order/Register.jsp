<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<jsp:include page="../common/Head.jsp">
<body>

<h2>주문 등록</h2>

<form action="${contextPath}/orders/list" method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="orderId"><b>orderId</b></label>
    <input type="text" placeholder="Enter orderId" name="orderId" required>
    
    <label for="customerId"><b>customerId</b></label>
    <input type="text" placeholder="Enter customerId" name="customerId" required>
    
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter bookId" name="bookId" required>

    <label for="orderPrice"><b>orderPrice</b></label>
    <input type="text" placeholder="orderPrice" name="orderPrice" required>
    
    
    <label for="date"><b>date</b></label>
    <input type="text" placeholder="date" name="date" required>
        
    <button type="submit">주문 등록</button>
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