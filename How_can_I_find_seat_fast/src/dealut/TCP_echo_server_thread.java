package dealut;
/*
 * 3개 실행시 결과 값!

 *Created and started Thread = Thread-0

Created and started Thread = Thread-1

Created and started Thread = Thread-2

Client address and port = 127.0.0.1:52913
Thread = Thread-2
Exception =Connection reset

Client address and port = 127.0.0.1:52912
Thread = Thread-1
Exception =Connection reset

Client address and port = 127.0.0.1:52910
Thread = Thread-0
Exception =Connection reset
 */
import java.awt.*;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.lang.String;
import java.net.*;
import java.net.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.net.Socket;
import java.net.ServerSocket;

//SERVER
public class TCP_echo_server_thread {
	public static void main(String[] args) throws IOException{
		ServerSocket servSock = new ServerSocket(6789);

		System.out.println("Ready to server");
	
		Logger logger = new ConsoleLogger(); //Log messages to console
		//Run forever, accepting and spawning threads to service each connection 
		for(;;){//들어오는 요구를 반복적으로 처리함/ 포트에 의해 만들어지는 accept를 호출!
				Socket ClntSock = servSock.accept(); 
				System.out.println("Hello!");
			
				Echo_protocol protocol = new Echo_protocol(ClntSock, logger);
				Thread thread = new Thread(protocol);
				thread.start();
				logger.writeEntry("Created and started Thread = " + thread.getName());
			
		}
		/*Not reached*/
	}
}
