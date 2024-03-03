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

package lista1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com>
 * @date 03/03/2024
 * @brief class Ex2
 */

public class Ex2 {
     public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
         int a, b, c, d;

    a = ler.nextInt();
     b = ler.nextInt();
      c = ler.nextInt();
       d = ler.nextInt();

    if(b > c && d>a && c+d>a+b && a%2==0)
    {
     System.out.println("Valores aceitos");
    }
    else
    {
    System.out.println("Valores nao aceitos");
    }
    }
}
