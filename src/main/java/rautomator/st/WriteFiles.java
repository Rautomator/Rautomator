package rautomator.st;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class WriteFiles extends PrintStream {
	private final PrintStream second;

	public WriteFiles(OutputStream main, PrintStream second) {
		super(main);
		this.second = second;
	}

	public void close() {
		super.close();
	}

	public void flush() {
		super.flush();
		second.flush();
	}

	public void write(byte[] buf, int off, int len) {
		super.write(buf, off, len);
		second.write(buf, off, len);
	}

	public void write(int b) {
		super.write(b);
		second.write(b);
	}

	public void write(byte[] b) throws IOException {
		super.write(b);
		second.write(b);
	}
}
