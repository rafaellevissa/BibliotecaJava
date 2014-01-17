public class Biblioteca {
    private Material[] materiais;
    private Usuario[] usuarios;
    private Reserva[] reservas;
    private Emprestimo[] emprestimos;
    private Exemplar[] exemplares;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public void inicializar(){
        Scanner in = new Scanner(System.in);
        int qnt;
        System.out.println("digite a quantidade de cds");
        qnt=in.nextInt();
        String autores;
        int faixas;
        int ano;
        String codigo;
        String titulo;
        for (int i=0;i<qnt;i++){
            System.out.println("Cd " + Integer.toString(i+1));
            System.out.println("Autores:");
            autores=in.nextLine();
            System.out.println("numero de faixas:");
            faixas=in.nextInt();
            System.out.println("ano:");
            ano=in.nextInt();
            System.out.println("código:");
            codigo=in.nextLine();
            System.out.println("Título:");
            titulo=in.nextLine();
            materiais[materiais.length] = new Cd(autores,faixas,ano,codigo,titulo);
        }
        
        System.out.println("digite a quantidade de dvds");
        qnt=in.nextInt();
        
        for (int i=0;i<qnt;i++){
            System.out.println("DVD " + Integer.toString(i+1));
            System.out.println("Autores:");
            autores=in.nextLine();
            System.out.println("numero de faixas:");
            faixas=in.nextInt();
            System.out.println("ano:");
            ano=in.nextInt();
            System.out.println("código:");
            codigo=in.nextLine();
            System.out.println("Título:");
            titulo=in.nextLine();
            materiais[materiais.length] = new Cd(autores,faixas,ano,codigo,titulo);
        }
        
        
        
    }
    public Material[] getMateriais(){
        
    }
    public Usuario[] getUsuarios(){
        
    }
    public Reserva[] getReservas(){
    
    }
    public Emprestimo[] getEmprestimos(){
        
    }
    public Exemplar[] getExemplares(){
        
    }
    
    public void setMateriais(){
        
    }
    public void setUsuarios(){
        
    }
    public void setReservas(){
    
    }
    public void setEmprestimos(){
        
    }
    public void setExemplares(){
        
    }
    
}
