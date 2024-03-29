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
 * @brief class Ex9
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int a,b,c;
        System.out.println("primeiro lado");
    a = sc.nextInt();
    System.out.println("segundo lado");
    b = sc.nextInt();
    System.out.println("terceiro lado");
    c = sc.nextInt();
    
    if(a == b && a==c && b==c){
        System.out.println("equilátero");
    }else{
       if(a!=b && a!=c && b!=c){
           System.out.println("escaleno");
       }else{
           System.out.println("isócelos");
       }
    }
    
    }
}
