package client;

/**
 * Created by smile on 13-Mar-16.
 */

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import rpc.server.ThriftServer;
import server.*;

import javax.swing.*;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Object[] possibilities = {"RPC", "SOAP"};
        String choise = (String)JOptionPane.showInputDialog(null, "Choose server type", "Server Chooser",
                JOptionPane.PLAIN_MESSAGE, null, possibilities, "RPC");
        if(choise.equals("RPC")){
            connectToRpc();
        } else if(choise.equals("SOAP")){
            connectToSoap();
        } else {
            System.exit(0);
        }
    }

    private static void connectToRpc(){
        try {
            TTransport transport;
            transport = new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            ThriftServer.Client client = new ThriftServer.Client(protocol);
            MainWindow window = new MainWindow(null,client);
        } catch (TException x) {
            JOptionPane.showMessageDialog(null, "Can't accept the server");
            System.exit(0);
        }
    }

    private static void connectToSoap(){
        try {
            SoapServerImplService hService = new SoapServerImplService();
            SoapServer hello = hService.getSoapServerImplPort();
            MainWindow window = new MainWindow(hello, null);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Can't accept the server");
            System.exit(0);
        }
    }
}
