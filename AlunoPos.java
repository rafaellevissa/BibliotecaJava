package BibliotecaJava;
public class AlunoPos extends Usuario{
    @Override
    public boolean emprestar(){
        return true;
    }
    public AlunoPos(int codigo, String nome){
        super(codigo,nome);
    }
}
