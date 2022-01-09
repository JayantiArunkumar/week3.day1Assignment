package org.systems;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Your Desktop size is 1920×1080 ");
	}

	public static void main(String[] args) {
		Desktop dd=new Desktop();
		dd.computerModel();
		dd.desktopSize();
	}

}
