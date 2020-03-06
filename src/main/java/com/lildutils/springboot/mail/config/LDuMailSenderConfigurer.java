package com.lildutils.springboot.mail.config;

import org.apache.commons.lang3.CharEncoding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

import com.lildutils.springboot.mail.controller.advice.LDuMailSenderControllerAdvice;

@Configuration
@ComponentScan(basePackageClasses = LDuMailSenderControllerAdvice.class)
public class LDuMailSenderConfigurer
{
	@Bean("templateResolver")
	public ITemplateResolver getMailRequestTemplateResolver()
	{
		final ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		templateResolver.setPrefix( "/templates/mail/requests/" );
		templateResolver.setSuffix( ".html" );
		templateResolver.setTemplateMode( TemplateMode.HTML );
		templateResolver.setCharacterEncoding( CharEncoding.UTF_8 );
		templateResolver.setCheckExistence( true );
		templateResolver.setCacheable( false );
		return templateResolver;
	}

}
