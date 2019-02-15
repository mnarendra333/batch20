<%@page import="java.util.List,com.pragim.model.Teams" %>

<%@include file="lib.jsp" %>

<%

List<Teams> teamList = (List<Teams>)request.getAttribute("teamlist");


%>


<h2 style="text-align: center">Teams List</h2>
<table class="table table-hover">

	 <tr>
	    <th></th>
	    <th>TeamName</th>
	    <th>NoOfPly</th>
	    <th>Rank</th>
	    <th>Country</th>
 	 </tr>
	<%
		for(Teams team:teamList){
		
		%>
		<tr>
		
			<td><input type="checkbox" name="tid" value='<%=team.getTeamId()%>'/></td>
			<td><a href='getdata?click=playrlist'><%=team.getTeamName()%></a></td>
			<td><%=team.getNo_of_players() %></td>
			<td><%=team.getRank() %></td>
			<td><%=team.getCountry() %></td>
		</tr>
	<%
		}
	%>
</table>

