public class Emprestimo {
    private Exemplar exemplar;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    
    public Exemplar getExemplar(){
        return exemplar;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public Date getDataEmprestimo(){
        return dataEmprestimo;
    }
    public Date getDataDevolucao(){
        return dataDevolucao;
    } 
}
