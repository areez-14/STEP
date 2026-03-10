public class OOPSBannerAppUC07{
    static class CharacterPatternMap{
        Character character;
        String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern){
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps(){
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
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
        String[] S ={
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
        charMaps[0] = new CharacterPatternMap('O', O);
        charMaps[1] = new CharacterPatternMap('P', P);
        charMaps[2] = new CharacterPatternMap('S', S);
        return charMaps;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps){
        for (CharacterPatternMap map : charMaps){
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps){
        int height = 10;
        for (int i = 0; i < height; i++){
            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
