import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.logging.StreamHandler;

//1 Working with URL class
public class UrlTest {

    public static void main(String args[]){
        URL webpage = null;
//        URLStreamHandler sh = new URLStreamHandler() {
//            @Override
//            protected URLConnection openConnection(URL url) throws IOException {
//                return null;
//            }
//        };

        try{
            webpage = new URL("http", "apple.com",80, "/ipad/index.html");
        }
        catch(MalformedURLException e){
            e.printStackTrace();
        }

        System.out.println(webpage);
        System.out.println("the protocol is :" + webpage.getProtocol());
        System.out.println("the host is:"+ webpage.getHost());
        System.out.println("the port no is:" + webpage.getPort());
        System.out.println("the default port no is:" + webpage.getDefaultPort());
        System.out.println("the file name is :" + webpage.getFile());
        System.out.println("the ref is :" + webpage.getRef());
    }
}
