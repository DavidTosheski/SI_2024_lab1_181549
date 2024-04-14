import java.util.ArrayList;
import java.util.List;

public static List<String> filterOddLengthStrings(List<String> list) {
    List<String> result = new ArrayList<>();
    for (String el : list) {
        if (el.length() % 2 != 0) { // smenet uslov
            result.add(el);
        }
    }
    return result;
}
