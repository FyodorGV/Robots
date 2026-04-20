package gui;

import java.util.Map;

public interface Save {
    /**
     * Сохраняет состояние окна в словарь
     */
    Map<String, String> saveState();

    /**
     * Восстанавливает состояние окна из словаря
     */
    void restoreState(Map<String, String> state);

    /**
     * Возвращает префикс для ключей окна
     */
    String getPrefix();
}
