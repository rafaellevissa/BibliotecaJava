/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author levi
 */
public abstract class Material {
    private int codigo;
    private String titulo;
    
    public int getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public Material(int codigo, String titulo){
        this.codigo=codigo;
        this.titulo=titulo;
    }
}
