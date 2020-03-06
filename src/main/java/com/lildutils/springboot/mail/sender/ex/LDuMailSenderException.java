package com.lildutils.springboot.mail.sender.ex;

@SuppressWarnings("serial")
public class LDuMailSenderException extends RuntimeException
{
	public LDuMailSenderException( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace )
	{
		super( message, cause, enableSuppression, writableStackTrace );
	}

	public LDuMailSenderException( String message, Throwable cause )
	{
		super( message, cause );
	}

	public LDuMailSenderException( String message )
	{
		super( message );
	}

	public LDuMailSenderException( Throwable cause )
	{
		super( cause );
	}

}
