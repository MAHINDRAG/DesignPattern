package com.app.journaldev.dp.command;

public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystemreceiver;
	
	public WriteFileCommand(FileSystemReceiver fs) {
		this.fileSystemreceiver = fs;
	}
	
	@Override
	public void execute() {
       this.fileSystemreceiver.writeFile();
	}

}
