package ejemplo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class operaciones 
{

    Scanner sc = new Scanner(System.in);
    static int n, vec[];

    public operaciones(int n, int vec[]) 
    {
        this.vec = vec;
        this.n = n;
        this.n = n;
    }

    public static String llenarvector() 
    {
        String vector="";
        for (int i = 0 ; i < n; i++) 
        {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número para la posicion " + (i+1) + ":"));
            if(vec[i]%2==0)
                vector+=vec[i]+"\n";
        }
        
        return vector;
    }
}
    
    /*public static void esprimo(int vec[])
    {
        int cont=1;
        for(int i=0; i<n;i++)
        {
            for(int j=1; j<n;j++)
            {
                if(vec[i]%j==0)
                  cont+=1;  
            }
        }
            if(cont==2)
                JOptionPane.showMessageDialog(null, "Es primo");
            else
                JOptionPane.showMessageDialog(null, "NO es primo");                 
    }
}*/
