import java.net.*;
import java.io.*;

public class UdpClient {
	public void start() throws IOException, UnknownHostException {
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress    serverAddress  = InetAddress.getByName("127.0.0.1");

		// 데이터가 저장될 공간으로 byte배열을 생성한다.
		byte[] msg = new byte[100];

		DatagramPacket outPacket =
                        new DatagramPacket(msg, 1, serverAddress, 7777);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

		datagramSocket.send(outPacket);    // DatagramPacket을 전송한다.
		datagramSocket.receive(inPacket);  // DatagramPacket을 수신한다.

		System.out.println("current server time :"
                                      + new String(inPacket.getData()));

		datagramSocket.close();
	} // start()

	public static void main(String args[]) {
		try {
			new UdpClient().start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main 
}