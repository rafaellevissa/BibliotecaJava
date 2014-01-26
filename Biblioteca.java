/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.*;

/**
 *
 * @author levi
 */
public class Biblioteca {
    private Material[] materiais;
    private Usuario[] usuarios;
    private Reserva[] reservas;
    private Emprestimo[] emprestimos;
    private Exemplar[] exemplares;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public void inicializar(){
        usuarios[usuarios.length] = new AlunoGraduacao(123,"João da  Silva");
        usuarios[usuarios.length] = new AlunoPos(456,"Luiz Fernando Rodrigues");
        usuarios[usuarios.length] = new AlunoGraduacao(789,"Pedro Paulo");
        usuarios[usuarios.length] = new Professor(100,"Carlos Lucena");
        materiais[materiais.length] = new Livro(100,"Engenharia de Software", "Addison Wesley", "Ian Sommervile",6,2000);
        materiais[materiais.length] = new Livro(101,"UML - Guia do Usuário","Campus","Grady Booch, James Rumbaugh, Ivar Jacobson",7,2000);
        materiais[materiais.length] = new Revista(200,"IEEE Transactions on Software Engineering",53,"Setembro",2006);
        materiais[materiais.length] = new Revista(201,"IEEE Transactions on Software Engineering",54,"Outubro",2006);
        materiais[materiais.length] = new Cd(300,"Back To Black","Amy Winehouse","Rehab, You Know I'm No Good, Me & Mr Jones", 2006);
        materiais[materiais.length] = new Cd(301,"Iê Iê Iê", "Arnaldo Antunes", "Longe, Invejoso, Envelhecer", 2009);
        materiais[materiais.length] = new  Dvd(400,"Indiana Jones and the Kingdom of the Crystal Skull","Harrison Ford, Cate Blanchett",2008,4);
        materiais[materiais.length] = new  Dvd(401,"Incredible Hulk","William Hurt, Tim Blake Nelson", 2008,4);
        exemplares[exemplares.length] = new Exemplar(100,1,"Disponível");
        exemplares[exemplares.length] = new Exemplar(100,2,"Disponível");
        exemplares[exemplares.length] = new Exemplar(101,3,"Disponível");
        exemplares[exemplares.length] = new Exemplar(200,4,"Disponível");
        exemplares[exemplares.length] = new Exemplar(201,5,"Disponível");
        exemplares[exemplares.length] = new Exemplar(300,6,"Disponível");
        exemplares[exemplares.length] = new Exemplar(300,7,"Disponível");
        exemplares[exemplares.length] = new Exemplar(400,8,"Disponível");
        exemplares[exemplares.length] = new Exemplar(400,9,"Disponível");
        
        
    }
    public Material[] getMateriais(){
        
    }
    public Usuario[] getUsuarios(){
        
    }
    public Reserva[] getReservas(){
    
    }
    public Emprestimo[] getEmprestimos(){
        
    }
    public Exemplar[] getExemplares(){
        
    }
    
    public void setMateriais(){
        
    }
    public void setUsuarios(){
        
    }
    public void setReservas(){
    
    }
    public void setEmprestimos(){
        
    }
    public void setExemplares(){
        
    }
    
}
