/* Name:Gangaprasad
 * Description:Get books using get method using restassured
 * Date:28/08/2024
 */
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class getBook {
	@Test
	public void getBooks() {
		given()
		.when()
		.get("https://freetestapi.com/api/v1/books/1")
		.then()
		.statusCode(200)
		.log().all()
		.assertThat().statusCode(200);
		
	}

}
