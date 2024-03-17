/*
 * Copyright (C) 2024 Felipe Borges Carvalho <felipeborgesmelo80@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package veiculos;

import java.util.Scanner;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com>
 * @date 16/03/2024
 * @brief class principal
 */
public class principal {
     public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        int ano,assentos, eixos , cavalos, portas, cilindradas;
        int opcao;
        
        String placa;
        
        opcao = 0;
        while (opcao != 5) {
            System.out.println("");
            System.out.println("");
            System.out.println("Escolha um Veiculo: \n1 ­ Onibus; \n2 ­ Caminhao; \n3 ­ Carro; \n4 ­ Motocicleta; \n5 ­ sair;");
                    

            opcao = ler.nextInt();
            System.out.println("");
            System.out.println("");
            if (opcao == 1) {
                System.out.println("Informe a quantos Assentos: ");
                assentos = ler.nextInt();

                System.out.println("Informe o Ano do Veiculo: ");
                ano = ler.nextInt();

                System.out.println("Informe a Placa do do Veiculo: ");
                placa = ler.next();

                Onibus onibus = new Onibus(placa, ano, assentos);
                System.out.println(onibus);

            } else if (opcao == 2) {
                System.out.println("Informe a quantos eixos: ");
                eixos = ler.nextInt();

                System.out.println("Informe o Ano do Veiculo: ");
                ano = ler.nextInt();

                System.out.println("Informe a Placa do do Veiculo: ");
                placa = ler.next();
                
                Caminhao caminhao = new Caminhao(placa, ano, eixos);
                System.out.println(caminhao);

            }else if (opcao == 3) {
                System.out.println("Informe a quantos Cavalos tem o motor: ");
                cavalos = ler.nextInt();
                
                System.out.println("Informe a quantas Portas: ");
                portas = ler.nextInt();

                System.out.println("Informe o Ano do Veiculo: ");
                ano = ler.nextInt();

                System.out.println("Informe a Placa do do Veiculo: ");
                placa = ler.next();

                Carro carro = new Carro(placa, ano, cavalos, portas);
                System.out.println(carro);

            }else if (opcao == 4) {
                System.out.println("Informe a quantas Cilindradas: ");
                cilindradas = ler.nextInt();

                System.out.println("Informe o Ano do Veiculo: ");
                ano = ler.nextInt();

                System.out.println("Informe a Placa do do Veiculo: ");
                placa = ler.next();

                Motocicleta motocicleta = new Motocicleta(placa, ano, cilindradas);
                System.out.println(motocicleta);

            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção invalida!");

            }
        }
    }
}
