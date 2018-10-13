package com.app.journaldev.dp.command;

public class CloseFileCommand implements Command {
	
	private FileSystemReceiver fileSysreceiver;
	
	public CloseFileCommand(FileSystemReceiver fs) {
		this.fileSysreceiver = fs;
	}

	@Override
	public void execute() {
      this.fileSysreceiver.closeFile();
	}

}
