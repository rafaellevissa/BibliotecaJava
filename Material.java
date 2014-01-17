public abstract class Material {
    private String codigo;
    private String titulo;
    
    public String getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public Material(String codigo, String titulo){
        this.codigo=codigo;
        this.titulo=titulo;
    }
}
