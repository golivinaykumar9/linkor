<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html >
  <head>
    <meta charset="UTF-8">
    <title>Sign-Up/Login Form</title>
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    
     <link rel="stylesheet" href="<c:url value='/static/css/normalize.css' />" >
       <link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet">

    
        <link rel="stylesheet" href="<c:url value='/static/css/style.css' />" >

    
    
    
  </head>

  <body>

    <div class="form">
      
      <ul class="tab-group">
        <li class="tab active"><a href="#signup">Sign Up</a></li>
        <li class="tab"><a href="#login">Log In</a></li>
      </ul>
      <c:choose>
						<c:when test="${sucess}">
							<span class="label label-success">SignUp Successfully Done!  </span>
						</c:when>
						<c:when test="${failed}">
							<span class="label label-danger">SignUp Failed. Try again after some time.</span>
						</c:when>
						
		</c:choose>
      <div class="tab-content">
        <div id="signup">   
          <h1>Sign Up for Free</h1>
          
          <form:form action="/Linkor/signUp" method="POST" modelAttribute="userSignUp">
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
                First Name<span class="req">*</span>
              </label>
              <input type="text" id ="firstName" name ="firstName" required autocomplete="off" />
              <div class="has-error">
						<form:errors path="firstName" class="label label-danger"/>
				</div>	
            </div>
        
            <div class="field-wrap">
              <label>
                Last Name<span class="req">*</span>
              </label>
              <input type="text" id ="lastName" name ="lastName" required autocomplete="off"/>
              <div class="has-error">
						<form:errors path="lastName" class="label label-danger"/>
				</div>
            </div>
          </div>

			<div class="field-wrap">
            <label>
              User Name<span class="req">*</span>
            </label>
            <input type="text" id="userName" name="userName" required autocomplete="off"/>
            <div class="has-error">
						<form:errors path="userName" class="label label-danger"/>
				</div>
          </div>
          
          <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email" id="emailId" name="emailId" required autocomplete="off"/>
            <div class="has-error">
						<form:errors path="emailId" class="label label-danger"/>
				</div>
          </div>
          
          
          
          <div class="field-wrap">
            <label>
              Set A Password<span class="req">*</span>
            </label>
            <input type="password" id="password"  name="password" required autocomplete="off"/>
            <div class="has-error">
						<form:errors path="password" class="label label-danger"/>
				</div>
          </div>
          
          <button type="submit" class="button button-block"/>Get Started</button>
          
          </form:form >

        </div>
        
        <div id="login">   
          <h1>Welcome Back!</h1>
          
         <form:form action="/Linkor/login" method="POST" modelAttribute="userLogin">
          
            <div class="field-wrap">
            <label>
              User Name<span class="req">*</span>
            </label>
            <input type="text" id="userName" name="userName" required autocomplete="off"/>
            <div class="has-error">
						<form:errors path="userName" class="label label-danger"/>
				</div>
          </div>
          
          <div class="field-wrap">
            <label>
              Password<span class="req">*</span>
            </label>
            <input type="password" id ="password" name ="password" required autocomplete="off"/>
            <div class="has-error">
						<form:errors path="password" class="label label-danger"/>
				</div>
          </div>
          
          <p class="forgot"><a href="#">Forgot Password?</a></p>
          
          <button class="button button-block"/>Log In</button>
          
          </form:form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="<c:url value='/static/js/index.js' />"></script>
	
	<script type="text/javascript">
	if("${tab}" == ""){
		
	}
	</script>
    
    
    
  </body>
</html>
