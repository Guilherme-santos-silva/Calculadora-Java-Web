<%@page import="Calculadora.Operacoes"%>

<%
    //cria objeto Operacoes e instancia
    Calculadora.Operacoes operacoes = new Calculadora.Operacoes();
    
    //pega os valores do formulario passado e utilizamos os metodos da classe
    operacoes.setValor1(request.getParameter("valor1"));
    operacoes.setValor2(request.getParameter("valor2"));
    operacoes.setOperacao(request.getParameter("operacao"));
    
    if(operacoes.Validar()){
        //se for verdadeiro mostra a mensagem
        out.print(operacoes.getMensagem());
    }
    else{
        //senao mostra o calculo
        out.print("Resultado é: " + operacoes.Calcular());
    }
    
%>

<a href="index.jsp">Voltar</a>