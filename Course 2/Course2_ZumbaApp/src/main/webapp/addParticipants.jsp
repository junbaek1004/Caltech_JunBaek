<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add Participants Details</h2>

<form action="ParticipantsController" method="post">
<label for="name">Name: </label>
<input type="text" id="name" name="name" required /><br/>

<label for="age">Age: </label>
<input type="text" id="age" name="age" required /><br/>

<label for="batchId">Batch Id: </label>
<input type="number" id="batchId" name="bid" required /><br/>

<button type="submit">Add Participant</button>
</form><br/>

<a href="index.html">Back</a>
</body>
</html>