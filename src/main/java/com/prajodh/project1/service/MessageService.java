package com.prajodh.project1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prajodh.project1.domain.Message;
import com.prajodh.project1.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepository;
	
	public List<Message> getAllMessage() {
		return messageRepository.findAll();
	}
}
