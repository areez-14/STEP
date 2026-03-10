import java.util.HashMap;

public class OOPSBannerAppUC08 {
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();
        String[] O = {
        "      ******      ",
        "    **      **    ",
        "  **          **  ",
        "  **          **  ",
        "  **          **  ",
        "  **          **  ",
        "  **          **  ",
        "    **      **    ",
        "      ******      "
        };
        String[] P = {
        "  ********      ",
        "  **      **    ", 
        "  **        **  ", 
        "  **      **    ", 
        "  ** ******     ", 
        "  **            ", 
        "  **            ",
        "  **            ",
        "  **            "
        };
        String[] S = {
        "     ******      ",
        "   **            ",
        "  **             ",
        "    **           ",
        "      ****       ",
        "           **    ",
        "            **   ",
        "          **     ",
        "    ******       " 
        };
        String[] space = {
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };
        charMap.put('O', O);
        charMap.put('P', P);
        charMap.put('S', S);
        charMap.put(' ', space);

        return charMap;
    }
    public static void displayBanner(String message, HashMap<Character, String[]> charMap){
        int patternHeight = charMap.get('O').length;
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));

                sb.append(pattern[line]).append("   ");
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
