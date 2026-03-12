<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../assets/css/style.css">

    <style>
        .container {
            display: grid;
            grid-template-columns: 1fr 1fr;
            place-items: center;
            height: 80vh;
        }

        input {
            display: block;
            margin-bottom: 10px;
            padding: 5px;
            width: 300px;
        }

        button {
            padding: 5px;
        }
    </style>
</head>

<body>
    <h1 style="text-align: center; margin-top:10px">Login</h1>
    <div class="container">
        <div class="left">
            <h3>Lets take you in!</h3>
        </div>
        <div class="right">
            <form action="../auth/login.php" method="post">
                <label for="email">Email</label>
                <input type="text" name="email" id="email">
                <label for="password">Password</label>
                <input type="password" name="password" id="password">
                <button>Login</button>
            </form>
        </div>
    </div>
</body>

</html>