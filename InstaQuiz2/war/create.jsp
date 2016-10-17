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

	<div class="container">
		<div class="row text-center">
			<div class="col-sm-12">
				<h3>Create a Quiz</h3>
				<form class="form-horizontal" action="saveQuestion" method="get">

					<div class="form-group">
						<label class="control-label col-sm-2" for="question">Quiz title:</label>
						<div class="col-sm-10">
						<% 
						String quiztitle = "";
						if(request.getAttribute("quiztitle")!=null)
						{
							 quiztitle = request.getAttribute("quiztitle").toString();
						}
								 %>
							<input type="text" class="form-control" id="quiztitle"
								name="quiztitle" placeholder="Enter quiz title" value="<%=quiztitle%>">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="question">Question:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="question"
								name="question" placeholder="Enter question">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="op1">Option 1:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="op1" name="op1"
								placeholder="Enter option 1">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="op2">Option 2:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="op2" name="op2"
								placeholder="Enter option 2">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="op3">Option 3:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="op3" name="op3"
								placeholder="Enter option 3">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="op4">Option 4:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="op4" name="op4"
								placeholder="Enter option 4">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="answer">Answer:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="answer" name="answer"
								placeholder="Enter option value i.e '1' or '2' or '3' or '4'.">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Add
								Question</button>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<a href="callPublish" class="btn btn-primary" role="button">Done</a>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>