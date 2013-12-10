package org.wiperdog.process.linux;
import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * Lib C (libc) interface.
 * You can search information about libc by using the keyword 'posix' and so forth.
 * @author kurohara
 *
 */
public interface LibC extends Library {
	public static final int O_ACCMODE  =    0003;
	public static final int O_RDONLY   =      00;
	public static final int O_WRONLY   =      01;
	public static final int O_RDWR     =      02;
	public static final int O_CREAT    =    0100; /* not fcntl */
	public static final int O_EXCL     =    0200; /* not fcntl */
	public static final int O_NOCTTY   =    0400; /* not fcntl */
	public static final int O_TRUNC    =   01000; /* not fcntl */
	public static final int O_APPEND   =   02000;
	public static final int O_NONBLOCK =   04000;
	public static final int O_NDELAY   = O_NONBLOCK;
	public static final int O_SYNC     =    04010000;
	public static final int O_FSYNC    =  O_SYNC;
	public static final int O_ASYNC    =  020000;

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
	int read(int fd, byte [] buf, int size);
	int write(int fd, byte [] buf, int size);
	int kill(int pid, int sig);
}
