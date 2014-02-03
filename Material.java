package BibliotecaJava;

public abstract class Material {
    private int codigo;
    private String titulo;
    private String tipo;
    
    public int getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getTipo(){
        return tipo;
    }
    public Material(int codigo, String titulo,String tipo){
        this.codigo=codigo;
        this.titulo=titulo;
        this.tipo=tipo;
    }
}
