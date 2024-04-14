import java.util.List;

private static String makeBigStringFrom(List<String> list, int minLength) {
    StringBuilder sb = new StringBuilder();
    for (String el : list) {
        if (el.length() >= minLength) { // smenet uslov
            sb.append(el);
        }
    }
    return sb.toString();
}
