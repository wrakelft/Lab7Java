package Generators;

import Collections.Vehicle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * Класс генерирует ID для объекта Vehicle
 *
 * @author wrakelft
 * @see Vehicle
 * @since 1.0
 */
public class IdGenerator {

    private static final Integer min = 100;
    private static final Integer max = 1000;
    private static LinkedList<Long> idList = new LinkedList<>();

    /**
     * Базовый конструктор
     *
     * @author wrakelft
     * @since 1.0
     */
    public IdGenerator() {
        idList = new LinkedList<>();
    }

    /**
     * Метод генерирует новый уникальный ID
     *
     * @author wrakelft
     * @since 1.0
     */
    public static long generateId() {
        long id;
        do {
            id = ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE);
        } while (idList.contains(id));
        idList.add(id);
        return id;
    }

    /**
     * Метод проверяет ID на уникальность
     *
     * @param id какой id нужно проверить на уникальность
     * @author wrakelft
     * @since 1.0
     */
    @Deprecated
    public static boolean idUnique(long id) {
        if(idList.contains(id)) {
            return false;
        }
        return true;
    }

    /**
     * Добавляет ID в список
     *
     * @param id какой id нужно добавить
     * @author wrakelft
     * @since 1.0
     */
    @Deprecated
    public static void addId(long id) {
        idList.add(id);
    }

}

