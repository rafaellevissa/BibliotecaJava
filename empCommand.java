package BibliotecaJava;

public class empCommand implements Command {
   // private Usuario usr;
    //private Material mat;
    //public empCommand(usr, mat) {
    //    this.usr=usr;
    //    this.mat=mat;
    //}
    
    @Override
    public void execute(Object arg1,Object arg2) {
       Usuario user=(Usuario) arg1;
       Material mat =(Material) arg2;
      //System.out.println("acao de emprestimo.");  
    }
}
