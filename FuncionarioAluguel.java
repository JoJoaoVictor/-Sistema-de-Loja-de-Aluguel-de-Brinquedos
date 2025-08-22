package TrabalhoFinal;

public class FuncionarioAluguel extends Funcionario {
    private String localTrabalho;
    private String formacao;
    private double comissao;
public String getlocaltrabalho(){
    return localTrabalho;
}
public void setlocalTrabalho(String localTrabalho){
    this.localTrabalho=localTrabalho;
}
public String getformacao(){
    return formacao;
}
public void setformacao(String formacao){
    this.formacao=formacao;
}
public double getcomissao(){
    return comissao;
}
public void setcomissao(double comissao){
    this.comissao=comissao;
}

@Override
public void setSalario(double salario){
    super.setSalario(salario+this.comissao);
    
}
}
