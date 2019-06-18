<jsp:useBean id="dataS" class="com.ashu.IntrestBean" scope="session"></jsp:useBean> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Intrest Calculator here</title>
</head>
<body>
<pre>
	Amount : <jsp:getProperty name="dataS" property="amount"/>
	Time :<jsp:getProperty name="dataS" property="time"/>
	And Intrest Is: <jsp:getProperty property="intrest" name="dataS"/>
</pre>
</body>
</html>