package com.lildutils.springboot.mail.request;

import javax.mail.internet.InternetAddress;

import org.thymeleaf.context.Context;

public interface LDuMailRequest
{
	///////////////////////////////
	// TEMPLATE

	String getTemplateFileName();

	///////////////////////////////
	// TEMPLATE CONTEXT

	Context getContext();

	///////////////////////////////
	// SUBJECT

	String getSubject();

	void setSubject( String subject );

	///////////////////////////////
	// FROM

	String getFromEmail();

	void setFromEmail( String fromEmail );

	String getFromName();

	void setFromName( String fromName );

	InternetAddress getFromAddress();

	void setFromAddress( InternetAddress fromAddress );

	///////////////////////////////
	// TO

	String getToEmail();

	void setToEmail( String toEmail );

	String getToName();

	void setToName( String toName );

	InternetAddress getToAddress();

	void setToAddress( InternetAddress toAddress );

	///////////////////////////////
	// REPLY TO

	String getReplyToEmail();

	void setReplyToEmail( String replyToEmail );

	String getReplyToName();

	void setReplyToName( String replyToName );

	InternetAddress getReplyToAddress();

	void setReplyToAddress( InternetAddress replyToAddress );

}
