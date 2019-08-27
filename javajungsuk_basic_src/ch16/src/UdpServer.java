import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UdpServer {
	public void start() throws IOException {
		// 포트 7777번을 사용하는 소켓을 생성한다.
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;

		byte[] inMsg = new byte[10];
		byte[] outMsg;

		while(true) {
			// 데이터를 수신하기 위한 패킷을 생성한다.
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket); // 패킷을 통해 데이터를 수신(receive)한다.

			// 수신한 패킷으로 부터 client의 IP주소와 Port를 얻는다.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();

			// 서버의 현재 시간을 시분초 형태([hh:mm:ss])로 반환한다.			
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); // time을 byte배열로 변환한다.

			// 패킷을 생성해서 client에게 전송(send)한다.
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.send(outPacket);
		}
	} // start()

	public static void main(String args[]) {
		try {  
			new UdpServer().start();  // UDP서버를 실행시킨다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // main
}