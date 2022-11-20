package facade;

import subsistema1.crm.CrmService.CrmService;
import subsistema2.crm.CrmService.CepApi;;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}