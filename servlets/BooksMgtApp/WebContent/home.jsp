<style>

.fa{

    font-size: 30px !important;

}

.btn{

    font-size: 14px !important;

}
.form-control {
	width : 30% !important;
}

</style>

<script>

setTimeout(function(){
    document.getElementById("message").innerHTML = '';
}, 3000);

</script>



<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@page import="java.util.ArrayList,com.infy.model.Book" %>


<%
	String msg = (String)request.getAttribute("messageValue");

	Book bookObj = (Book)request.getAttribute("bookInfo");

%>

<%
	if(msg!=null){
%>
<h2><span id="message"><font color='red'><%=msg%></font></span></h2>

<%} %>

<div>


<form action="listofbooks">

<% if(bookObj==null){%>
	
  <div class="form-group">
    <label for="bookname">Book Name:</label>
    <input type="text" class="form-control" id="bookname" name="bookname">
  </div>
  <div class="form-group">
    <label for="pwd">Price:</label>
    <input type="number" class="form-control" id="price" name="price">
  </div>
  <div class="form-group">
    <label for="author">Author:</label>
    <input type="text" class="form-control" id="author" name="author">
  </div>
  
  <div class="form-group">
    <label for="qty">qty:</label>
    <input type="number" class="form-control" id="qty" name="qty">
  </div>
  
  <div class="form-group">
    <label for="pages">Pages:</label>
    <input type="number" class="form-control" id="pages" name="pages">
  </div>
  <div class="form-group">
    <label for="publisher">Publisher:</label>
    <input type="text" class="form-control" id="publisher" name="publisher">
  </div>
  <button type="submit" class="btn btn-primary" name="btnName" value="add">Add Book</button>
  <%}else{ %>
  		<input type = "hidden" name="id" value=<%=bookObj.getId()%>>
  		<div class="form-group">
    <label for="bookname">Book Name:</label>
    <input type="text" class="form-control" id="bookname" name="bookname" value=<%=bookObj.getBookName() %>>
  </div>
  <div class="form-group">
    <label for="pwd">Price:</label>
    <input type="number" class="form-control" id="price" name="price" value=<%=bookObj.getPrice() %>>
  </div>
  <div class="form-group">
    <label for="author">Author:</label>
    <input type="text" class="form-control" id="author" name="author" value=<%=bookObj.getAuthor() %>>
  </div>
  
  <div class="form-group">
    <label for="qty">qty:</label>
    <input type="number" class="form-control" id="qty" name="qty" value=<%=bookObj.getQty() %>>
  </div>
  
  <div class="form-group">
    <label for="pages">Pages:</label>
    <input type="number" class="form-control" id="pages" name="pages" value=<%=bookObj.getPages() %>>
  </div>
  <div class="form-group">
    <label for="publisher">Publisher:</label>
    <input type="text" class="form-control" id="publisher" name="publisher" value=<%=bookObj.getPublisher() %>>
  </div>
 
  <button type="submit" class="btn btn-primary" name="btnName" value="update">Update Book</button>
 <%} %>
</form>

</div>

<table class="table table-hover">
<%

	ArrayList<Book> list = (ArrayList)request.getAttribute("list");
	for(Book book:list){%>
		<tr>
		
			<td><input type="checkbox" name="id" value='<%=book.getId()%>'></td>
			<td><%= book.getBookName()%></td>
			<td><%=book.getPrice() %></td>
			<td><%=book.getAuthor() %></td>
			<td><%=book.getQty() %></td>
			<td><%=book.getPages() %></td>
			<td><%=book.getPublisher() %></td>
			<td><a  class="btn btn-primary" href="listofbooks?id=<%=book.getId()%>&btnName=edit">Edit</a></td>
			<td><a class="fa fa-trash" href="listofbooks?id=<%=book.getId()%>&btnName=delete"></a></td>
		</tr>
<%} %>

</table>





