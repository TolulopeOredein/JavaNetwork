import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {

    public static  void  main (String args[])  {
        URL wiki;
        try{ wiki = new URL("https://cnn.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(wiki.openStream()));
            String lineOfWebPage;
            while((lineOfWebPage = in.readLine()) != null){
                System.out.println(lineOfWebPage);
                in.close();}

        }
        catch (MalformedURLException e){
            e.printStackTrace();
            System.out.println("Out of service for now");
        }

        catch (IOException e){
            e.printStackTrace();
            System.out.println("can't find webpage");
        }

    }

}
