import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class NotepadSession {
	private static final String WindowsApplicationDriverUrl = "http://127.0.0.1:4723";
	private static final String NotepadAppId = "C:\\Windows\\System32\\notepad.exe";
	private static WindowsDriver<RemoteWebElement> NotepadSession;

	@BeforeClass
	public static void setup() {
		try {
			DesiredCapabilities appCapabilities = new DesiredCapabilities();
			appCapabilities.setCapability("app", NotepadAppId);
			NotepadSession = new WindowsDriver<RemoteWebElement>(new URL(WindowsApplicationDriverUrl), appCapabilities);
			NotepadSession.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			Assert.assertNotNull(NotepadSession.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public static void teardown() {
		if (NotepadSession != null) {
			NotepadSession.quit();
		}
	}

	@Test
	public void testNotePad() {
		try {
			RemoteWebElement editBox = NotepadSession.findElementByClassName("Edit");
			editBox.sendKeys("Hello World");

			// Ctrl+A to select all and then delete to clear the box
			editBox.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);

			Assert.assertEquals("", editBox.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}