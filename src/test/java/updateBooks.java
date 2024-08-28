/* Name:Gangaprasad
 * Description:Updating the book details  with put method using restassured
 * Date:28/08/2024
 */
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
public class updateBooks {
	@Test
	public void post() {
		HashMap data=new HashMap();
		data.put("author","Gangaprasad");
		data.put("title","java with selenium");
		data.put("price", 230);
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.put("https://fakestoreapi.com/products/7")
		.then()
		.statusCode(200)
		.log().all()
		.assertThat().statusCode(200);
		
	}
	

}
