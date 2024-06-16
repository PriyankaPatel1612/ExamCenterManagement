
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <!--CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h2>Student Registration</h2>
            <form action="StudentController" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" class="form-control" id="username">
                </div>
                <div class="form-group">
                    <label for="name">Student Name:</label>
                    <input type="text" class="form-control" id="name">
                </div>
                <div class="form-group">
                    <label for="address">Address:</label>
                    <input type="text" class="form-control" id="address">
                </div>
                <div class="form-group">
                    <label for="contact">Contact:</label>
                    <input type="text" class="form-control" id="contact">
                </div>
                <div class="form-group">
                    <label for="fee">Fees:</label>
                    <input type="text" class="form-control" id="fee">
                </div>
                <div class="form-group">
                    <label for="admission_date">Admission Date:</label>
                    <input type="date" class="form-control" id="admission_date">
                </div>
                <div class="form-group">
                    <label for="course">Course:</label>
                    <input type="text" class="form-control" id="course">
                </div>
                <div class="form-group">
                    <label for="payment">Payment:</label>
                    <input type="text" class="form-control" id="payment">
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd">
                </div>
                <div class="checkbox">
                    <label><input type="checkbox"> Remember me</label>
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

        <!--JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
