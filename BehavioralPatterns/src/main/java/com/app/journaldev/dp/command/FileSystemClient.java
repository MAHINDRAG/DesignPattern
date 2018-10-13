package com.app.journaldev.dp.command;

public class FileSystemClient {

	public static void main(String[] args) {
		
		//Creating the receiver object		
		FileSystemReceiver fis = FileSystemReceiverUtil.getUnderlayingFileSystem();
		
		//creating command and associating with receiver
		OpenFileCommand opCommand = new OpenFileCommand(fis);
		
		//Creating invoker and associating with Command		
		FileInvoker fileInvoker = new FileInvoker(opCommand);
		
		//perform action on invoker object
		fileInvoker.execute();
		
		WriteFileCommand wCommand = new WriteFileCommand(fis);
		fileInvoker = new FileInvoker(wCommand);
		fileInvoker.execute();
		
		CloseFileCommand cFileCommand = new CloseFileCommand(fis);
		fileInvoker = new FileInvoker(cFileCommand);
		fileInvoker.execute();
		

	}

}
