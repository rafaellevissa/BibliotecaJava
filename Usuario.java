/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author levi
 */
public abstract class Usuario {
    private int codigo;
    private String nome;
    
    public boolean reservar(){
      return true;  
    }
    public abstract boolean emprestar();
    public boolean devolver(){
        return true;
    }
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
