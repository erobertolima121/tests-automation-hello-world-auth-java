package stepsDefinitions;

import base.BaseUtil;
import static io.restassured.RestAssured.given;
import cucumber.api.java.*;

public class Hook extends BaseUtil {

	private BaseUtil base;

	public Hook(BaseUtil base) {
		this.base = base;
	}

	@Before
	public void InicializeTest() {
		String token =  "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoic2ViYXMiLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiXSwiaWF0IjoxNjEyNzEwMzIyfQ.2jms-405XtEbA-gAzAlDYECcAQbjD5fgLegt1NPpkINCPgVA2wQYGxpL-F0ZDT0YF6zIVRQ5YjtIGahIV3Ihpw";

		base.request = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + token);
	}
}
