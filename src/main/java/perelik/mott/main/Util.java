package perelik.mott.main;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dondamyani on 27.10.16.
 */
public class Util {

    public static <E> Collection<E> makeCollection(Iterable<E> iter) {
        Collection<E> list = new ArrayList<E>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }
}
