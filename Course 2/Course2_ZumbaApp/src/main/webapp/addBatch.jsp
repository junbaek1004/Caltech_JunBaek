<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add Batch Details</h2>

<form action="BatchController" method="post">
<label for="typeOfBatch">Type of Batch: </label>
<input type="text" id="typeOfBatch" name="typeOfBatch" required /><br/>

<label for="time">Time: </label>
<input type="text" id="time" name="time" required /><br/>

<label for="batchId">Batch Id: </label>
<input type="number" id="batchId" name="bid" required /><br/>

<button type="submit">Add Batch</button>
</form><br/>

<a href="index.html">Back</a>
</body>
</html>