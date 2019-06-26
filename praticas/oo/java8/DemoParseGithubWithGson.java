import java.io.*;
import java.net.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.*;
//import java.io.File;
import java.io.IOException;
import java.io.Reader;

// javac -cp .:gson-2.8.5.jar DemoParseGithubWithGson.java
// java -cp .:gson-2.8.5.jar DemoParseGithubWithGson



public class DemoParseGithubWithGson {

  public static void main(String[] args) throws IOException {

    
    //String urlstr = "https://api.github.com/repos/google/gson/commits?page=2";
    String urlstr = "https://api.github.com/repos/google/gson/commits";
    
    if (args.length >= 1) {
      urlstr = args[0];
    }
    
    URL url = new URL(urlstr);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    con.setRequestProperty("User-Agent", "Mozilla/5.0");
    System.out.println("Response code: " + con.getResponseCode());
    
    BufferedReader in = new BufferedReader(
      new InputStreamReader(con.getInputStream()));

    // Response header (includes pagination links)
    System.out.println(con.getHeaderFields().get("Link").get(0));
    
    // Parse a nested JSON response using Gson
    JsonParser parser = new JsonParser();
    JsonArray results = parser.parse(in.readLine()).getAsJsonArray();
    System.out.println("Size: "+ results.size());
    
    for (JsonElement e : results) {
      System.out.println(e
          .getAsJsonObject().get("commit")
          .getAsJsonObject().get("author")
          .getAsJsonObject().get("date"));
    }   

    
    in.close();
  }

}

