package com.lildutils.springboot.mail.sender;

import com.lildutils.springboot.mail.request.LDuMailRequest;

public interface LDuMailSenderService
{
	void send( LDuMailRequest mailRequest );

}
