package pt.iscte.esii;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    /**
     * Main entry point for the application
     *
     * @param args arguments passed in the command-line
     */
    public static void main(String[] args) {
        String name = getMachineName();
        if (!name.equals("")) System.out.print(getMachineName() + " says: ");
        System.out.println("Hello, world!\n");

        Calc c = new Calc();
        System.out.println("The sum of 2+2 is " + c.sum(2).sum(2).result());
    }

    /**
     * Retuns the hostname for the local machine
     *
     * @return The hostname for this machine
     */
    private static String getMachineName(){
        String hostname = "";
        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }
        return hostname;
    }

}
