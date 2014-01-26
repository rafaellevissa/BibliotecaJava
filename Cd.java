/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author levi
 */
public class Cd extends Material{
    private String autores;
    private String faixas;
    private int ano;
    
    public String getAutores(){
        return autores;
    }
    public String getFaixas(){
        return faixas;
    }
    public int getAno(){
        return ano;
    }
    public Cd(int codigo, String titulo, String autores, String faixas, int ano){
        super(codigo,titulo);
        this.ano=ano;
        this.autores=autores;
        this.faixas=faixas;
    }
}
