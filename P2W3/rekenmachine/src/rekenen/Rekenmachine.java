package rekenen;

import rekenen.plugins.Plugin;

/**
 * PEER TUTORING
 * REKENMACHINE
 */
public class Rekenmachine {
    private final int MAX_AANTAL_PLUGINS = 10;
    private Plugin[] ingeladenPlugins;
    private int aantalPlugins;

    public Rekenmachine() {
        this.ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
        aantalPlugins = 0;
    }

    public void installeer(Plugin teInstallerenPlugin) {
        //Opgave 2.1.a
        if(aantalPlugins < ingeladenPlugins.length){
            for (int i = 0; i < aantalPlugins; i++){
                if(ingeladenPlugins[i].getCommand().equals(teInstallerenPlugin.getCommand()) ){
                    System.out.println("Plugin al geïnstalleerd");
                    return;
                }
            }
            ingeladenPlugins[aantalPlugins++] = teInstallerenPlugin;
        } else {
            System.out.println("Geen vrije ruimte meer");
        }
    }

    public double bereken(String command, double x, double y) {
        //Opgave 2.1.b
        for(int i = 0; i < aantalPlugins; i++){
            if(command.equals(ingeladenPlugins[i].getCommand())){
                return ingeladenPlugins[i].bereken(x,y);
            }
        }
        System.out.println("Plugin niet gevonden");
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public String toString() {
        //Opgave 2.1c
        StringBuilder plugins = new StringBuilder();
        plugins.append("Geïnstalleerde plugins: ");
        for (int i = 0; i < aantalPlugins; i++){
            plugins.append(ingeladenPlugins[i].getCommand()).append(" ");
        }
        return plugins.toString();
    }
}
