
package BibliotecaJava;
import java.util.*;
import java.io.Console;

public class Biblioteca {
    private static  Fachada fachada;
    private Material[] materiais;
    private Usuario[] usuarios;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fachada = Fachada.obterInstancia();
        String argumento="";
        Scanner in = new Scanner(System.in);
        while(argumento.equals("fim")==false){
            System.out.println("Digite a linha de comando: ");
            argumento = in.nextLine();
            argumento=argumento.toLowerCase();
            fachada.invoke(argumento);
        }
    }
    
    //limpa a tela
    public static void cls(){
        for(int i=0; i<25;i++)
            System.out.println("");
        System.out.flush();
    }
    
}
