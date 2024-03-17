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
 * @brief class Caminhao
 */
public class Caminhao extends Veiculo
{
    private int eixo;    
       
    public Caminhao(String placa, int ano, int eixo) {
        super(placa,ano);
        this.eixo = eixo;
    }
        
    public void setEixo(int eixo) {
        this.eixo = eixo;
    }
      
    public int getEixo() {
        return eixo;
    }

    @Override
    public String toString() {
        return "Caminhao \n - Placa= " + super.getPlaca() + "\n - Ano= " + super.getAno() + "\n - Eixos= "+ eixo;
    }

}
