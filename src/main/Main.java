package Faculdade.ProjetoJava.src.main;

import Faculdade.ProjetoJava.src.modelo.Financiamento;
import Faculdade.ProjetoJava.src.util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario user = new InterfaceUsuario();
        List<Financiamento> lista = new ArrayList<>();

        //contador de Financiamentos
        int numero = 0;
        double valorTotalImovel = 0;
        double valorTotalFinanciamento = 0;
        

        System.out.println("SISTEMA PARA CALCULAR FINANCIAMENTO");

        for (int i = 0; i < 4; i++){
            System.out.println("Financiamento [ " + (i+1) + " ]");
            lista.add(new Financiamento(user.setValorImovel(0), user.setPrazoFinanciamento(0), user.setTaxaJurosAnual(0)));
        }

        for (Financiamento elemento : lista){            
            numero++;
            double valorImovel = elemento.getValorImovel();
            double valorFinanciamento = elemento.totalPagamento();
            valorTotalImovel += valorImovel;
            valorTotalFinanciamento += valorFinanciamento;
            System.out.println("Financiamento "+ (numero) + " : " + elemento);

            
        }

        System.out.println("Total de todos os Imoveis: "+ valorTotalImovel);
        System.out.println("Total do Financiamento: " + valorTotalFinanciamento);
    }
    
}
