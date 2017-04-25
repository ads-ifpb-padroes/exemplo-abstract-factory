package br.edu.ifpb.padroes.abstractfactory;

/**
 * Created by diogomoreira on 25/07/16.
 */
public class Loader {

    public static void main(String[] args) {
        Application app = new Application(new MacOSXLookAndFeel());
    }

}
