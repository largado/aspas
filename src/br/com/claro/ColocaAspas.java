package avena;

import java.io.*;
import java.net.Socket;

public class ColocaAspas {
    public static void main (String[] args) throws IOException {

        // arquivo de entrada - padrão de projeto java decorator

        /* exemplo via rede

        Socket s = new Socket();
        FileOutputStream arquivoparaescrita = new s.getOutputStream();
        Writer leitorescrita = new OutputStreamWriter(arquivoparaescrita);
        BufferedWriter escritorbuffer = new BufferedWriter(leitorescrita);

        */

        InputStream arquivo = System.in; // exemplo se a entrada fosse com o teclado

        // FileInputStream arquivo = new FileInputStream("entrada.txt"); //exemplo entrada arquivo é a entrada
        InputStreamReader leitor = new InputStreamReader(arquivo);
        BufferedReader leitorbuffer = new BufferedReader(leitor);

        String linha = leitorbuffer.readLine();

        // escreve arquivo

        FileOutputStream arquivoparaescrita = new FileOutputStream("saida.txt");
        Writer leitorescrita = new OutputStreamWriter(arquivoparaescrita);
        BufferedWriter escritorbuffer = new BufferedWriter(leitorescrita);

        while (linha != null){

            System.out.println("'"+linha+"',");
            escritorbuffer.write("'"+linha+"',");
            escritorbuffer.newLine();
            linha = leitorbuffer.readLine();
        }

        leitorbuffer.close();
        escritorbuffer.close();

    }

}
