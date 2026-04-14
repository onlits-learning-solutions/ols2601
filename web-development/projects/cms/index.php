<?php
include $_SERVER['DOCUMENT_ROOT'] . "/src/App/Controllers/UserController.php";

$request = $_SERVER['REQUEST_URI'];

switch($request)
{
    case '/':
        include $_SERVER['DOCUMENT_ROOT'] . '/pages/public/home.php';
        break;
    case '/user/login':
        include $_SERVER['DOCUMENT_ROOT'] . "/pages/user/login.php";
        break;
    case '/user/authenticate':
        UserController::authenticate();
        break;
    default:
        include $_SERVER['DOCUMENT_ROOT'] . "/pages/public/error.php";
}
