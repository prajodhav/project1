package com.prajodh.project1.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import com.prajodh.project1.repository.MessageRepository;

class MessageServiceTest {
	
	@InjectMocks
	MessageService service;
	
	@Mock
	MessageRepository repository;
	

	@Test
	void testGetAllMessage() {
		this.service = new MessageService();
		service.getAllMessage();
		//verify(repository).findAll();
	}
}
