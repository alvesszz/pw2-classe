
public class TesteContaBanco 
{
	public static void main(String[] args) 
	{
		Agencia agencia = new Agencia();
		
		agencia.numero = "64532";
		
		ContaBanco conta = new ContaBanco();
		
		conta.agencia = agencia;
		conta.limite = "10000";
		conta.saldo = "2500";
		conta.numero = "20135641";
	}
}
