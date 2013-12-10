package org.wiperdog.process.linux;

import java.util.HashMap;
import java.util.Map;

public class ExLinuxProcessBuilder {
	private String [] args;
	private Map<String, String> envs = new HashMap<String, String>();
	private static int serialNo = 1;
	
	public ExLinuxProcessBuilder(String ... args) {
		
	}
	
	public Map<String, String> environments() {
		return envs;
	}
	
	public Process start() {
		return null;
	}

	private void pipeDupAndClose(int [] pipe) {
		LibC.INSTANCE.dup(pipe[0]);
		LibC.INSTANCE.close(pipe[0]);
		LibC.INSTANCE.close(pipe[1]);
	}
	
	private synchronized int startProcess() {
		String pathToCtlFile = "" + serialNo;
		serialNo++;
		int [] inpipe = new int[2];
		int [] outpipe = new int[2];
		int [] errpipe = new int[2];
		
		int childPid = 0;
		if ((childPid = LibC.INSTANCE.fork()) > 0) {
			
		} else {
			int sessionId = LibC.INSTANCE.setsid();
			LibC.INSTANCE.close(0);
			LibC.INSTANCE.close(1);
			LibC.INSTANCE.close(2);
			pipeDupAndClose(inpipe);
			pipeDupAndClose(outpipe);
			pipeDupAndClose(errpipe);
			
		}
		return 0;
	}
}
