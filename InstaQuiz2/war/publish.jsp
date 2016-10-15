<%@ page import="java.util.*,com.mnrr.EntityQuiz" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
				<h3>Available Quizzes</h3>
				<form class="form-horizontal" action="publishQuiz" method="get">
					<%
						List<EntityQuiz> quizzes = (List<EntityQuiz>) request.getAttribute("quizzes");
						//out.println(quizzes.size());
						for (int i = 0; i < quizzes.size(); i++) {
					%>
					<div class="form-group">
						<input type="submit" name="quiztitle"
							value="<%=quizzes.get(i).getQuiztitle()%>"
							class="btn btn-primary">Publish
						<%=quizzes.get(i).getQuiztitle()%>
					</div>

					<%
						}
					%>
				</form>
			</div>
		</div>
		<div class="row text-center">
			<div class="col-sm-12">
				<h3>Create a Quiz</h3>
				<a href="/create.jsp" class="btn btn-primary" role="button">Create</a>

			</div>
		</div>
	</div>

</body>
</html>