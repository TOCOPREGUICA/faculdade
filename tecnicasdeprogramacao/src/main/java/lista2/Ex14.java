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

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com>
 * @date 03/03/2024
 * @brief class Ex14
 */
public class Ex14 {
    public static void main(String[] args) {
        int maximo = 1000;
        int cntPrimo = 0;

        System.out.println("Números primos de 1 a 1000:");

        for (int i = 2; i <= maximo; i++) {
            if (primo(i)) {
                cntPrimo++;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nQuantidade de números primos de 1 a 1000: " + cntPrimo);
    }
    public static boolean primo(int num) {
        //fiz uma funcao para verificar se ele e um numero primo
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
