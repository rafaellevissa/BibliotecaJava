package BibliotecaJava;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class usrCommand implements Command {
    private static  Fachada fachada;
    
    @Override
    public void execute(Object arg1,Object arg2) {
      fachada = Fachada.obterInstancia();
      Usuario user = (Usuario)arg1;
      Material mat;
      Emprestimo emprestimoAtual;
      Iterator<Emprestimo> Iterator = fachada.emprestimos.iterator();
      
      System.out.print("UsuÃ¡rio: ");
      System.out.print(user.getCodigo());
      System.out.print(" - ");
      System.out.println(user.getNome());
      System.out.println("________________________________________________________");
      
      while(Iterator.hasNext()){
          emprestimoAtual=Iterator.next();
          if(emprestimoAtual.getCodUsuario()==user.getCodigo()){
              HashMap ListaMat = fachada.GetListaMats();//recebe a lista de materiais de fachada
              mat = (Material)ListaMat.get(emprestimoAtual.getCodMaterial()); // retorna o material de codigo igual ao material atual
              System.out.println("Cod    Nome do Material Tipo  DataEmprestimo   Status   DataDevoluÃ§Ã£o ");
              System.out.print(mat.getCodigo());
              System.out.print(mat.getTitulo());
              System.out.print(mat.getTipo());
              System.out.print(emprestimoAtual.getDataEmprestimo());
              System.out.print(emprestimoAtual.getStatus());
              System.out.println(emprestimoAtual.getDataDevolucao());
          }
      }
    }
}
