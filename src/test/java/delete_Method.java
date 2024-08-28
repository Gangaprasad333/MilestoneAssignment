/* Name:Gangaprasad
 * Description:Creating delete_method using restassured
 * Date:28/08/2024
 */
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class delete_Method {
	@Test
	public void delete() {
		given()
		.when()
		.delete("https://fakestoreapi.com/products/6")
		.then()
		.statusCode(200)
		.log().all()
		.assertThat().statusCode(200);
		
	}
	

}
