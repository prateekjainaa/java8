package lambdas.intf;

import java.util.Calendar;

@FunctionalInterface
public interface Op {
	
	void runOp();
	
	static void timeOp(Op operation) {
		long date1 = Calendar.getInstance().getTimeInMillis();
		operation.runOp();
		long date2 = Calendar.getInstance().getTimeInMillis();
		System.out.println(date2 - date1 + " ms.");
	}

	default Op combinedOp(Op secondOp) {
		return (() -> {
			runOp();
			secondOp.runOp();
		});
	}
}
