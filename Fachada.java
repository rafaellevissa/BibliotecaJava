package BibliotecaJava;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class Fachada {
    public ArrayList<Reserva> reservas=new ArrayList<Reserva>();
    public ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    public static ArrayList<Exemplar> exemplares=new ArrayList<Exemplar>();
    private static HashMap cmds = new HashMap();
    private static HashMap ListaUsers = new HashMap();
    private static HashMap ListaMats = new HashMap();
    private Fachada(){}
    private static Fachada instancia;
    public static Fachada obterInstancia(){
        if(instancia == null){
            instancia = new Fachada();
            PreencerListaCommands();
            inicializarBaseDados();
        }
        return instancia;
    }
    public HashMap GetListaMats(){
        return ListaMats;
    }
    private static void PreencerListaCommands(){
        cmds.put("emp", new empCommand());
        cmds.put("dev", new devCommand());
        cmds.put("res", new resCommand());
        cmds.put("mat", new matCommand());
        cmds.put("usr", new usrCommand());
    }
    
    public static void inicializarBaseDados(){
        ListaUsers.put("123", new AlunoGraduacao(123,"JoÃƒÂ£o da  Silva"));
        ListaUsers.put("456",  new AlunoPos(456,"Luiz Fernando Rodrigues"));
        ListaUsers.put("789",  new AlunoGraduacao(789,"Pedro Paulo"));
        ListaUsers.put("100",  new Professor(100,"Carlos Lucena"));
        
        ListaMats.put("100",  new Livro(100,"Engenharia de Software", "Addison Wesley", "Ian Sommervile",6,2000));
        ListaMats.put("101",  new Livro(101,"UML - Guia do UsuÃƒÂ¡rio","Campus","Grady Booch, James Rumbaugh, Ivar Jacobson",7,2000));
        ListaMats.put("200",  new Revista(200,"IEEE Transactions on Software Engineering",53,"Setembro",2006));
        ListaMats.put("201",  new Revista(201,"IEEE Transactions on Software Engineering",54,"Outubro",2006));
        ListaMats.put("300",  new Cd(300,"Back To Black","Amy Winehouse","Rehab, You Know I'm No Good, Me & Mr Jones", 2006));
        ListaMats.put("301",  new Cd(301,"IÃƒÂª IÃƒÂª IÃƒÂª", "Arnaldo Antunes", "Longe, Invejoso, Envelhecer", 2009));
        ListaMats.put("400",  new  Dvd(400,"Indiana Jones and the Kingdom of the Crystal Skull","Harrison Ford, Cate Blanchett",2008,4));
        ListaMats.put("401",  new  Dvd(401,"Incredible Hulk","William Hurt, Tim Blake Nelson", 2008,4));
        
        exemplares.add(new Exemplar(100,1,"DisponÃƒÂ­vel"));
        exemplares.add(new Exemplar(100,2,"DisponÃƒÂ­vel"));
        exemplares.add(new Exemplar(101,3,"DisponÃƒÂ­vel"));
        exemplares.add(new Exemplar(200,4,"DisponÃƒÂ­vel"));
        exemplares.add(new Exemplar(201,5,"DisponÃƒÂ­vel"));
        exemplares.add(new Exemplar(300,6,"DisponÃƒÂ­vel"));
        exemplares.add(new Exemplar(300,7,"DisponÃƒÂ­vel"));
        exemplares.add(new Exemplar(400,8,"DisponÃƒÂ­vel"));
        exemplares.add(new Exemplar(400,9,"DisponÃƒÂ­vel"));  
    }
    
    public int GetCodExemplarDisponivel(int cod_mat){
        Interator<Exemplar> interator=exemplares.interator();
        while(interator.)
    } 
    
    
    public void invoke(String linha_cmd){
        String args[] = linha_cmd.split(" ");
        int qtd_arg =args.length; 
        String cmd = args[0];
        Command c = (Command) cmds.get(cmd); //retorna a classe correspondente ao comando cmd
        Object usr,mat;
        
        //teste para ver se hÃƒÂ¡ mais argumentos. 
        //ex.: se argumento for 'fim' a aplicacao encerra, mas se houverem 2 ou 3 argumentos ÃƒÂ© tratado o comando
        if(qtd_arg>1){ 
            //o uso deste switch ÃƒÂ© para tratar as exceÃƒÂ§ÃƒÂµes onde temos apenas 2 parametros de comando ao invez de um
            //ex.: caso padrÃƒÂ£o: 3 argumentos:
            //  emp 100 100 (comando, id_user, id_mat)
            //  dev 100 20 (comando, id_user, id_mat)
            //ex.: casos particulares
            //mat 100 (comando, id_mat)
            //usr 100 (comando, id_user)
            //nesses dois casos o segundo argumento assume papeis diferentes (id_usr ou id_mat) a depender do comando 
            //(consulta de mat ou consulta de usr)
            switch (cmd) {
                case "mat":
                    {
                        String id_mat = args[1];
                        usr = null; //como eh consulta de material o paramero usr ÃƒÂ© nulo
                        mat = (Material) cmds.get(id_mat);
                        break;
                    }
                case "usr":
                    {
                        String id_user = args[1];
                        usr = (Usuario) cmds.get(id_user);
                        mat = null; //como eh consulta de usuario o parametro mat eh nulo
                        break;
                    }
                default:
                    {
                        String id_user = args[1];
                        String id_mat = args[2];
                        usr = (Usuario) cmds.get(id_user);
                        mat = (Material) cmds.get(id_mat);
                        break;
                    }
            }
              
         c.execute(usr,mat); 
        }
    }
}
