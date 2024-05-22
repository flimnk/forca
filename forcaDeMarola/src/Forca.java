import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Forca {
    private static String palavraEscolhida;
    private static StringBuilder stringBuilder;
    private static String categoria;
    private static Scanner sc = new Scanner(System.in);
    private  static  int erro;

    public static void main(String[] args) {
        jogo();
    }

    public static void geraPalavra(int nivel) {
        Random random = new Random();
        int x, y;
        List<String[]> listaCategorias = new ArrayList<>();

        if (nivel == 1) {
            x = 0;
            y = 5;
        } else if (nivel == 2) {
            x = 5;
            y = 10;
        } else {
            x = 10;
            y = 15;
        }

        String[] Filmes = {"Titanic", "Inception", "The Godfather", "The Dark Knight", "Forrest Gump", "Pulp Fiction", "The Shawshank Redemption", "Shiva Baby", "Star Wars", "Jurassic Park", "The Matrix", "Avengers: Endgame", "Gladiator", "Fight Club", "Interstellar", "Filme"};
        String[] Series = {"Breaking Bad", "Game of Thrones", "Stranger Things", "Friends", "The Office", "The Simpsons", "Sherlock", "The Crown", "Westworld", "House of Cards", "Black Mirror", "The Mandalorian", "The Witcher", "Animais Políticos", "True Detective", "Serie"};
        String[] Animais = {"Cachorro", "Gato", "Elefante", "Tigre", "Leão", "Girafa", "Panda", "Urso", "Cavalo", "Coelho", "Rinoceronte", "Gorila", "Delfim", "Canguru", "Foca", "Animal"};
        String[] Paises = {"Brasil", "Argentina", "Canadá", "Japão", "Alemanha", "Holanda", "Bélgica", "Luxemburgo", "Dinamarca", "Suécia", "Burquina Faso", "Brunei", "Comores", "Kiribati", "Lesoto", "País"};
        String[] Profissoes = {"Médico", "Engenheiro", "Professor", "Advogado", "Arquiteto", "Astronauta", "Biólogo Marinho", "Engenheiro Aeroespacial", "geólogo", "Engenheiro de Software", "Anestesiologista", " Sereia profissional", "Neurocientista", "Luto de aluguel", "Estatístico Quantitativo", "Profissao"};
        String[] Frutas = {"Maçã", "Banana", "Laranja", "Morango", "Abacaxi", "Cereja", "Pêssego", "Abacate", "Kiwi", "Pitaya", "Cherimoia", "Granadilha", "Lichia", "Longan", "Mangostão", "Fruta"};
        String[] Esportes = {"Futebol", "Basquete", "Tênis", "Vôlei", "Natação", "Atletismo", "Boxe", "Ciclismo", "Ginástica", "Hóquei", "Rugby", "Skate", "Surfe", "Golfe", "Beisebol", "Esporte"};
        String[] MarcasCarro = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Porsche", "Ferrari", "Lamborghini", "Tesla", "Nissan", "Hyundai", "Kia", "MARCA DE CARRO"};
        String[] PersonagensDesenho = {"Mickey Mouse", "Bob Esponja", "Homer Simpson", "Naruto", "Goku", "Bart Simpson", "Pikachu", "Snoopy", "Tom", "Jerry", "Scooby-Doo", "Pateta", "Popeye", "Shrek", "Elsa", "Personagem"};
        String[] BandasMusicais = {"The Beatles", "Queen", "Nirvana", "Metallica", "U2", " Legião Urbana", "Led Zeppelin", "Pink Floyd", "Titãs", "Coldplay", " Skank", "The Doors", "Radiohead", "Green Day", "The Who", "Banda Musical"};

        listaCategorias.add(BandasMusicais);
        listaCategorias.add(Esportes);
        listaCategorias.add(Animais);
        listaCategorias.add(Filmes);
        listaCategorias.add(Frutas);
        listaCategorias.add(MarcasCarro);
        listaCategorias.add(Series);
        listaCategorias.add(Profissoes);
        listaCategorias.add(Paises);
        listaCategorias.add(PersonagensDesenho);

        int numberCateogiria = random.nextInt(10);
        int numberElemento = random.nextInt(x, y);

        categoria = listaCategorias.get(numberCateogiria)[15];
        palavraEscolhida = listaCategorias.get(numberCateogiria)[numberElemento];
    }

    public static void menu() {
        System.out.println();
        System.out.println("                                                                SEJA BEM VINDO AO JOGO DA");
        System.out.println();
        System.out.println("  *********************          *************************         ******************        **********************        ******************");
        System.out.println("  * ******************           *************************         *******************       *    *               *        ******************");
        System.out.println("  * **** *************           *************************         ********************      *    *****************        *                *");
        System.out.println("  *  * * * *                     *************************         *******************       *    *                        *                *");
        System.out.println("  * * *  **********              *************************         * **************          *    *                        ******************");
        System.out.println("  *  *  ***********              *************************         *            *            *    *                        *   *        *   *");
        System.out.println("  *  *  *                        *************************         *              *          *    *****************        *   *        *   *");
        System.out.println("  * * * *                        *************************         *                 *       *                    *        *   *        *   *");
        System.out.println("  * * * *                        *************************         *                   *     **********************        * * *        * * *");

        System.out.println();
        System.out.println();

        var menu = """
                                                                                       DESEJA JOGAR O MODO
                                                                                        1 - FACIL
                                                                                        2 - MEDIO
                                                                                        3 - DIFÍCIL                                     
                """;
        System.out.println(menu);
    }


    public static void imprimirTema() {
        System.out.println("                                                                    TEMA: " + categoria);
        System.out.println("                                                           **************BOA SORTEE**************");
    }

    private static void exibirBoneco(int erro) {
        System.out.println("  _______");
        System.out.println(" |/      |");
        System.out.println(" |      " + (erro >= 1 ? "(_)" : ""));
        System.out.println(" |      " + (erro >= 2 ? "/" : "") + (erro >= 3 ? "|" : "") + (erro >= 4 ? "\\" : ""));
        System.out.println(" |      " + (erro >= 5 ? "/" : "") + " " + (erro >= 6 ? "\\" : ""));
        System.out.println(" |");
        System.out.println("_|___");
        System.out.println();
    }

    public static void imprimirPalavra(char chute) {
        int qtdElementos =0;
        int qtdAcertos =0;
        for (int i = 0; i < palavraEscolhida.length(); i++) {
            if(palavraEscolhida.charAt(i) != ' ') {

                if (palavraEscolhida.toLowerCase().charAt(i)== Character.toLowerCase(chute) ) {
                    stringBuilder.setCharAt(qtdElementos+i, palavraEscolhida.charAt(i));
                    qtdAcertos++;

                }
                qtdElementos++;
            }
        }
                if(qtdAcertos>0){
                    System.out.println("Bom chute!!!");
                }else{
                    erro++;
                    System.out.println("ERROU!!!");
                }

    }

    public static String imprimirPalavraInicio() {
         stringBuilder = new StringBuilder();


        for (int i = 0; i < palavraEscolhida.length(); i++) {
            if (palavraEscolhida.charAt(i) == ' ') {
                stringBuilder.append(' ');
            } else {
                stringBuilder.append('_');
                stringBuilder.append(' ');
            }

        }

    return  stringBuilder.toString();
    }
    private  static  String retiraEspaco (String str) {
        StringBuilder strr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strr.append(str.charAt(i));

            }
        }

        return strr.toString();
    }
    private static boolean verifcaGanhou(String str) {
            return  palavraEscolhida.equalsIgnoreCase(retiraEspaco(str));

    }
    private static boolean verifcaValores(List<Character> list, char chute) {
       for(int i=0;i<list.size();i++){
           if (Character.toLowerCase(list.get(i))==Character.toLowerCase(chute)){
               System.out.println("VOCE JA CHUTOU "+ chute);
               return false;
           }
       }
        return true;
    }
    public  static  void ganhou(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!PARABÉNS VOCE GANHOU !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    public  static  void perdeu(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!PERDEU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    public static void jogo() {

            List<Character> letras = new ArrayList<>();
            menu();
             int op = sc.nextInt();
            sc.nextLine();  // Consome a nova linha após a entrada de número inteiro
            geraPalavra(op);
            imprimirTema();
            System.out.println();
            System.out.println("                                                                    "+ imprimirPalavraInicio());
            while (erro < 6) {
                System.out.println("                                                                   DIGITE SEU CHUTE");
                System.out.println();
                String chute = sc.nextLine();
                if (verifcaValores(letras,chute.charAt(0))) {
                    letras.add(chute.charAt(0 ));
                    imprimirPalavra(chute.charAt(0));
                    System.out.println("                                                                       "+stringBuilder  );
                    exibirBoneco(erro);
                    if(verifcaGanhou(stringBuilder.toString())){
                        ganhou();
                        break;

                    }
                    System.out.println("                                                                  PARA CHUTAR A PALAVRA DIGITE S / OU N PARA CONTINUAR");

                    if(sc.nextLine().equalsIgnoreCase("s") ){
                        System.out.println("                                                                            DIGITE A PALAVRA");
                        if(verifcaGanhou(sc.nextLine())){
                            ganhou();
                             break;

                        }else{
                            perdeu();
                            break;
                        }
                    }

                }
         }
        perdeu();
    }
}




