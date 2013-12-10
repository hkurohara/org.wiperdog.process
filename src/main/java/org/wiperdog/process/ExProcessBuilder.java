package org.wiperdog.process;
import java.util.HashMap;
import java.util.Map;


public final class ExProcessBuilder {
	private String [] args;
	private Map<String, String> envs = new HashMap<String, String>();
	
	public ExProcessBuilder() {}
	public ExProcessBuilder(String ... args) {
		
	}
	
	public Map<String, String> environments() {
		return envs;
	}
	
	public Process start() {
		return null;
	}
	
}
