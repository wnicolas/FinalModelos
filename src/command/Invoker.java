package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<Command> commandList=new ArrayList<Command>();
	
	public void takeCommand(Command command) {
		commandList.add(command);
	}
	
	public void placeCommands() {
		for(Command command:commandList) {
			command.ejecutar();
		}
		commandList.clear();
	}
	
}
