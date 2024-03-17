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

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com>
 * @date 16/03/2024
 * @brief class Carro
 */
public class Carro extends Veiculo{
private int cavalos;
private String chassis;
private int portas;
    
       
    public Carro(String placa, int ano, int cavalos, int portas) {
        super(placa,ano);
        this.cavalos = cavalos;
        this.portas = portas;
        
    }
    
    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }
      
    public int getCavalos() {
        return cavalos;
    }
    
    public void setPortas(int portas) {
        this.portas = portas;
    }
      
    public int getPortas() {
        return portas;
    }
    
    
    
    @Override
    public String toString() {
        return "Carro \n - Placa= " + super.getPlaca() + "\n - Ano= " + super.getAno()+ "\n - Portas= "+ portas + "\n - Cavalos= "+ cavalos;
    }
    
}
