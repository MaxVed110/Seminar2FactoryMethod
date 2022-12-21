package Command.Core.Commandor;

import Command.Core.Receiver.Mechanism;

/**
 * класс для сохранения параметров настроек
 */
public class SaveSetting implements DefaultCommand {

    @Override
    public void save(Mechanism meh) {
        meh.save();
    }
}
