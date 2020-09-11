package com.danske.training.basics;

public abstract class Message {
	
	public abstract void showMessage();

}


class MessageReceiver{
	
	public void onMessage(Message m) {
		m.showMessage();
	}
}

class VideoMessage extends Message{
	
	@Override
	public void showMessage() {
		System.out.println("Showing video");
		
	}
}