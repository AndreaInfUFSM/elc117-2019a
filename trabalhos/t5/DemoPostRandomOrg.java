import java.net.*;
import java.io.*;

public class DemoPostRandomOrg {

  public static void main(String[] args) {

  	try {
      String urlstr = "https://www.random.org/lists/?mode=advanced";
      URL url = new URL(urlstr);
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("POST");
      con.setRequestProperty("User-Agent", "Mozilla/5.0");
      con.setDoOutput(true);
      
      // Configura dados que serão enviados na requisição
      // Nesse exemplo, os dados são as seguintes 3 strings:
      // Fulano
      // Beltrano
      // Sicrano
      // Os dados devem ser separados por %0D%0A, 
      // que corresponde a CR=LF usando HTML URL Encoding 
      // (https://www.w3schools.com/tags/ref_urlencode.asp)
      // Obs.: O formato desta requisição não é documentado pelo site random.org.
      // Esse formato foi descoberto usando uma ferramenta que navegadores 
      // oferecem para inspecionar o tráfego de requisições pela rede:
      // https://developers.google.com/web/tools/chrome-devtools/network/
      // ATENÇÃO: seu programa não deve enviar requisições em uma frequência maior
      // do que aquela que um humano conseguiria reproduzir :-) 
      // Caso haja mau uso do serviço, o site random.org vai bloquear suas requisições.
      // Veja regras para clientes automatizados em: https://www.random.org/clients/
      String data = "list=Fulano%0D%0ABeltrano%0D%0ASicrano&format=plain&rnd=new";
      // Envia dados pela conexão aberta
      con.getOutputStream().write(data.getBytes("UTF-8"));
      System.out.println("Response code: " + con.getResponseCode());

      // Cria objeto que fará leitura da resposta pela conexão aberta
      BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));

      // Lê resposta, linha por linha
      String responseLine;
      StringBuffer response = new StringBuffer();
      while ((responseLine = in.readLine()) != null) {
        response.append(responseLine + "\n");
      }
      // Mostra resposta
      System.out.println(response); 

      in.close();
    } catch (IOException e) {
    	e.printStackTrace();
    }
  }

}
