/* Name:Gangaprasad
 * Description:Creating add book class with post method using restassured
 * Date:28/08/2024
 */
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
public class addBook {
	@Test
	public void addBook() {
		HashMap data=new HashMap();
		data.put("author","kgp");
		data.put("title","The pursuit of happiness");
		data.put("price", 100);
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://fakestoreapi.com/products")
		.then()
		.statusCode(200)
		.log().all();
		
	}
	

}
