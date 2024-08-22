import java.util.HashMap;
import java.util.Map;

public class ResistorColorCode {

    private static final Map<Character, String> colorMap = new HashMap<>();
    private static final String TOLERANCE_COLOR = "dourado";

    static {

        colorMap.put('0', "preto");
        colorMap.put('1', "marrom");
        colorMap.put('2', "vermelho");
        colorMap.put('3', "laranja");
        colorMap.put('4', "amarelo");
        colorMap.put('5', "verde");
        colorMap.put('6', "azul");
        colorMap.put('7', "violeta");
        colorMap.put('8', "cinza");
        colorMap.put('9', "branco");
    }

    public static String getResistorColors(String input) {
        String[] parts = input.split(" ");
        String value = parts[0];
        StringBuilder colors = new StringBuilder();

        if (value.contains("k")) {
            value = value.replace("k", "");
            colors.append(colorMap.get(value.charAt(0)));
            colors.append(" ");
            colors.append(value.length() > 1 ? colorMap.get(value.charAt(2)) : "preto");
            colors.append(" ");
            colors.append(colorMap.get('2'));
        } else if (value.contains("M")) {
            value = value.replace("M", "");
            colors.append(colorMap.get(value.charAt(0)));
            colors.append(" ");
            colors.append(value.length() > 1 ? colorMap.get(value.charAt(2)) : "preto");
            colors.append(" ");
            colors.append(colorMap.get('5'));
        } else {
            for (int i = 0; i < value.length(); i++) {
                colors.append(colorMap.get(value.charAt(i)));
                colors.append(" ");
            }
            colors.append("preto");
        }
        colors.append(" ").append(TOLERANCE_COLOR);

        return colors.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(getResistorColors("47 ohms"));
        System.out.println(getResistorColors("4.7k ohms"));
        System.out.println(getResistorColors("1M ohms"));
        System.out.println(getResistorColors("10 ohms"));
        System.out.println(getResistorColors("100 ohms"));
        System.out.println(getResistorColors("220 ohms"));
        System.out.println(getResistorColors("330 ohms"));
        System.out.println(getResistorColors("680 ohms"));
        System.out.println(getResistorColors("1k ohms"));
        System.out.println(getResistorColors("2M ohms"));
    }
}