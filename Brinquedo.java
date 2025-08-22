package TrabalhoFinal;
public class Brinquedo{
    private Categoria categoria;
    private String cor;
    private String nome;

    public Categoria getCat(){
        return this.categoria;
    }
    public void setCat(Categoria categoria){
        this.categoria=categoria;
    }

    public String getCor(){
        return cor;
    }
    public void setcor(String cor){
        this.cor+=cor;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome+=nome;
    }

}

