public class Cd extends Material{
    private String autores;
    private int faixas;
    private int ano;
    
    public String getAutores(){
        return autores;
    }
    public int getFaixas(){
        return faixas;
    }
    public int getAno(){
        return ano;
    }
    public Cd(String autores, int faixas, int ano, String codigo, String titulo){
        super(codigo,titulo);
        this.ano=ano;
        this.autores=autores;
        this.faixas=faixas;
    }
}
