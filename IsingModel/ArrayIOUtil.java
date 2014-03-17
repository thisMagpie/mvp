/**
 * ArrayIOUtil.java
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

import java.io.*;
import java.util.Scanner;

public class ArrayIOUtil {

    public static void printDistribution(int[][] data) {
        String point = new String();
        for (int i=0;i<data.length;i++){
            for (int j=0;j<data[0].length;j++){
                point += "\n" + j + "\t" + data[i][j] + "\t";
                for ( int k = 0; k < data[i][j]; k++ ) point += "*";
            }
            System.out.println(point);
        }

    }
}
