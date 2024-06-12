package Faculdade.ProjetoJava.src.modelo;

public class Financiamento {
    
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double pagamentoMensal(){
        return (valorImovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12));
    }

    public double totalPagamento(){
        return pagamentoMensal() * prazoFinanciamento * 12;
    }

    public double getValorImovel(){
        return this.valorImovel;
    }
    public int getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }
    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    public String toString() {
        return " [" +
                "valor do imovel = " + valorImovel +
                ", Valor do Financiamento = " + totalPagamento() +
                ']';
    }

}
