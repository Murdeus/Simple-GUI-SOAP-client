package client;

/**
 * Created by smile on 13-Mar-16.
 */

import server.*;

public class Client {

    public static void main(String[] args) {
        SoapServerImplService hService = new SoapServerImplService();
        SoapServer hello = hService.getSoapServerImplPort();
        MainWindow window = new MainWindow(hello);
    }
}
