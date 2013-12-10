
import org.wiperdog.process.linux.LibC;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class JnaMain {

	public static final void main(String [] args) {
		// first, decide the name of process-control file
		int pid = LibC.INSTANCE.fork();
		if (pid == 0) {
			System.out.println("I'm child");
			// first, be a session leader.
			int sessid = LibC.INSTANCE.setsid();
			if (sessid < 0) {
				// something is wrong, 
				//   1. report it.
				//   2. exit immediately.
			} else {
				
				// write out my sessid
				
			}
		} else {
			System.out.println("Child is " + pid);
		}
	}
}
