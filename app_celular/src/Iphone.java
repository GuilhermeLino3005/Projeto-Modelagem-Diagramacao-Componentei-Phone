import aplicativo.Safari;
import aplicativo.Spotify;
import aplicativo.Telefone;
import java.util.Scanner;
public class Iphone {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Safari safari = new Safari();
        Spotify spotify = new Spotify();
        Telefone telefone = new Telefone();
        
        System.out.println("Qual app deseja abrir: ");
        String opcao = scanner.nextLine();

        switch (opcao) {
            case "Safari":
                System.out.println("Digite o nome do site desejado: ");
                String url = scanner.nextLine();
                
                safari.exibirPagina(url);;
                safari.adicionarNovaAba();
                safari.atualizarPagina();
                break;
            
            case "Spotify":
                System.out.println("Digite o nome da musica desejado: ");
                String musica = scanner.nextLine();
            
                spotify.selecionarMusica(musica);
                spotify.tocar();
                spotify.pausar();

                break;
            
            case "Telefone":
                System.out.println("Digite o nome do contato desejado: ");
                String contato = scanner.nextLine();

                telefone.ligar(contato);
                telefone.atender();
                telefone.caixaPostal();
                break;
            
            default:
                System.out.println("APP NÃO ENCONTRADO");
        }
    
    }   
}
