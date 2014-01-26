/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author levi
 */
public class Exemplar {
    private int codigoMat;
    private int codigoExemp;
    private String status;
    
    public int getCodigoMat(){
        return codigoMat;
    }
    public int getCodigoExemp(){
        return codigoExemp;
    }
    public Exemplar (int codigoMat, int codigoExemp, String status){
        this.codigoMat=codigoMat;
        this.codigoExemp=codigoExemp;
        this.status=status;
    }
}
