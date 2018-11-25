

//Saved by Server.java

import java.net.*;
import java.io.*;


class Server {
	public static void main(String[] args) {
		try {
			int pno = Integer.parseInt(args[0]);
			ServerSocket ss=new ServerSocket(pno);
			System.out.println("Server da san sang nhan request tu phia client");
			Socket s1=ss.accept();
			InputStream is=s1.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			int n=dis.readInt();
			System.out.println("Gia tri doc duoc tu phia client:"+n);
			int result=n*n;
			OutputStream os=s1.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			dos.writeInt(result);
			s1.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}