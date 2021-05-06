package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String mesagge) {
		JLoggerManager manager = new JLoggerManager();
		manager.add(mesagge);
		
	}

}
