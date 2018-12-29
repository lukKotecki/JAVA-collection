import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RobotTest {
	Robot robot;

	public RobotTest() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			System.err.println("Co ten robot wyprawia?!");
			e.printStackTrace();
		}
	}

	/**
	 * Metoda drukuje tekst "Hello World"
	 */
	public void printText() {
		int[] text = {KeyEvent.VK_H, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_O, KeyEvent.VK_SPACE,
				KeyEvent.VK_W, KeyEvent.VK_O, KeyEvent.VK_R, KeyEvent.VK_L, KeyEvent.VK_D};
		//pętla - wciśnięcie przycisku i przerwa na 200ms
		for(int i=0; i<text.length; i++) {
			robot.keyPress(text[i]);
			robot.delay(200);
		}
	}

	/**
	 * Metoda robi screenshot ekranu i zapisuje go na dysku
	 */
	public void screenCapture() {
		//pobieramy rozmiar ekranu i tworzymy Rectangle
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dimension);
		//robimy screenshot z utworzonego obszaru
		BufferedImage screen = robot.createScreenCapture(rectangle);
		try {
			ImageIO.write(screen, "jpg", new File("screenshot.jpg"));
		} catch (IOException e) {
			System.err.println("Błąd zapisu obrazu");
			e.printStackTrace();
		}
	}

	/**
	 * Testujemy czy działa
	 */
	public static void main(String[] args) {
		RobotTest test = new RobotTest();
		test.robot.delay(3000);
		test.printText();
		test.screenCapture();
	}

}