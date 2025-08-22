package TrabalhoFinal;
import javax.swing.JOptionPane;
public class teste{
public static void main (String args[]){
    Cliente cliente1=new Cliente();
    FuncionarioAluguel funcaluguel=new FuncionarioAluguel();
    FuncionarioEntrega funcaentrega= new FuncionarioEntrega();
    Brinquedo brinq= new Brinquedo();
    Alguel aluguel1= new Alguel();
    Categoria cat= new Categoria();
    Boolean continuarAtendimentos=true;
    cliente1.setEmail(JOptionPane.showInputDialog(null,"qual é o email do cliente? "));
    cliente1.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"qual é o cpf do cliente? ")));
    cliente1.setEndereço(JOptionPane.showInputDialog(null,"qual é o endereço do cliente? "));
    cliente1.setNome(JOptionPane.showInputDialog(null,"qual é o nome do cliente?"));
    cliente1.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null,"qual é o telefone do cliente?")));
    cliente1.setdatanascimento(JOptionPane.showInputDialog(null,"qual é a data de nascimento do cliente?"));
    funcaluguel.setNome(JOptionPane.showInputDialog(null,"qual é o nome do funcionário? "));
    funcaluguel.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"qual é o cpf do funcionário?")));
    funcaluguel.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null,"qual é telefone do funcionário?")));
    funcaluguel.setID(Integer.parseInt(JOptionPane.showInputDialog(null,"qua; é o ID do funcionário?")));
    funcaluguel.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"qual é o salario do funcionário?")));
    funcaluguel.setdatacontratacao(JOptionPane.showInputDialog(null,"qual é a data de contratação?"));
    funcaluguel.setlocalTrabalho(JOptionPane.showInputDialog(null,"qual é o local de trabalho?"));
    funcaluguel.setformacao(JOptionPane.showInputDialog(null,"qual é a formação do funcionário?"));
    while(continuarAtendimentos){
        String opcao=JOptionPane.showInputDialog(null,"digite 1 para adicionar um brinquedo e 0 para prosseguir com o pagamento");
        if(opcao==null){
            break;
        }
        switch(opcao){
            case"1":
        cat.setDesc(JOptionPane.showInputDialog("qual é a descrição do brinquedo?"));
        cat.setFaixa(JOptionPane.showInputDialog("qual é a faixa etária do brinquedo?"));
        cat.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"qual é o preço do brinquedo?")));
        brinq.setcor(JOptionPane.showInputDialog("qual é a cor do brinquedo?"));
        brinq.setNome(JOptionPane.showInputDialog("qual é o nome do brinquedo?"));
        break;
            case"0":
            continuarAtendimentos = false;
            break;
        default:
        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            break;        
        }
    }

    String escolha=JOptionPane.showInputDialog("vai querer que seja entregue? 1 para sim e 0 para não.");
    if(escolha.equals("1")){
        funcaentrega.setNome(JOptionPane.showInputDialog("qual é o nome do funcionário de entrega?"));
        funcaentrega.setCpf(Integer.parseInt(JOptionPane.showInputDialog("qual é o cpf do funcionário de entrega?")));
        funcaentrega.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("qual é o telefone do funcionáiro de entrega?")));
        funcaentrega.setID(Integer.parseInt(JOptionPane.showInputDialog("qual é o ID do funcionário de entrega?")));
        funcaentrega.setSalario(Double.parseDouble(JOptionPane.showInputDialog("qual é o salário do funcionário de entrega?")));
        funcaentrega.setdatacontratacao(JOptionPane.showInputDialog("qual é a data de contratação?"));
        funcaentrega.setcnh(JOptionPane.showInputDialog("qual é a cnh do funcionário?"));
        funcaentrega.setanosexperiencia(JOptionPane.showInputDialog("quantos anos de experiencia o funcionário possui?"));
        aluguel1.setData("qual a data do aluguel?");
        aluguel1.setDias(Integer.parseInt(JOptionPane.showInputDialog("quantos dias de alguel?")));
        Double soma=cat.getPreco()*aluguel1.getDias();
        aluguel1.setSoma(soma); 
        Double comi=soma*0.02;
        funcaluguel.setcomissao(comi);
        JOptionPane.showMessageDialog(null,"cliente do aluguel"+aluguel1.getcliente());
        JOptionPane.showMessageDialog(null,"funcionario que realizou o aluguel"+aluguel1.getFuncionarioAluguel());
        JOptionPane.showMessageDialog(null,"funcionário responsável pela entrega"+aluguel1.getFuncionarioEntrega());
        JOptionPane.showMessageDialog(null,"lista de brinquedos"+aluguel1.getListabrinquedo());
        JOptionPane.showMessageDialog(null,"valor final foi de: "+soma); 
}
    if(escolha.equals("0")){
        aluguel1.setData("qual a data do aluguel?");
        aluguel1.setDias(Integer.parseInt(JOptionPane.showInputDialog("quantos dias de alguel?")));
        Double soma=cat.getPreco()*aluguel1.getDias();
        aluguel1.setSoma(soma);
        Double comi=soma*0.02;
        funcaluguel.setcomissao(comi);
        JOptionPane.showMessageDialog(null,"cliente do aluguel"+aluguel1.getcliente());
        JOptionPane.showMessageDialog(null,"funcionario que realizou o aluguel"+aluguel1.getFuncionarioAluguel());
        JOptionPane.showMessageDialog(null,"lista de brinquedos"+aluguel1.getListabrinquedo());
        JOptionPane.showMessageDialog(null,"valor final foi de: "+soma);
    }
}
}