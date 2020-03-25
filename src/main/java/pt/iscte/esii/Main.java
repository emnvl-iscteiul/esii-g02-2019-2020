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
        System.out.println("Hello, world!");
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

    /**
     * Returns the sum of two numbers
     *
     * @param a The first number to sum
     * @param b The second number to sum
     * @return The sum of the given numbers
     */
    private static int sum(int a, int b){
        return a + b;
    }

}
