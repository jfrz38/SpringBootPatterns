package com.patterns.demo.patterns.visitor;

public interface MailClient {
	void sendMail(String[] mailInfo);

	void receiveMail(String[] mailInfo);

	boolean configureForMac();

	boolean configureForWindows();
}
