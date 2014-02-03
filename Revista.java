package BibliotecaJava;

public class Revista extends Material {
    private int edicao;
    private String mes;
    private int ano;
    
    public int getEdicao(){
        return edicao;
    }
    public String getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public Revista(int codigo, String titulo,int edicao, String mes, int ano){
        super(codigo, titulo,"Revista");
        this.edicao=edicao;
        this.mes=mes;
        this.ano=ano;
    }
}
