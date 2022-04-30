package avena;

import java.io.*;


public class OutraForma2 {
    public static void main (String[] args) throws IOException {

        FileWriter escrevedordearquivo = new FileWriter("entrada1.txt");
        BufferedWriter bufferescrevedor = new BufferedWriter(escrevedordearquivo);

        escrevedordearquivo.write("linha de teste escrita pelo escrevedor de arquivo");
        bufferescrevedor.newLine();
        escrevedordearquivo.write("linha de teste 2 escrita pelo escrevedor de arquivo");
        bufferescrevedor.newLine();
        escrevedordearquivo.write("linha de teste 3 escrita pelo escrevedor de arquivo");
        bufferescrevedor.newLine();
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
