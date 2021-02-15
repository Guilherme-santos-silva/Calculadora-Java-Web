<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <form action="saida.jsp" method="post">
           
            <select name="operacao">
                <option value="adicao">Adição<option/>
                <option value="subtracao">Subtração<option/>
                <option value="multiplicacao">Multiplicação<option/>
                <option value="divisao">Divisão<option/>
            </select>
            
            <input type="text" name="valor1" placeholder="primeiro valor" value=""/>
            <input type="text" name="valor2" placeholder="segudo valor" value=""/>
            <input type="submit" name="bt" name="Calcular"/>
            
        <form/>
    </body>
</html>
