package com.ktg.prospring.ch2.decoupled;

public class StandardOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider;
	public void render() {
		if(messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}
	
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}
