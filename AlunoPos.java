/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author levi
 */
public class AlunoPos extends Usuario{
    @Override
    public boolean emprestar(){
        return true;
    }
    public AlunoPos(int codigo, String nome){
        super(codigo,nome);
    }
}
