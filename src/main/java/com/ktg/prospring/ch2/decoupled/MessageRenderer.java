package com.ktg.prospring.ch2.decoupled;

public interface MessageRenderer {
	void render();
	void setMessageProvider(MessageProvider messageProvider);
	MessageProvider getMessageProvider();
}
