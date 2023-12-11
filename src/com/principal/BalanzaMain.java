package com.principal;

import jssc.SerialPort;

public class BalanzaMain {

	private static BalanzaMain instancia = new BalanzaMain();

	public static BalanzaMain getInstancia() {
		return instancia;
	}

	public BalanzaMain() {
		// TODO Auto-generated constructor stub
	}

	public Double getPeso() {
		// TODO Auto-generated method stub

		System.err.println("-----------------1");
		Double peso = 0.0D;
		System.err.println("-----------------2");
		try {
			System.err.println("-----------------3");
			SerialPort port = new SerialPort("COM3");
			System.err.println("-----------------4");
			if (port.openPort()) {
				System.err.println("-----------------5");
//				port.setParams(SerialPort.BAUDRATE_115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
//						SerialPort.PARITY_NONE);
				System.err.println("-----------------6.1");
				port.setParams(9600, 7, 1, 0); // alternate technique
//				byte[] buffer = port.readBytes(10 /* read first 10 bytes */);

//				System.err.println(port.readString() +" ///////////// STRING");

//				System.err.println(port.readString(15) + " /////////////// BIT");
//				port.addEventListener(new SerialPortEventListener() {
//					
//					@Override
//					public void serialEvent(SerialPortEvent ex) {
//						System.err.println(ex.getEventValue());
//						
//						try {
//							port.readString();
//						} catch (SerialPortException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				});

				System.err.println("-----------------6.2");
//				port.readString();

				System.err.println(port.toString());

				System.err.println(port.readString());

				System.err.println(port.readString());

				System.err.println(port.readHexString());

				String pesooo5 = port.readString(1);
				System.err.println(pesooo5);
				System.err.println("-----------------6.3");
				String pesooo = port.readString(10);
				System.err.println("-----------------6.4");
				String dato = pesooo.substring(4);
				System.err.println("-----------------6.5");

				System.err.println(pesooo + " " + port.readString());
				try {
					peso = Double.parseDouble(dato);
				} catch (Exception e) {
					// TODO: handle exception

					try {
						port.readString();
						String pesooo1 = port.readString(10);
						String dato1 = pesooo1.substring(4);

						peso = Double.parseDouble(dato1);
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
					e.printStackTrace();
				}
//				while (true) {
//					port.readString();
//					String dato = port.readString(10).substring(4);
//					System.err.println(dato);
//					
//				}
				port.closePort();
				System.err.println("-----------------10");

			}
			System.err.println("-----------------6");

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

		return peso;

	}

	public static void main(String[] args) {

//		com.fazecast.jSerialComm.SerialPort[] puertos = com.fazecast.jSerialComm.SerialPort.getCommPorts();
//		for (com.fazecast.jSerialComm.SerialPort aux : puertos) {
//			System.err.println();
//			System.err.println(aux.getDescriptivePortName());
//		}
//
//		com.fazecast.jSerialComm.SerialPort puertoBalanza = com.fazecast.jSerialComm.SerialPort.getCommPort("COM10");
//
//		puertoBalanza.openPort();
//		try {
//			while (true) {
//				while (puertoBalanza.bytesAvailable() == 0)
//					Thread.sleep(20);
//
//				int by = puertoBalanza.bytesAvailable();
//
//				byte[] readBuffer = new byte[by];
//				int numRead = puertoBalanza.readBytes(readBuffer, readBuffer.length);
//				System.out.println("Read " + numRead + " bytes.");
//			
//
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		puertoBalanza.closePort();

//		04123340813 JOSE
		try {
			SerialPort port = new SerialPort("COM7");
			if (port.openPort()) {
//				port.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
//						SerialPort.PARITY_NONE);
				port.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_7, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE); // alternate technique
//				byte[] buffer = port.readBytes(10 /* read first 10 bytes */);
//				port.setRTS(false);
//				System.err.println(port.readString() +" ///////////// STRING");
//				System.err.println(port.readString(15) + " /////////////// BIT");
//				port.addEventListener(new SerialPortEventListener() {
//					
//					@Override
//					public void serialEvent(SerialPortEvent ex) {
//						System.err.println(ex.getEventValue());
//						
//						try {
//							port.readString();
//						} catch (SerialPortException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				});


				
			
//				String peso = port.readString();
//				System.err.println(peso);
//				
//				Thread.sleep(200);
//				
//				peso = port.readString();
//				System.err.println(peso);
				
//				if (peso != null) {
//					String[] pesoAux = peso.trim().split("\n");
//					if (pesoAux.length > 0) {
//						String pesooo = pesoAux[1].trim();
//						String decimal = pesooo.substring(pesooo.length()-3, pesooo.length());
//						String entera = pesooo.substring(0, pesooo.length()-3);
//						System.err.println(entera+"."+decimal);
//					}
//					
//				}
//				
//				
//				
//				try {
//					Thread.sleep(2500);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//				port.closePort();
			
				//*****
				
				
				while (true) {
//					if (port.getInputBufferBytesCount()> 0) {
//						System.err.println(port.readString()+"\n");
//					}

					String peso = port.readString();
//					if (peso != null) {
//						String[] dato = peso.split(" ");
//						System.err.println(dato[0]+"\n");
//					
//					}
					
//					System.err.println(peso);
					
					
					if (peso != null) {
						String[] pesoAux = peso.trim().split("\n");
						if (pesoAux.length > 0) {
							String pesooo = pesoAux[1].trim();
//							System.err.println(pesooo);
							String decimal = pesooo.substring(pesooo.length()-3, pesooo.length());
							String entera = pesooo.substring(0, pesooo.length()-3);
							System.err.println(entera+"."+decimal);
//							System.err.println(decimal);	
						}
						
					}
					
					
					
					try {
						Thread.sleep(2500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				
//					boolean dato = port.writeString("D");
//					System.err.println(dato);
//					String datoAux = port.readString();
//					System.err.println(datoAux);
				}
//				port.closePort();

			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
	}
}
