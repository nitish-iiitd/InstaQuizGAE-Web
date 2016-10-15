<%@ page 
import="java.util.*,com.mnrr.EntityQuiz,com.mnrr.EntityQuestion"
language="java" contentType="text/html; charset=UTF-8"
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
	<div class="container">
		<div class="row text-center">
			<div class="col-sm-12">
				<h3>Quiz</h3>
				<% 
				EntityQuiz quiz = (EntityQuiz)request.getAttribute("quiz"); 
				List<EntityQuestion> questions = (List<EntityQuestion>) request.getAttribute("questions");
				%>
				
				<%= quiz.getQuiztitle() %>
				<form class="form-horizontal" action="submitAnswer" method="get">
					<div class="form-group text-center">
					<input type="hidden" name="quiztitle" value="<%= quiz.getQuiztitle() %>">
					</div>
					<% for(int i=0;i<questions.size();i++) {%>
					<hr>
					<div class="form-group text-center">
						<label class="control-label col-sm-6 text-center" for="question"><%= questions.get(i).getText() %></label>
						<div class="col-sm-6 ">
							<label class="radio-inline ">
							<input type="radio" name="<%=i %>" value="1"><%=questions.get(i).getOption1() %>
							</label>
							<label class="radio-inline">
							<input type="radio" name="<%=i %>" value="2"><%=questions.get(i).getOption2() %>
							</label>
							<label class="radio-inline">
							<input type="radio" name="<%=i %>" value="3"><%=questions.get(i).getOption3() %>
							</label>
							<label class="radio-inline">
							<input type="radio" name="<%=i %>" value="4"><%=questions.get(i).getOption4() %>
							</label>
						</div>
					</div>
					<hr>
					<% } %>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>