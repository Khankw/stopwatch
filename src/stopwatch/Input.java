package stopwatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input extends Thread {
	StringBuffer buffer;

	public Input(StringBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String input = "";
			try {
				input = reader.readLine();
				buffer.append(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (input.equals("q"))
				break;
		}
	}
}
