package conm.syntax.class07;

import java.time.Duration;
import java.util.NoSuchElementException;

public class FluentWait {
	public static void main(String[] args) {
		FluentWait wait=new FluentWait(driver);
		wait.withTomeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		
	}

}
