/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliaçao5;


/**
 *
 * @author yasmi
 */
public class Avaliaçao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        
        
        DecimalFormat f = new DecimalFormat("0.00"); 
        int codigo;
        double salario, novoSal, aumento, dif; 

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe seu código de cargo:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário atual:"));

        switch(codigo) {
            case 310:
                novoSal = ((salario * 5.0)/100);
                aumento = novoSal + salario;
                break;
            case 456:
                novoSal = ((salario * 7.5)/100);
                aumento = novoSal + salario;
                break;
            case 885:
                novoSal = ((salario *10.0)/100);
                aumento = novoSal + salario;
                break;
            default:
                novoSal = ((salario * 15)/100);
                aumento = novoSal + salario;
                break;
        }
        dif = aumento - salario;
        JOptionPane.showMessageDialog(null, "Seu salário era de R$"+f.format(salario)
                +"\nSeu novo salário é de R$"+f.format(aumento)
                +"\nA diferença dos salários é de R$"+f.format(dif));
    }

}
    
    
    
    