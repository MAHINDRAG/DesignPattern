package com.app.journaldev.dp.command;

public class OpenFileCommand implements Command {
	
	private FileSystemReceiver filesysreceiver;
	
	public OpenFileCommand(FileSystemReceiver fs) {
		this.filesysreceiver = fs;
		System.out.println("fileSystemReceiver:"+filesysreceiver+", FS:"+fs);
	}

	@Override
	public void execute() {
       this.filesysreceiver.openFile();
	}

}
