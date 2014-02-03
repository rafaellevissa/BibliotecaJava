package BibliotecaJava;

public class Professor extends Usuario{
    @Override
    public boolean emprestar(){
        return true;
    }
    public Professor(int codigo, String nome){
        super(codigo,nome);
    }
}
