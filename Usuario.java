public abstract class Usuario {
    private String codigo;
    private String nome;
    
    public boolean reservar(){
      return true;  
    }
    public abstract boolean emprestar();
    public boolean devolver(){
        return true;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
}
