package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server {

    public static int PORT_NUMBER= 5000;
  // Get Server Started
    private  ServerSocket connect(){

        ServerSocket serverSocket = null;
        try{ serverSocket = new ServerSocket(PORT_NUMBER);

            System.out.println("Server Online");

        }

        catch (IOException e){

        System.out.println("SERVER:" + "error creating network connection");
        }
  return  serverSocket;
    }



     //Handle All Request


    private void handleRequests(ServerSocket serverSocket){
         while (true){

             Socket socket = null;
             BufferedReader in = null;
             PrintWriter out = null;

             try{

                 socket = serverSocket.accept();

                 in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                 out = new PrintWriter(socket.getOutputStream());



             }

             catch (IOException e) {
                 e.printStackTrace();

                 System.out.println("SERVER:" + "Error connecting to client");

                 System.exit(-1);



             }

             // Read in Client's request
             try{
                 String request = in.readLine();
                 System.out.println("Client request received" + request);
                 if(request.equals("What is the time")){

                     out.println(new java.util.Date());

                 }

                 else
                     System.out.println("SERVER:"+ "Unknown request");

                 out.flush();
                 socket.close();





             } catch (IOException e) {
                 e.printStackTrace();

                 System.out.println("Server Message;"+"Error Communicating with Client");

             }


         }

    }


       public static void main(String args []){

        Server server = new Server();
        ServerSocket ss = server.connect();
        if(ss != null)

            server.handleRequests(ss);

       }

}
