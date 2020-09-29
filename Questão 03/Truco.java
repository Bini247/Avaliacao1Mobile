/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 
Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {

    public Jogador jogador1;
    public Jogador jogador2;
    public Baralho baralho;
    public Carta   cartaVirada;

    public Truco(){
        this.jogador1    = new Jogador();
        this.jogador2    = new Jogador();
        this.baralho     = new Baralho();
    }

    private void embaralhaCartas(){
        this.baralho.embaralhar();
    }

    private void distribuiMaos(){
        while(this.jogador1.indiceMao < 3){
            this.jogador1.recebeCarta(this.baralho.distribuir());
            System.out.println(jogador1.mao.get(this.jogador1.indiceMao - 1).toString());
        }

        while(this.jogador2.indiceMao < 3){
            this.jogador2.recebeCarta(this.baralho.distribuir());
            System.out.println(jogador2.mao.get(this.jogador2.indiceMao - 1).toString());
        }
    }

    private void inicializaManilha(){
        this.cartaVirada = this.baralho.distribuir();
        System.out.println(this.cartaVirada.toString());
    }

    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }    
}

