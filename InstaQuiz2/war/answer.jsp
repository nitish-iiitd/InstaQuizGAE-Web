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
				<h3>Answer a Quiz</h3>
				<form class="form-horizontal" action="getQuiz" method="get">

					<div class="form-group">
						<label class="control-label col-sm-2" for="question">Quiz Code:</label>
						<div class="col-sm-10">
						
							<input type="text" class="form-control" id="quizcode"
								name="quizcode" placeholder="Enter quiz code" value="">
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Get Quiz</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>