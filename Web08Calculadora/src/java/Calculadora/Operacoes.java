package Calculadora;

public class Operacoes {
    
    //atributos da classe
    private double Valor1;
    private double Valor2;
    private String Operacao;
    
    //variavel de mensagen de erro
    //inicinado a variavel
    private String Mensagem = "";
    
    //getter e setter
    /**
     * 
     * @param v1 recebe o valor 1 para realizar o calculo (tipo String)
     */
    //atribuindo e verificando se ha erros
    public void setValor1(String v1) {
        //tratamento de erros
        try {
            //se estiver correto entao atribui o valor a variavel
            this.Valor1 = Double.parseDouble(v1);
        } 
        catch (NumberFormatException e) {
            //se der um erro
            this.Mensagem += "<br>o valor 1 parece não ser um número válido!</br>";
        }  
    }

    public void setValor2(String v2) {
        //tratamento de erros
        try {
            //se estiver correto entao atribui o valor a variavel
            this.Valor2 = Double.parseDouble(v2);
        } 
        catch (NumberFormatException e) {
            //se der um erro
            this.Mensagem += "<br>o valor 2 parece não ser um número válido!</br>";
        } 
    }

    //atribuindo valor a operação solicidata
    public void setOperacao(String Operacao) {
        this.Operacao = Operacao;
    }

    //retorna a mensagem de erro
    public String getMensagem() {
        return Mensagem;
    }
    
    //metodo para verificar se existe valor na variavel mensagem
    //vai ser verificado na pagina saida.jsp
    public boolean Validar(){
        //retorna true caso a variavel mensagem não estiver vazia
        return !Mensagem.equals("");
    }
    
    //metodo que efetua a operação desejada e retorna o vaor em double
    public double Calcular(){
        double Resultado = 0.0;
        
        //realiza a seleção da operação
        switch(Operacao){
            case "adicao":
                Resultado = (Valor1 + Valor2);
                break;
            case "subtracao":
                Resultado = (Valor1 - Valor2);
                break;
            case "multiplicacao":
                Resultado = (Valor1 * Valor2);
                break;
            case "divisao":
                Resultado = (Valor1 / Valor2);
                break;
        }

        //retorna o valor calculado
        return Resultado;
    }
    
}
