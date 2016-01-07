<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
  	<meta charset="UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="refresh" content="30">
      <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    	    <!-- Latest compiled and minified CSS -->
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    	<!-- Optional theme -->
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
  	   
      <style>
      body{
        margin:0;
        padding: 0;
      }
        .signUp{
          border-left: 1px solid #A2A2A2;
        }
        .header{
          padding: 2% 0;
        }
        .tittle{
         background-image: url("<c:url value='/static/header22.jpg'/>'");
         color:#ffffff;
        }
        .heading{
          font-size: 36px;
          padding: 1% 3%;
          }
        .twintainer{
          margin:56px 0 56px 0;
        }
        .footerCtn{
          float:left;
          padding:35px;
          margin:0;
          font-size:17px;
          color:black;
        }
        .footerLink{
        float:left;
        padding:45px;
        margin:0;
        font-size:17px;
      }
        .footerImg{
        float:left;
        padding:2px;
      }
      </style>

  		<title>Login</title>
  </head>
  <body class="container-fluid">
    <!--header-->
      <div class="row">
        <div class="col-sm-12 tittle">
          <div class="heading">linkor</div>
        </div>
      </div>

      <!--boby-->
      <div class="row">
        <div class="twintainer">
          <div class="col-sm-6">
              <form class="form-horizontal">
                <h2 class="col-sm-offset-6 header"><strong>Login</strong></h2>
                <div class="form-group">
                  <label for="inputEmail3" class="col-sm-offset-3 col-sm-2 control-label">User Name</label>
                  <div class="col-sm-4">
                    <input type="text"  class="form-control" id="userName" name="userName" placeholder="User Name">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputPassword3" class="col-sm-offset-3 col-sm-2 control-label">Password</label>
                  <div class="col-sm-4">
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-5 col-sm-3">
                    <div class="checkbox">
                      <label>
                        <input type="checkbox"> Remember me
                      </label>
                    </div>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-5 col-sm-10">
                    <button type="submit" class="btn btn-success">Sign in</button>
                  </div>
                </div>
              </form>
          </div>

          <div class="col-sm-6 signUp">
            <form action="/Linkor/signUp" method="GET" modelAttribute="UserProfile" class="form-horizontal">
                <h2 class="col-sm-offset-4 header"><strong>Sign Up</strong></h2>
                <div class="form-group">
                  <label for="inputEmail3" class="col-sm-3 control-label">First Name</label>
                  <div class="col-sm-4">
                    <input type="email" class="form-control" id="firstName" name="firstName" placeholder="First Name">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputPassword3" class="col-sm-3 control-label">Last Name</label>
                  <div class="col-sm-4">
                    <input type="password" class="form-control" id="lastName" name="lastName" placeholder="Last Name">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputPassword3" class="col-sm-3 control-label">User Name</label>
                  <div class="col-sm-4">
                    <input type="password" class="form-control" id="userNameSignUp" name="userName" placeholder="User Name">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputPassword3" class="col-sm-3 control-label">E-mail</label>
                  <div class="col-sm-4">
                    <input type="password" class="form-control" id="emailId" name="emailId" placeholder="E-mail">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputPassword3" class="col-sm-3 control-label">Password</label>
                  <div class="col-sm-4">
                    <input type="password" class="form-control" id="passwordSignUp1" name="password" placeholder="Password">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputPassword3" class="col-sm-3 control-label">Confirm Password</label>
                  <div class="col-sm-4">
                    <input type="password" class="form-control" id="passwordSignUp2" placeholder="Confirm Password">
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-3 col-sm-5">
                    <div class="checkbox">
                      <label>
                        <input type="checkbox"> I agree to Terms &amp; Conditions
                      </label>
                    </div>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-3 col-sm-6">
                    <button type="submit" class="btn btn-success">Create an Account</button>
                  </div>
                </div>
            </form>
          </div>
        </div>
      </div>
      <hr>
      <!--footer-->
      <div class="col-sm-offset-1 row">   
          <div class="footerCtn">
              <h3>Support</h3><a href="#">forums</a><br><a href="#">enquire</a><br><a href="#">customer care</a><br><a href="#">help desk</a>
          </div>
          <div class="footerCtn">
            <h3>Services</h3><a href="#">create ads</a><br><a href="#">advertisements</a><br><a href="#">marithons</a><br>
          </div>
          <div class="footerCtn">
            <h3>Events</h3><a href="#">groups</a><br><a href="#">network bash</a><br><a href="#">mob events</a><br><a href="#">compitions</a>
          </div>
          <div class="footerCtn">
            <h3>Contact Us:</h3>Email:<a href="https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier">supportlinor@gmail.com</a><br>Address:linkor head quaters,Atlanta,Ga<br>Phone:+1(510)541-1948.
          </div>
          <div class="footerLink"><h3>Follow us :</h3>
          <a href="https://www.facebook.com/" target="_blank">
            <img src="f.jpg" width="45px" height="38px" alt="f" class="footerImg">
          </a>
          <a href="https://twitter.com/?lang=en" target="_blank">
            <img src="t.jpg"  width="45px" height="38px" alt="t" class="footerImg" >
          </a>
          <a href="https://plus.google.com/collections/featured" target="_blank">
            <img src="<c:url value='/static/g+.jpg'/>'"  width="45px" height="38px" alt="g+" class="footerImg" >
          </a>
          <a href="https://www.youtube.com/" target="_blank">
            <img src="you.jpg"  width="45px" height="38px" alt="you" class="footerImg"  >
          </a>
          </div>
        </div>
      </div>
       
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
  </body>
</html>