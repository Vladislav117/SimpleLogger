package ru.vladislav117.simplelogger;

/**
 * Простой абстрактный логгер с префиксом.
 */
public abstract class PrefixedSimpleLogger extends SimpleLogger {
    protected String prefix;
    protected String processedPrefix;
    protected String prefixSeparator = " ";

    /**
     * Создание простого абстрактного логгера с префиксом.
     *
     * @param prefix Префикс
     */
    public PrefixedSimpleLogger(String prefix) {
        this.prefix = prefix;
        processPrefix();
    }

    /**
     * Обработка префикса.
     */
    protected void processPrefix() {
        processedPrefix = "[" + prefix + "]";
    }

    /**
     * Получение префикса.
     *
     * @return Префикс.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Установка префикса.
     *
     * @param prefix Префикс
     * @return Этот же логгер.
     */
    public PrefixedSimpleLogger setPrefix(String prefix) {
        this.prefix = prefix;
        processPrefix();
        return this;
    }

    /**
     * Получение отделителя префикса.
     *
     * @return Отделитель префикса.
     */
    public String getPrefixSeparator() {
        return prefixSeparator;
    }

    /**
     * Установка отделителя префикса.
     *
     * @param prefixSeparator Отделитель префикса
     * @return Этот же логгер.
     */
    public PrefixedSimpleLogger setPrefixSeparator(String prefixSeparator) {
        this.prefixSeparator = prefixSeparator;
        return this;
    }

    /**
     * Получение обработанного префикса.
     *
     * @return Обработанный префикс.
     */
    public String getProcessedPrefix() {
        return processedPrefix;
    }

    @Override
    protected String processMessage(String message) {
        return processedPrefix + prefixSeparator + message;
    }
}
