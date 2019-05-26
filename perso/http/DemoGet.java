import java.io.*;
import java.net.*;

public class DemoGet {

  public static void main(String[] args) throws IOException {

    String urlstr = "https://api.chucknorris.io/jokes/random";
    URL url = new URL(urlstr);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();

    con.setRequestMethod("GET");
    con.setRequestProperty("User-Agent", "Mozilla/5.0");

    System.out.println("Response code: " + con.getResponseCode());
    
    BufferedReader in = new BufferedReader(
      new InputStreamReader(con.getInputStream()));
    System.out.println(in.readLine()); // read a single line
    in.close();
  }
}


