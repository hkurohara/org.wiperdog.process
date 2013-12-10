package org.wiperdog.process.linux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import junit.framework.TestCase;

public class TestFdInputStream extends TestCase {
	public static final String datapath = "src/test/resources/TestFdInputStream_data1.txt";
	public void test1() throws IOException {
		int fd = LibC.INSTANCE.open(datapath, LibC.O_RDONLY);
		assertTrue(fd > 0);
		InputStream is = new FdInputStream(fd);
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String line = reader.readLine();
		assertTrue("OK1".equals(line));
		line = reader.readLine();
		assertTrue("OK2".equals(line));
		line = reader.readLine();
		assertTrue("OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3OK3".equals(line));
	}
}
