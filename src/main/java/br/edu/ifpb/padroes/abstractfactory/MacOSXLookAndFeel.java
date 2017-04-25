package br.edu.ifpb.padroes.abstractfactory;

/**
 * Created by diogomoreira on 25/07/16.
 */
public class MacOSXLookAndFeel extends MyLookAndFeel {

    public Button criarBotao() {
        return new MacOSXButton();
    }

    public Window criarJanela() {
        return new MacOSXWindow();
    }
}
