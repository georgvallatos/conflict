<!DOCTYPE html>
<head lang="en">
    <title>Spring Boot Demo</title>
    <#include "css/test.css"
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>

<div align="center">
      <div align="center">
     <h1>Log in</h1>

     </div>
<form action="/"   modelAttribute="owner">
   </br></br>


<label for="firstName"> First Name </label>
<input for="firstName" type="text" name="firsname" require=true/>
</br></br>

<label for="lastName"> Last Name </label>
<input for="lasttName" type="text" name="lastname" require=true/>
</br></br>

<label for="myEmail">Enter your email addresss</label>
<input id="myEmail" type="email" name="email" require=true/>
</br></br>

<label for="myPass">Enter your password</label>
<input  id="myPass "type="password" name="pass" require=true/>
</br></br>

<input type="submit" value="submit "/>
</form>



</div>
</body>
</html>