package Command.Core.Commandor;

import Command.Core.Receiver.Mechanism;

/**
 * класс для сохранения текстового файла
 */
public class SaveText implements DefaultCommand {

    @Override
    public void save(Mechanism meh) {
        meh.save();
    }
}
