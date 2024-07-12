/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author trixti
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int n[] = new int[4];
        n [0] = 3;
        n [1] = 5;
        n [2] = 6;
        n [3] = 8;
        */
        
        // int n[] = {3,5,6,8};
        
        int n[] = {3,5,7,9,11,13};
        //System.out.println("O taotal de N é " + n.length);
        for (int c=0;c<=n.length-1;c++) {
            System.out.println("Na posição " + c + " temos o valor " + n [c]);
        }
    }
    
}
