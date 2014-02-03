package BibliotecaJava;

public class Cd extends Material{
    private String autores;
    private String faixas;
    private int ano;
    
    public String getAutores(){
        return autores;
    }
    public String getFaixas(){
        return faixas;
    }
    public int getAno(){
        return ano;
    }
    public Cd(int codigo, String titulo, String autores, String faixas, int ano){
        super(codigo,titulo,"CD");
        this.ano=ano;
        this.autores=autores;
        this.faixas=faixas;
    }
}
