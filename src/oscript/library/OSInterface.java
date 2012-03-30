package oscript.library;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OSInterface {

	public static String execute(String command) {
		StringBuilder result = new StringBuilder();
		try {
			Process p = null;
			if (isWindows()) {
				 p = new ProcessBuilder("cmd.exe", "/c", "powershell " + command).start();
			} else {
				p = new ProcessBuilder(command).start();
			}
			p.getOutputStream().close();
			InputStream in = p.getInputStream();
			BufferedInputStream buf = new BufferedInputStream(in);
			InputStreamReader inread = new InputStreamReader(buf);
			BufferedReader bufferedreader = new BufferedReader(inread);

			String line;
			while ((line = bufferedreader.readLine()) != null) {
				result.append(line + "\n");
			}


			try {
				if (p.exitValue() != 0) {
					System.err.println("Fehler bei der Ausführung von "
							+ command + ":");
					System.err.println(new Scanner(p.getErrorStream()).useDelimiter("\\Z").next());
				}
			} finally {
				bufferedreader.close();
				inread.close();
				buf.close();
				in.close();
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return result.toString();
	}

	public static boolean isWindows() {
		String os = System.getProperty("os.name").toLowerCase();
		return (os.indexOf("win") >= 0);
	}

	public static boolean isMac() {
		String os = System.getProperty("os.name").toLowerCase();
		return (os.indexOf("mac") >= 0);
	}

	public static boolean isUnix() {
		String os = System.getProperty("os.name").toLowerCase();
		return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0);
	}

	public static boolean isSolaris() {
		String os = System.getProperty("os.name").toLowerCase();
		return (os.indexOf("sunos") >= 0);
	}
}
