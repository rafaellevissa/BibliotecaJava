package BibliotecaJava;

import java.util.ArrayList;

public abstract class Usuario {
    private int codigo;
    private String nome;
    private ArrayList<Emprestimo> MeusEmprestimos = new ArrayList<Emprestimo>();
    
    public boolean reservar(){
      return true;  
    }
    public abstract boolean RealizarEmprestimo();
    public abstract boolean DevolverEmprestimo();
        
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public Usuario(int codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }
}
