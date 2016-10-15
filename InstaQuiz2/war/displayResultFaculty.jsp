<%@ page 
import="java.util.*,com.mnrr.EntityQuiz,com.mnrr.EntityQuestion,com.mnrr.EntityStats"
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
				<h3>Quiz Result</h3>
				<%  EntityStats stat = (EntityStats)request.getAttribute("stats"); %><br>
				Total Students- <%=stat.getTotal_students() %><br>
				Average - <%= stat.getAverage() %><br>
				Students Above Average - <%= stat.getStudents_abvavg() %><br>
				Students Below Average - <%= stat.getStudents_belavg() %><br>
				
			</div>
		</div>
	</div>

</body>
</html>