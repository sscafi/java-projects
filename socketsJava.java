import java.net.*;
import java.io.*;

public Class DataServer
{
    public static void main(String[] args){
        try{
            ServerSocket = new ServerSocket(6013);
            /* now listen for conenctions*/
            while(true){
                Socket client = sock.accept();

                PrintWriter pout = new 
                    PrintWriter(client.getOutPutStream(), true);

                    /* wrote the data to the socket*/
                    pout.println(new java.util().toString());
                    /* close the socket and resume*/
                    /*listening for connections */
                    client.close();
            }
        }
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}