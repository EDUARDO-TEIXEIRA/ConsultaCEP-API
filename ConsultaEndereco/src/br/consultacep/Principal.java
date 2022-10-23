package br.consultacep;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = IntegracaoAPI.buscaCep(cep);

        System.out.println("CEP Consultado: ");
        System.out.println("Complemento: ");
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
        System.out.println("DDD: " + endereco.getDdd());

    }   
}
