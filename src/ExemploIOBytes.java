import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExemploIOBytes {
  
  public static void copiarArquivo() throws IOException {
    
    File f = new File("C:\\Users\\ander\\DIO\\trilha-java\\IO\\Pratica1\\recomendações-copy.txt");
    String nomeArquivo = f.getName();

    InputStream is = new FileInputStream(f.getName());
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName()));

    String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");
    File fCopy = new File(nomeArquivoCopy);
    
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fCopy));

    int line = 0;
    while ((line = bis.read()) != -1) {
      bos.write((char) line);
      bos.flush();
    }
    bis.close();
    bos.close();

  }

  public static void main(String[] args) throws IOException {
    
    copiarArquivo();
  }
}
