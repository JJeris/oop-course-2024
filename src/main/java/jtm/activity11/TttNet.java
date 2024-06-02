package jtm.activity11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/**
 * This class works as a wrapper for TttCli class and allows to send data
 * through TCP socket instead of standard input/output
 *
 */
public class TttNet {
	// use the same port number as port in src/resources/appplication.properties
	// file:
	static final int port = 7700;
	static final String host = "localhost"; // host to connect to

	public static void main(String[] args) {
		int size = 0;
		if (args != null && args.length == 1)
			size = Integer.parseInt(args[0]);
		ServerSocket server; // server socket, which listens to new connections
		Socket socket; // client socket, which connects to the server
		TttCli tttCli; // Standard CLI as an internal part of TttNet object
		// 1. Try to run as a server
		try {
			/*-
			 * TODO #1
			 * create ServerSocket object and get
			 * Socket object by executing accept() method for it
			 */

			server = new ServerSocket(port);
			System.out.println("Working as server");
			socket = server.accept();
			InputStream input;
			OutputStream output;

			/*- TODO #2
			 * Initialize input/output streams to the socket
			 * input = InputStream < Socket
			 * output = OutputStream < Socket
			 */

			input = socket.getInputStream();
			output = socket.getOutputStream();

			/*- TODO #3
			 * Create TttCli object and use initialized socket streams for it's input and output
			 * execute play() method for it to start it running
			 */

			tttCli = new TttCli(input, output, size);
			System.out.println("Working as server");
			tttCli.play();
			System.out.println("Game started");

		} catch (Exception e) {
			// catching BindException is OK, if second instance is executed, just continue
			// then, catching other exceptions may not be OK
		}
		// 2. If could not run as a server, try to run as a client
		try {
			BufferedReader stdin, srvin;
			PrintWriter srvout, stdout;

			/*- TODO #1
			 * initialize client socket to the server
			 */
			socket = new Socket(host, port);
			/*-
			 *  TODO #2 intitialize readers and writers to the streams of socket
			 *  and to system input and output:
			 *  
			 *  srvin = BufferedReader < InputStreamReader < InputStream < Socket
			 *  stdout = PrintWriter > System.out
			 *  stdin = BufferedReader < InputStreamReader < System.in
			 *  srvout = PrintWriter > OutputStream > Socket
			 */

			srvin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stdout = new PrintWriter(System.out);
			stdin = new BufferedReader(new InputStreamReader(System.in));
			srvout = new PrintWriter(socket.getOutputStream());
			/*-
			 *  TODO #3
			 *  While game is not ended:
			 *      1. read lines from srvin
			 *      2. print them to stdout
			 *      3. read line from stdin
			 *      4. print it to srvout
			 *      
			 *  Hints:
			 *  1. To be sure that all needed lines are read from server, check for signatures, e.g.:
			 *      "Game ended!"
			 *      "Enter place:"
			 *  2. Don't forget to flush buffers!
			 *  3. Don't forget to close socket!
			 */

			String line = "";
			while (true) {
//			while(!(line.equals("Enter place:") && line.equals("Game ended!"))) {
//				do {
//					line = srvin.readLine();
//					stdout.println(line);
//
//				} while (!(line.equals("Enter place:") && line.equals("Game ended!")));

				while((line = srvin.readLine()) != null) {
					stdout.println(line);
					stdout.flush();
					if (line.equals("Enter place:") || line.equals("Game ended!")) {
						break;
					}
				}

				if (line.equals("Game ended!")) {
					srvout.flush();
					break;
				}

				line = stdin.readLine();
				srvout.println(line);
				srvout.flush();
				if (line.equals("Game ended!")) {
					break;
				}
			}
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
