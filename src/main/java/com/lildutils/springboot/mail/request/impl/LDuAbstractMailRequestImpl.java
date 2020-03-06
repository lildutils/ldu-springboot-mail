package com.lildutils.springboot.mail.request.impl;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.InternetAddress;

import org.apache.commons.lang3.StringUtils;

import com.lildutils.springboot.mail.request.LDuMailRequest;
import com.lildutils.springboot.mail.sender.ex.LDuMailSenderException;

public abstract class LDuAbstractMailRequestImpl implements LDuMailRequest
{
	private String			subject;
	private String			fromEmail;
	private String			fromName;
	private InternetAddress	fromAddress;
	private String			toEmail;
	private String			toName;
	private InternetAddress	toAddress;
	private String			replyToEmail;
	private String			replyToName;
	private InternetAddress	replyToAddress;

	public LDuAbstractMailRequestImpl()
	{
		super();
	}

	protected String transform( String templateFileName, Object... args )
	{
		String transformedTemplateFileName = templateFileName;
		if( args != null && args.length > 0 )
		{
			for( int i = 0; i < args.length; i++ )
			{
				transformedTemplateFileName = transformedTemplateFileName.replace( "{" + i + "}",
						String.valueOf( args[i] ) );
			}
		}
		return transformedTemplateFileName;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject( String subject )
	{
		this.subject = subject;
	}

	public String getFromEmail()
	{
		return fromEmail;
	}

	public void setFromEmail( String fromEmail )
	{
		this.fromEmail = fromEmail;
	}

	public String getFromName()
	{
		return fromName;
	}

	public void setFromName( String fromName )
	{
		this.fromName = fromName;
	}

	public InternetAddress getFromAddress()
	{
		if( StringUtils.isNotBlank( this.getFromName() ) )
		{
			try
			{
				return new InternetAddress( this.getFromEmail(), this.getFromName() );
			}
			catch( UnsupportedEncodingException e )
			{
				throw new LDuMailSenderException( e.getMessage() );
			}
		}
		return fromAddress;
	}

	public void setFromAddress( InternetAddress fromAddress )
	{
		this.fromAddress = fromAddress;
	}

	public String getToEmail()
	{
		return toEmail;
	}

	public void setToEmail( String toEmail )
	{
		this.toEmail = toEmail;
	}

	public String getToName()
	{
		return toName;
	}

	public void setToName( String toName )
	{
		this.toName = toName;
	}

	public InternetAddress getToAddress()
	{
		if( StringUtils.isNotBlank( this.getToName() ) )
		{
			try
			{
				return new InternetAddress( this.getToEmail(), this.getToName() );
			}
			catch( UnsupportedEncodingException e )
			{
				throw new LDuMailSenderException( e.getMessage() );
			}
		}
		return toAddress;
	}

	public void setToAddress( InternetAddress toAddress )
	{
		this.toAddress = toAddress;
	}

	public String getReplyToEmail()
	{
		return replyToEmail;
	}

	public void setReplyToEmail( String replyToEmail )
	{
		this.replyToEmail = replyToEmail;
	}

	public String getReplyToName()
	{
		return replyToName;
	}

	public void setReplyToName( String replyToName )
	{
		this.replyToName = replyToName;
	}

	public InternetAddress getReplyToAddress()
	{
		if( StringUtils.isNotBlank( this.getReplyToName() ) )
		{
			try
			{
				return new InternetAddress( this.getReplyToEmail(), this.getReplyToName() );
			}
			catch( UnsupportedEncodingException e )
			{
				throw new LDuMailSenderException( e.getMessage() );
			}
		}
		return replyToAddress;
	}

	public void setReplyToAddress( InternetAddress replyToAddress )
	{
		this.replyToAddress = replyToAddress;
	}

}
