package TrabalhoFinal;
public class Categoria{
    private double preco;
    private String desc;
    private String faixa_et;

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco+=preco;
    }

    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc+=desc;
    }

    public String getFaixa(){
        return faixa_et;
    }
    public void setFaixa(String faixa_et){
        this.faixa_et+=faixa_et;
    }
}
