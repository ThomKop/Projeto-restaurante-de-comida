import java.util.Date;
import javax.swing.JOptionPane;
 class Pessoa{
    public String nome;
    public String telefone;
    public int idade;
    public String cpf;
// construtor
    Pessoa(String _nome, String _cpf, String _telefone, int _idade) {
    this.nome = _nome;
    this.cpf = _cpf;
    this.idade = _idade;
    this.telefone = _telefone;
    }
    Pessoa(){}
}

 class Funcionário extends Pessoa{
    public float salário;
    public String benefícios;
    public String folga;
    public String horasdetrabalho;
// const. Funcionário
    Funcionário (String _nome, String _cpf, String _telefone, int _idade){
        super(_nome, _cpf, _telefone, _idade);

    }
    Funcionário(){}
}
 class Cliente extends Pessoa{
    public float valordaconta;
    public int númerodamesa;

    public Cliente(String _nome, String _cpf, String _telefone, int _idade) {
        super(_nome, _cpf, _telefone, _idade);
    }
    public void pagar(){
}
 }

 class Caixa extends Funcionário{
    public void vercontadocliente(){}
    public void efetuarpagamento(){}
   
    Caixa (String _nome, String _cpf, String _telefone, int _idade){
        super(_nome, _cpf, _telefone, _idade);
}
 }
 class Supervisor extends Funcionário{
    public void mudargastos(){}
}
 class Garçom extends Funcionário{
    public void fazerpedido(){}
    public void atendercliente(){}
}
public class Restaurante{
    public static void main(String[] args) {
    Pessoa T34 = new Pessoa("Carlos ", "123456789 ", "0987654321 ", 30);
    System.out.println(T34.nome+ T34.cpf+ T34.telefone+ T34.idade );
    
    String nome_cliente;
    int idade_cliente;
    String telefone_cliente;
    String cpf_cliente;
    
    nome_cliente =  JOptionPane.showInputDialog ("Digite o nome do cliente");
    telefone_cliente =  JOptionPane.showInputDialog ("Digite o telefone do cliente");
    cpf_cliente =  JOptionPane.showInputDialog ("Digite o cpf do cliente");
    }
}