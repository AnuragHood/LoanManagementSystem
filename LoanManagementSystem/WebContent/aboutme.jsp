<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 600px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.title {
  color: grey;
  font-size: 18px;
}
"WebContent/aboutme.jsp"
button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

a {
  text-decoration: none;
  font-size: 22px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}
footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	color: blue;
	text-align: center;
	font-family: Arial;
	
}

</style>
</head>
<body bgcolor="light-gold">
		<a align="center" href="home.jsp">Home</a>


<h2 style="text-align:center">About Developer</h2>

<div class="card">
  <img src="anurag.jpg" alt="Anurag" style="width:100%">
  <h1>Anurag Pathak</h1>
  <p class="title">Software Developer(TCS)</p>
  <p>Chennai</p>
  <div style="margin: 24px 0;">
    <a href="#"><i class="fa fa-dribbble"></i></a> 
    <a href="#"><i class="fa fa-twitter"></i></a>  
    <a href="#"><i class="fa fa-linkedin"></i></a>  
    <a href="#"><i class="fa fa-facebook"></i></a> 
 </div>
 <p><button>Contact: +918802620500
 </button></p>
</div>
<footer class="footer"> &copy;contact inforormation ::
		+917905384377 copyright@2018 Anurag Pathak</footer>

</body>
</html>
