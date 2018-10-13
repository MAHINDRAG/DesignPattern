package com.app.journaldev.dp.command;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderlayingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlaying OS is:"+osName);
		if("Windows 10".equalsIgnoreCase(osName)) {
			return new WindowsFileSystemReceiver();
		}else {
			return new UnixFileSystemReceiver();
		}
	}
}
