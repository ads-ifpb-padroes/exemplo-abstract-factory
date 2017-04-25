package br.edu.ifpb.padroes.abstractfactory;

/**
 * Created by diogomoreira on 25/07/16.
 */
public class Application {

    private Window window;
    private Button button;

    private MyLookAndFeel lf;

    public Application(MyLookAndFeel lf) {
        this.lf = lf;
        button = lf.criarBotao();
        window = lf.criarJanela();
    }
}
