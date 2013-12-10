package org.wiperdog.process.linux;
import com.sun.jna.Native;

/**
 * Lib C (libc) interface.
 * You can search information about libc by using the keyword 'posix' and so forth.
 * @author kurohara
 *
 */
public interface LibC {
	public static LibC INSTANCE = (LibC) Native.loadLibrary("c", LibC.class);
	int fork();
	int setsid();
	int execve(String path, String [] args, String [] envs);
	int waitpid(int pid, int [] status, int flags);
	int pipe(int [] fds);
	int open(String path, int flags);
	int open(String path, int flags, int mode);
	int close(int fd);
	int dup(int fd);
	int read(int fd, char [] buf, int size);
	int write(int fd, char [] buf, int size);
	int kill(int pid, int sig);
}
