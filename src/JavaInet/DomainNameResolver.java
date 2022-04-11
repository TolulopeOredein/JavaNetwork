package JavaInet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DomainNameResolver {
      public static void main(String args[]) throws UnknownHostException {
          System.out.println("Enter a domain name below :");

          BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
          input.lines().forEach((line) -> {
              try {
                  InetAddress address =  InetAddress.getByName(line);
                  System.out.println(address.getHostAddress());
              }
              catch (UnknownHostException e){
                  System.out.println("Unknown Host");
              }
          });
      }
}
