package gui;

/**
 * Интерефейс для окон, которые могут сохранять свое состояние
 */
public interface Save {
    /**
     * Возвращает префикс для ключей окна
     */
    String getPrefix();
}
