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
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void close() throws IOException {
		LibC.INSTANCE.close(fd);
		super.close();
	}
}
