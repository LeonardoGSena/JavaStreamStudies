
import br.com.cadastro.model.Jogador;
import br.com.cadastro.negocio.JogadorImpl;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;


public class Program {
    public static void main(String[] args) throws IOException {
        Program p = new Program();
        JogadorImpl jogImpl = new JogadorImpl();
        String enderecoDir = "C:\\Users\\lgome\\Documents\\Java";
        String nomeArquivo = "jogadores.txt";

        List<Jogador> listaDeJogadores = jogImpl.getListaDeJogadores(Paths.get(enderecoDir + "\\" + nomeArquivo));

        if (!jogImpl.verificarArquivoExiste(Paths.get(enderecoDir))){
            System.out.println("Arquivo não encontrado");
        } else {
            jogImpl.imprimirJogadorArtilheiro(listaDeJogadores);
            jogImpl.imprimirJogadorMaisVelho(listaDeJogadores);
            jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);
            jogImpl.imprimirJogadoresTime(listaDeJogadores, "Santos");
            jogImpl.imprimirSomatorioGols(listaDeJogadores);
//            jogImpl.agruparJogadoresPeloTime(listaDeJogadores);
//            jogImpl.ordenarJogadoresGols(listaDeJogadores);
//            jogImpl.agruparJogadoresPorTime(listaDeJogadores);
        }
    }
}

