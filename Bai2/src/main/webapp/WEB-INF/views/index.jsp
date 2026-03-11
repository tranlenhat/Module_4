<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
  <title>Calculator</title>
</head>
<body>

<h1>Calculator</h1>

<form action="/calculate" method="post">
  <input type="text" name="num1" />

  <input type="text" name="num2" />
  <br><br>
  <button type="submit" name="operator" value="+">Addition (+)</button>
  <button type="submit" name="operator" value="-">Subtraction (-)</button>
  <button type="submit" name="operator" value="*">Multiplication (x)</button>
  <button type="submit" name="operator" value="/">Division (/)</button>
</form>

<h2>Result: ${result}</h2>

</body>
</html>