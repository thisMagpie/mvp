/**
 * Lattice.java
 * ==============
 *
 * Copyright (C) 2014 Magdalen Berns <m.berns@sms.ed.ac.uk>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

class Lattice {

    /**
    * @initSpins
    *                 Static method to init n by n matrix with
    *                 up or spin
    * @param length:
    *                An lenth of array to initialise with spins
    * @return:
    *                the array with up and down spins
    */
    public static int[][] initSpins(int length) {
        int[][] spin = new int[length][length];
        for (int i = 0; i < spin.length; i++) {
            for (int j = 0; j < spin.length; j++) {
                if (Math.random() < 0.5) spin[i][j] = 1;
                else spin[i][j] = -1;
            }
        }
        return spin;
    }

    /**
    * @printSpins:
    *                Static method to init n by n matrix with
    *                up or spin
    * @param spin:
    *                An lenth of a array to initialise with spins
    * @return:
    *                the array with up and down spins
    */
    public static void printSpins(int[][] spin) {
        String point = new String();
        for (int i=0;i<spin.length;i++){
            for (int j=0;j<spin[0].length;j++){
                if (spin[i][j] == 1) point += " ";
                else point += "*";
            }
            System.out.print(point);
        }
    }
    /**
    * @flipSpins:
    *                Does exactly what it says on the tin.
    * @param spin:
    *                integer spin element
    * @return:
    *                updated'flipped' spin
    */
    public static int[][] flipSpin(int spin){
        return - 1 * spin;
    }

  int normalize(int target, int modulo) {
    if (target >= 0) {
      return target % modulo;
    } else {
      return (target + modulo*(1 + Math.abs(target/modulo))) % modulo;
    }
  }



}
