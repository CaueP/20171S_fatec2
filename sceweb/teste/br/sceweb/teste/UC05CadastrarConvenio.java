package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.ConvenioDAO;
import br.sceweb.modelo.Empresa;

/**
 * @author cgpolim
 * @version $Revision: 1.0 $
 */
public class UC05CadastrarConvenio {

	/**
	 * Field convenio.
	 */
	static Convenio convenio;
	/**
	 * Field convenioDAO.
	 */
	static ConvenioDAO convenioDAO;

	/**
	 * Method setUpBeforeClass.
	
	 * @throws Exception */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		convenio = new Convenio();
		convenioDAO = new ConvenioDAO();
	}

	/**
	 * Method CT01UC05FBCadastrarConvenio_com_sucesso.
	 */
	@Test
	public void CT01UC05FBCadastrarConvenio_com_sucesso() {
		assertEquals(1, convenioDAO.adiciona(convenio));
	}

	/**
	 * Method CT02UC05CadastrarConvenio_cnpj_invalido.
	 */
	@Test
	public void CT02UC05CadastrarConvenio_cnpj_invalido() {
		Convenio convenio2 = new Convenio();
		try {
			convenio2.setCNPJ("");
			fail("deveria disparar uma expection");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!", e.getMessage());
		}
	}

	/**
	 * Method CT02UC05CadastrarConvenio_cnpj_valido.
	 */
	@Test
	public void CT02UC05CadastrarConvenio_cnpj_valido() {
		Convenio convenio3 = new Convenio();
		convenio3.setCNPJ("371.212.212-12");
		assertEquals(convenio3.getCNPJ(), "371.212.212-12");
	}

	/**
	 * Method CT03UC05A2CadastrarConvenio_dti_invalida.
	 */
	@Test
	public void CT03UC05A2CadastrarConvenio_dti_invalida() {
		assertFalse(convenio.validaData("42/05/2016"));
	}

	/**
	 * Method CT03UC05A1CadastrarConvenio_dti_valida.
	 */
	@Test
	public void CT03UC05A1CadastrarConvenio_dti_valida() {
		assertFalse(convenio.validaData("23/05/2016"));
	}

	/**
	 * Method tearDownAfterClass.
	
	 * @throws Exception */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
