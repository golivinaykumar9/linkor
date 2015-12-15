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
      
    
        <div id="login">   
          <h1>Verify Your Account</h1>
          
         <form:form action="/Linkor/verify" method="POST" modelAttribute="userSignUp">
          
            <div class="field-wrap">
            <label>
              Verification Number<span class="req">*</span>
            </label>
            <input type="text" id="verificationNumber" required autocomplete="off"/>
          </div>
          
         
          
          <p class="forgot"><a href="#">Resend Email</a></p>
          
          <button class="button button-block"/>Verify Now</button>
          
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
