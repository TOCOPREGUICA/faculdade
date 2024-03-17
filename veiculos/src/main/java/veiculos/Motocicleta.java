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
 * @brief class Motocicleta
 */
public class Motocicleta extends Veiculo
{
    private int cilindradas;
       
    public Motocicleta(String placa, int ano, int cilindradas) {
        super(placa,ano);
        this.cilindradas = cilindradas;
    }
        
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
      
    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public String toString() {
        return "Motocicleta \n - Placa= " + super.getPlaca() + "\n - Ano= " + super.getAno() + "\n - Cilindradas= "+ cilindradas;
    }

}
