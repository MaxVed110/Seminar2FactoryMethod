package Command.Core;

import Command.Core.Commandor.SaveSetting;
import Command.Core.Commandor.SaveText;
import Command.Core.Receiver.ReceiverStg;
import Command.Core.Receiver.ReceiverTxt;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Core {
    public static void main(String[] args) {

        SaveSetting set = new SaveSetting();
        SaveText txt = new SaveText();
        ReceiverStg setting = new ReceiverStg();
        ReceiverTxt text = new ReceiverTxt();
        Random random = ThreadLocalRandom.current();

        for (int i = 0; i < 10; i++) {
            int index = Math.abs(random.nextInt() % 2 == 0 ? 0 : 1);
            if (index == 0){
                set.save(setting);
            }
            else {
                txt.save(text);
            }
        }
    }
}
