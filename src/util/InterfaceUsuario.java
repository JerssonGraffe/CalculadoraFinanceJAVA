package Faculdade.ProjetoJava.src.util;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scan = new Scanner(System.in);

    //Metodos 

    public double setValorImovel(double valor){
        

        while (true) {
            System.out.print("Por favor digite o valor o Imovel: ");
            valor = scan.nextDouble();
            if (valor < 0){
                System.out.println("valor invalido");
                continue;
            }
            return valor;
        }
    }

    public int setPrazoFinanciamento(int valor){
        

        while (true) {
            System.out.print("Por favor digite o prazo do financiamento (em Anos): ");
            valor = scan.nextInt();
            if (valor < 0){
                System.out.println("valor invalido");
                continue;
            }
            return valor;
        }
    }

    public double setTaxaJurosAnual(double valor){
        

        while (true) {
            System.out.print("Por favor digite a taxa anual (em percentagem %): ");
            valor = scan.nextInt();
            if (valor < 0 || valor > 10000){
                System.out.println("valor invalido");
                continue;
            }
            return valor;
        }
    }

}
