package biblioteca;

/**
 *
 * @author levi
 */
public class AlunoGraduacao extends Usuario{
    @Override
    public boolean emprestar(){
        return true;
    }
    public AlunoGraduacao(int codigo, String nome){
        super(codigo,nome);
    }
    public RealizarEmprestimo(int CodEzemplar){
        
    }
}
