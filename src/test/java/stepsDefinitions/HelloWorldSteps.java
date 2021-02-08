package stepsDefinitions;

import base.BaseUtil;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;
import org.junit.Assert;
import pages.HelloWorld;

public class HelloWorldSteps extends BaseUtil {

	private String operacao;
	private BaseUtil base;

	public HelloWorldSteps(BaseUtil base) {
		this.base = base;
	}

	@Dado("^que eu possua a operacao desejada \"(.*?)\"$")
	public void que_eu_possua_a_operacao_dejesada(String operacaoapi) throws Throwable {

		operacao = "/"+operacaoapi;
	}

	@Quando("^eu realizar a requisicao no endpoint$")
	public void eu_realizar_a_requisicao_no_endpoint() throws Throwable {

		HelloWorld helloWorld = new HelloWorld(base);
		helloWorld.realizaGetNoEndpoint(operacao);
	}

	@Então("^a api me retorna \"(.*?)\"$")
	public void a_api_me_retorna_hello_world(String mensagem) throws Throwable {

		String body = base.response.getBody().asString();
		Assert.assertEquals(mensagem, body.replaceAll("[\\\\\\r\\\\\\n]+", ""));
	}
}