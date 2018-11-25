

//Saved by Client.java

import java.net.*;
import java.io.*;
import java.util.*;

class Client {
	public static void main(String[] args) {
		try {
			String pname = args[0];
			int pno = Integer.parseInt(args[1]);
			Socket s=new Socket(pname,pno);
			System.out.println("client chuan bi ket noi den server");
			System.out.println("doc 1 so tu ban phim");
			Scanner sn=new Scanner(System.in);
			int data=sn.nextInt();
			OutputStream os=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			dos.writeInt(data);
			InputStream is=s.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			int result=dis.readInt();
			System.out.println("Ket qua tu server :"+result);
			 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}