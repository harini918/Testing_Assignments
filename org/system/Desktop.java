package org.system;

public class Desktop extends Computer{
public void desktopSize() {
	System.out.println("from desktop");
}
public static void main(String[] args) {
	Desktop obj =new Desktop();
	obj.compModel();
	obj.desktopSize();
}
}
