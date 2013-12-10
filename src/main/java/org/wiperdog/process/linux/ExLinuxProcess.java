package org.wiperdog.process.linux;

import java.io.InputStream;
import java.io.OutputStream;

import org.wiperdog.process.ExProcess;

public class ExLinuxProcess extends ExProcess {
	private final int pid;
	private final int sessionId;
	private final int stdin;
	private final int stdout;
	private final int stderr;
	private final String ctlFilePath;
	
	private ExLinuxProcess() {
		this.pid = 0;
		this.sessionId = 0;
		this.stdin = 0;
		this.stdout = 1;
		this.stderr = 2;
		this.ctlFilePath = "";
	}
	
	public ExLinuxProcess(int pid, int infd, int outfd, int errfd, String ctlFilePath) {
		this.pid = pid;
		this.sessionId = pid;
		this.stdin = infd;
		this.stdout = outfd;
		this.stderr = errfd;
		this.ctlFilePath = ctlFilePath;
	}
	
	@Override
	public OutputStream getOutputStream() {
		return new FdOutputStream(stdout);
	}

	@Override
	public InputStream getInputStream() {
		return new FdInputStream(stdin);
	}

	@Override
	public InputStream getErrorStream() {
		return new FdInputStream(stderr);
	}

	@Override
	public int waitFor() throws InterruptedException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int waitFor(int millisec) throws InterruptedException {
		return 0;
	}
	
	@Override
	public int exitValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPid() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] getSessionMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSessionId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int killSessionProcesses() {
		// TODO Auto-generated method stub
		return 0;
	}

}
