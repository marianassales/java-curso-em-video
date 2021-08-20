package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author mariana
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        // TODO code application logic here
    
        // Need to import java.util.Scanner for imput data
        
        Scanner teclado = new Scanner(System.in); // importação automática no net beans => cabeçario
        // teclado é um objeto
        System.out.println("Digitei o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %S é %.1f \n", nome, nota);
        
    }
    
}
