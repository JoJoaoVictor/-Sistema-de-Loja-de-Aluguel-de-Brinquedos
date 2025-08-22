package TrabalhoFinal;
public class Funcionario extends Pessoa{
    private int ID;
    private double salario;
    private String datacontratacao;
    
public void setID(int iD) {
    ID = iD;
}
public int getID() {
    return ID;
}
public void setdatacontratacao(String data) {
    this.datacontratacao=data;
}
public String getdatacontratacao() {
    return datacontratacao;
}
public void setSalario(double salario) {
    this.salario = salario;
}
public double getSalario() {
    return salario;
}

}   