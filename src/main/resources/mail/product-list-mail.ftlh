<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product list</title>
    <style>
        table, tr, td {
            border: black solid;
            border-collapse: collapse;
            padding: 5px;
        }
    </style>
</head>
<body>
<h1 style="color: blue">Список продуктов</h1>
<h2>Добрый день, ${name}!</h2>
<p>Благодарим за использовние нашего сайта.</p>
<p>Ваш список продуктов в DiaHelper:</p>
<table>
    <tr>
        <td>Наименование</td>
        <td>Калории</td>
    </tr>

<#list request?keys as key>
    <tr>
        <td>${key}</td>
        <td>${request[key]}</td>
    </tr>
</#list>

</table>

<p></p>
<p>Желаем Вам хорошено дня!</p>
<p>С уважением команда DiaHelper</p>

</body>
</html>