<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>
        Login
    </title>
</head>

<body>
<h2>Registration driver</h2>
<form action="/registration/driver" method="post">
    Login
    <input type="text" name="login">
    <br>

    Password
    <input type="password" name="password">
    <br>

    First Name
    <input type="text" name="firstName">
    <br>

    Last Name
    <input type="text" name="lastName">
    <br>

<#--    Birth Date-->
<#--    <input type="date" name="birthDate">-->
<#--    <br>-->

    Phone Number
    <input type="text" name="phoneNumber">
    <br>

    Category
    <input type="text" name="category">
    <br>

    Driving experience
    <input type="number" min="0" name="drivingExperience">
    <br>

    Transport info
    <input type="text" name="transportInfo">
    <br>

    <input type="submit" value="Registration">
</form>

</body>

</html>
