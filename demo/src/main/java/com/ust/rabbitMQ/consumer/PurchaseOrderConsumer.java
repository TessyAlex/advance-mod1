package com.ust.rabbitMQ.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ust.rabbitMQ.config.MessagingConfig;
import com.ust.rabbitMQ.model.OrderStatus;



@Component
public class PurchaseOrderConsumer {

	
	//is like groupp(queue)
	//this is listener
	//when 
	
	@RabbitListener(queues=MessagingConfig.QUEUE)
	public void consumeMeaageFromQueue(OrderStatus orderStatus)
	{
		System.out.println("Message recived from queue: " + orderStatus);
	}
	
}