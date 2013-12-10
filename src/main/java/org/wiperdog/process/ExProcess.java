package org.wiperdog.process;

public abstract class ExProcess extends Process {

	/**
	 * wait for [millisec] to exit this process.
	 * @param millisec
	 */
	public abstract int waitFor(int millisec) throws InterruptedException;
	
	/**
	 * get process id of this process.
	 * @return
	 */
	public abstract int getPid();

	/**
	 * get all prcess ids of this session.
	 * @return
	 */
	public abstract int [] getSessionMembers();
	
	/**
	 * get session id of this process.
	 * @return
	 */
	public abstract int getSessionId();
	
	/**
	 * kill all processes in this session.
	 * @return
	 */
	public abstract int killSessionProcesses();
}
