/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author levi
 */
public class Livro extends Material{
    private String editora;
    private String autores;
    private int edicao;
    private int ano;
    
    public String getEditora(){
        return editora;
    }
    public String getAutores(){
        return autores;
    }
    public int getEdicao(){
        return edicao;
    }
    public int getAno(){
        return ano;
    }
    public Livro(int codigo,String titulo, String editora, String autores, int edicao, int ano){
        super(codigo, titulo);
        this.ano=ano;
        this.autores=autores;
        this.edicao=edicao;
        this.editora=editora;       
    }
}
