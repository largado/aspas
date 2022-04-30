package avena;

import java.io.*;


public class OutraForma {
    public static void main (String[] args) throws IOException {

        FileWriter escrevedordearquivo = new FileWriter("entrada1.txt");
        escrevedordearquivo.write("linha de teste escrita pelo escrevedor de arquivo");
        escrevedordearquivo.write("\n"); //para mac
        escrevedordearquivo.write("linha de teste 2 escrita pelo escrevedor de arquivo");
        escrevedordearquivo.write("\r\n"); //para windows
        escrevedordearquivo.write("linha de teste 3 escrita pelo escrevedor de arquivo");
        escrevedordearquivo.write(System.lineSeparator()); // outra forma de pular linha
        escrevedordearquivo.write("linha de teste 4 escrita pelo escrevedor de arquivo");



       /* while (linha != null){

            System.out.println("'"+linha+"',");
            escritorbuffer.write("'"+linha+"',");
            escritorbuffer.newLine();
            linha = leitorbuffer.readLine();
        }

        */

        escrevedordearquivo.close();

    }

}
