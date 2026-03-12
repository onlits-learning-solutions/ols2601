<?php
session_start();
if (!isset($_SESSION['email']))
    header("location:login.php");
?>

<img src="../assets/images/logo.png" alt="logo" width="75px" id="logo">