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

package lista2;

import java.util.Scanner;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com>
 * @date 03/03/2024
 * @brief class Ex16
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o tamanho da matriz:");
        int tam = ler.nextInt();
        int linha, coluna;
        int matriz[][];
        matriz = new int[tam][tam];
        for(linha = 0; linha < tam; linha ++){
            for(coluna = 0; coluna < tam; coluna++){
                System.out.println("Escreva o numero no elemento["+linha+"]["+coluna+"]");
                matriz[linha][coluna] = ler.nextInt();
                
            }
           
        }
        
         for(linha = 0; linha < tam; linha ++){
            for(coluna = 0; coluna < tam; coluna++){
                if((linha + coluna) == (tam - 1)){
                    System.out.println(matriz[linha][coluna]);
                } 
            }
         }
            
        
    }
}
