package BibliotecaJava;
import java.util.*;

public class Emprestimo {
    private int cod_material;
    private int cod_exemplar;
    private int cod_usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String status;
    
    public int getCodExemplar(){
        return cod_exemplar;
    }
    public int getCodMaterial(){
        return cod_material;
    }
    public int getCodUsuario(){
        return cod_usuario;
    }
    public String getStatus(){
        return status;
    }
    public Date getDataEmprestimo(){
        return dataEmprestimo;
    }
    public Date getDataDevolucao(){
        return dataDevolucao;
    } 
}
