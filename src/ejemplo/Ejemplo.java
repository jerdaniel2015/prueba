package ejemplo;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del vector"));
        int vec[] = new int[n];
        operaciones op = new operaciones(n, vec);
        JOptionPane.showMessageDialog(null, "Los numeros pares del vector son:\n "+ op.llenarvector()+"\n");
            

    }

}
