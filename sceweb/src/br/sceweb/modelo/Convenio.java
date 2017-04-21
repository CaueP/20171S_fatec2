package br.sceweb.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import org.apache.log4j.Logger;

public class Convenio {
	Logger logger = Logger.getLogger(Convenio.class);

	String cnpj;

	public void setCNPJ(String cnpj) {
		if (cnpj.length() == 14) {
			this.cnpj = cnpj;
		} else
			throw new IllegalArgumentException("CNPJ inválido!");
	}
	
	public String getCNPJ(){
		return this.cnpj;
	}

	/**
	 * valida o formato da data
	 * 
	 * @param data
	 *            no formato dd/MM/yyyy
	 * @return true se a data estiver no formato valido e false para formato
	 *         invalido
	 */
	public boolean validaData(String data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false); // exige que o formato seja exatamente igual ao
								// fornecido
		try {
			df.parse(data); // data válida
			return true;
		} catch (ParseException ex) {
			logger.error("Erro na validacao de data - " + ex.getMessage());
			return false;
		}
	}

}
