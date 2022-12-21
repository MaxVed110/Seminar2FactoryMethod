package Command.Core.Commandor;

import Command.Core.Receiver.Mechanism;

/**
 * сохранение для реализации кнопками с различным назначением
 */
public interface DefaultCommand {
    /**
     * запуск кнопки "сохранить"
     * @param meh
     */
    void save(Mechanism meh);
}
