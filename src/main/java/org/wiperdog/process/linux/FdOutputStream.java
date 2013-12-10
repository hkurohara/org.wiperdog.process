package org.wiperdog.process.linux;

import java.io.IOException;
import java.io.OutputStream;

public class FdOutputStream extends OutputStream {
	int fd;
	
	public FdOutputStream(int fd) {
		this.fd = fd;
	}

	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws IOException {
		LibC.INSTANCE.close(fd);
		super.close();
	}
}
