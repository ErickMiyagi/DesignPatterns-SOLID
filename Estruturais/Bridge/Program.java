package Estruturais.Bridge;

import Estruturais.Bridge.controle.AdvancedRemote;
import Estruturais.Bridge.controle.Remote;
import Estruturais.Bridge.dispositivo.Device;
import Estruturais.Bridge.models.Radio;
import Estruturais.Bridge.models.TV;

public class Program {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote remote = new Remote(tv);
        remote.togglePower();
        remote.volumeUp();

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.mute();
    }
}
