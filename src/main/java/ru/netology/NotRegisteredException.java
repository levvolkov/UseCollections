package ru.netology;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playName) {
        super("Игрок с именем" + playName + "не найден");
    }
}
