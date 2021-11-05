
package simplemavenprograms;
import static org.junit.Assert.*;
import org.junit.Test;

import mvnSimpleProj.HelloWorld;
public class HelloWorldTest {
	@Test
	public void testGreetingMessage() {
		assertEquals("Hello John! Welcome to Java Programming", HelloWorld.getGreetingMessage("John"));
	}
}