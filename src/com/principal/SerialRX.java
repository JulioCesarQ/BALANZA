package com.principal;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

public class SerialRX {

	public SerialRX() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
	
		try {
			CommPortIdentifier portIdentifier = CommPortIdentifier
					.getPortIdentifier("COM3");
			
			CommPort commPort = portIdentifier.open("PRUEBA",
					2000);
			
			if ( commPort instanceof SerialPort ) {
				SerialPort serialPort = (SerialPort) commPort;
				
				serialPort.setSerialPortParams(9600,	//57600,
						SerialPort.DATABITS_8,
						SerialPort.STOPBITS_1,
						SerialPort.PARITY_NONE);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
