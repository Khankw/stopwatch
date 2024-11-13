package stopwatch;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time extends Thread {
	private StringBuffer buffer;

	public Time(StringBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		long lastTime = cal.getTimeInMillis();
		int second = 0;
		boolean isHold = false;
		while (true) {
			if (buffer.length() > 0) {
				String input = buffer.toString();
				if (input.equals("q"))
					break;
				else if (input.equals("h"))
					isHold = true;
				else
					isHold = false;
				buffer.delete(0, buffer.length());
			}

			if (isHold)
				continue;

			cal = Calendar.getInstance();
			long curTime = cal.getTimeInMillis();
			if (curTime - lastTime >= 1000) {
				try {
					buffer.append(sdf.format(cal.getTime()));
					buffer.append(String.format(" [%d sec]\n", ++second));
					writer.append(buffer);
					writer.flush();
					buffer.delete(0, buffer.length());
				} catch (IOException e) {
					e.printStackTrace();
				}
				lastTime = curTime;
			}
		}
		int minute = second / 60;
		second %= 60;
		try {
			writer.append(String.format(">>> %d분 %d초 소요됨\n", minute, second));
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
