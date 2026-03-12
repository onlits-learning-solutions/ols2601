<?php
$fact = 1;
$n = readline("Enter a number: ");
for ($i = 1; $i <= $n; $i++) {
    $fact *= $i;
}

echo "$n! = $fact\n";
