package stopwatch;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Stopwatch {
	private Stopwatch() {
	}

	private static Stopwatch instance = new Stopwatch();

	public static Stopwatch getInstance() {
		return instance;
	}

	public void run() {
		StringBuffer buffer = new StringBuffer();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		Time time = new Time(buffer);
		Input input = new Input(buffer);

		Thread timerThread = new Thread(time);
		Thread inputThread = new Thread(input);

		buffer.append("[q] STOP\n");
		buffer.append("[h] HOLD\n");
		buffer.append("[*] RERUN\n");
		try {
			writer.append(buffer);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		buffer.delete(0, buffer.length());

		timerThread.start();
		inputThread.start();
	}
}
