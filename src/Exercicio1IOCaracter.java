import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Exercicio1IOCaracter {
  public static void receberTecladoImprimirConsole() throws IOException {
    
    InputStream is = System.in;
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Recomende 3 filmes: ");
    /*
    COM PADRÃO DE PROJETO DECORATOR

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    */

    String line = br.readLine();

    OutputStream os = System.out;
    OutputStreamWriter osw = new OutputStreamWriter(os);
    BufferedWriter bw = new BufferedWriter(osw);

    /*
    COM PADRÃO DE PROJETO DECORATOR

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    */

    do {
      bw.write(line);
      bw.newLine();
      line = br.readLine();
    }while(!(line.isEmpty()));

    bw.flush();
    br.close();
    bw.close();
    
  }
  public static void main(String[] args) throws IOException {
    
    receberTecladoImprimirConsole();
  }
}
