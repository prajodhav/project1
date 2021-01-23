package com.prajodh.project1.dto;

public class MessageDto {
	
	private String id;
	private String text;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public MessageDto(String id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
}
