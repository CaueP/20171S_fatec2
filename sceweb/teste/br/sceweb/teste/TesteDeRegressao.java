package br.sceweb.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ UC01CadastrarEmpresa.class, UC02ConsultarEmpresa.class, UC03ExcluirEmpresa.class, UC05CadastrarConvenio.class })
public class TesteDeRegressao {

}
