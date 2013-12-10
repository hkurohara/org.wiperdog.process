package org.wiperdog.process.linux;

import java.io.IOException;
import java.io.InputStream;

public class FdInputStream extends InputStream {
	int fd;
	
	public FdInputStream(int fd) {
		this.fd = fd;
	}
	
	@Override
	public int read() throws IOException {
		byte [] buf = new byte[1];
		
		int bytesread = LibC.INSTANCE.read(fd, buf, 1);
		if (bytesread < 1) {
			return -1;
		}
		
		return (int) buf[0];
	}
	
	@Override
	public void close() throws IOException {
		LibC.INSTANCE.close(fd);
		super.close();
	}
}
