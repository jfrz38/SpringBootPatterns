package com.patterns.demo.patterns.visitor;

public class GenerateVisitor {

	public GenerateVisitor() {
		
	}
	
	public void generate() {
		MailClient operaMailClient = new OperaMailClient();
		operaMailClient.configureForMac();
        operaMailClient.configureForWindows();
        MailClient squirrelMailClient=new SquirrelMailClient();
        squirrelMailClient.configureForMac();
        squirrelMailClient.configureForWindows();
	}
}
