package com.prajodh.project1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prajodh.project1.domain.Message;
import com.prajodh.project1.dto.MessageDto;
import com.prajodh.project1.service.MessageService;

@RestController
@RequestMapping ("/api/messages")
@CrossOrigin
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping ("")
	public ResponseEntity<?> getAllMessages () {
		List<Message> messages = messageService.getAllMessage();
		return new ResponseEntity<>(messages, HttpStatus.OK);
	}
}
