package com.lildutils.springboot.mail.config;

import org.apache.commons.lang3.CharEncoding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
public class LDuMailSenderConfigurer
{
	@Autowired
	private Environment environment;

	@Bean("templateResolver")
	public ITemplateResolver getMailRequestTemplateResolver()
	{
		final ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		templateResolver.setPrefix(
				environment.getProperty( "ldu.mail-sender.templates-html.path", "/templates/mail/requests/" ) );
		templateResolver.setSuffix( ".html" );
		templateResolver.setTemplateMode( TemplateMode.HTML );
		templateResolver.setCharacterEncoding( CharEncoding.UTF_8 );
		templateResolver.setCheckExistence( true );
		templateResolver.setCacheable( false );
		return templateResolver;
	}

}
