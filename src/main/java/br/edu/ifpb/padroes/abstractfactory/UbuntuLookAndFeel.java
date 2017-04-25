package br.edu.ifpb.padroes.abstractfactory;

/**
 * Created by diogomoreira on 25/07/16.
 */
public class UbuntuLookAndFeel extends MyLookAndFeel {

    public Button criarBotao() {
        return new UbuntuButton();
    }

    public Window criarJanela() {
        return new UbuntuWindow();
    }
}
