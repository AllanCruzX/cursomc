package com.allan.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.allan.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmatioEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
