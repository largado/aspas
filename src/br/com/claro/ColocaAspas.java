package br.com.claro;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.Writer;

public class ColocaAspas {
    public static void main (String[] args) throws IOException {

        // arquivo de entrada - padrão de projeto java decorator

        FileInputStream arquivo = new FileInputStream("C:\\Users\\F136450\\IdeaProjects\\aspas\\out\\production\\aspas\\entrada.txt");
        InputStreamReader leitor = new InputStreamReader(arquivo);
        BufferedReader leitorbuffer = new BufferedReader(leitor);

        String linha = leitorbuffer.readLine();

        // escreve arquivo

        FileOutputStream arquivoparaescrita = new FileOutputStream("C:\\Users\\F136450\\IdeaProjects\\aspas\\out\\production\\aspas\\saida.txt");
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
