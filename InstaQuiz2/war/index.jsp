<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>InstaQuiz</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="jumbotron text-center">
		<h1>InstaQuiz</h1>
	</div>

	<div class="container">
		<div class="row text-center">
			<div class="col-sm-12">
				<h3>Current Live Quiz</h3>
				<%
				if(request.getAttribute("quiztitle")!=null)
				{
				String quiztitle = request.getAttribute("quiztitle").toString();
				String code = request.getAttribute("code").toString();
				%>
				<p><%=quiztitle %>
					-
					<%=code %></p>
				<form class="form-horizontal" action="getStats" method="get">
					<div class="form-group text-center">
						<input type="hidden" name="quiztitle" value="<%=quiztitle %>">
						<button type="submit" class="btn btn-default">Get Stats</button>
					</div>
				</form>
				<%}
				else
				{%>
				<p>No Current Quiz.</p>
				<%} %>
			</div>
		</div>
		<div class="row text-center">
			<div class="col-sm-12">
				<h3>Publish a Quiz</h3>
				<a href="callPublish" class="btn btn-primary" role="button">Publish</a>
			</div>
		</div>
		<div class="row text-center">
			<div class="col-sm-12">
				<h3>Answer a Quiz</h3>
				<a href="/answer.jsp" class="btn btn-primary" role="button">Answer</a>

			</div>
		</div>
	</div>

</body>
</html>