/* Name:Gangaprasad
 * Description:Updating the book details  with patch method using restassured
 * Date:28/08/2024
 */
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;


public class updatebook_patch {
	@Test
	public void patch() {
		HashMap data=new HashMap();
		data.put("author","Ganga");
		data.put("title","java");
		data.put("price", 245);
		given()
		.contentType("application/json")
		.when()
		.patch("https://fakestoreapi.com/products/7")
		.then()
		.statusCode(200)
		.log().all();
		
	}
	

}
