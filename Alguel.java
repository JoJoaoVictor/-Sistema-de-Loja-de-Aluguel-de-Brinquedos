package TrabalhoFinal;
import java.util.ArrayList;
import java.util.List;
public class Alguel {
        private Cliente cliente;
        private FuncionarioEntrega funcionarioEntrega;
        private FuncionarioAluguel funcionarioAluguel;
        private Double soma;
        private int dias;
        private String data;
        private List<Brinquedo> listabrinquedo=new ArrayList<Brinquedo>();

        public Cliente getcliente() {
            return this.cliente;
        }
        void setCliente(Cliente cliente){
            this.cliente=cliente;
        }

        public FuncionarioAluguel getFuncionarioAluguel() {
            return funcionarioAluguel;
        }
        public void setFuncionarioAluguel(FuncionarioAluguel funcionarioAluguel) {
            this.funcionarioAluguel = funcionarioAluguel;
        }
        public FuncionarioEntrega getFuncionarioEntrega() {
            return funcionarioEntrega;
        }
        public void setFuncionarioEntrega(FuncionarioEntrega funcionarioEntrega) {
            this.funcionarioEntrega = funcionarioEntrega;
        }
        public void setSoma(Double soma) {
            this.soma = soma;
        }
        public Double getSoma() {
            return soma;
        }
        public void setDias(int dias) {
            this.dias = dias;
        }
        public int getDias() {
            return dias;
        }
        public void setData(String data) {
            this.data = data;
        }
        public String getData() {
            return data;
        }
        public List<Brinquedo> getListabrinquedo() {
            return this.listabrinquedo;
        }
        public void setListabrinquedo(List<Brinquedo> listabrinquedo) {
            this.listabrinquedo=listabrinquedo;
        }
}
