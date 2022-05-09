
public class Teste
{
	public static void main(String[] args) 
	{
		Cliente c1 = new Cliente();
		
		c1.nome = "Fabia Linda";
		c1.codigo = "60135";
		c1.status = StatusEnum.ATIVO;
		
		DadosCartao cartao = new DadosCartao();
		
		cartao.tipo_cartao = TipoCartaoEnum.CRÉDITO;
		cartao.cliente = c1;
		cartao.data_val = "06/28";
		cartao.numero = "5319074357063387";
		
	}
}
