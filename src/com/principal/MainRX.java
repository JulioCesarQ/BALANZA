package com.principal;

public class MainRX {

	public MainRX() {
		
	}
	
	public static void main(String[] args) {

		Win10RxTx win10RxTx = new Win10RxTx();
		
		
		try {
			win10RxTx.connect("COM7");
			
			System.err.println(win10RxTx.read());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
