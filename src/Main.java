public class Main {
    public static void main(String[] args) {
        String phrase = "Коту скоро сорок суток.";
        System.out.println(phrase);
        phrase = phrase.toLowerCase();
        phrase = phrase.replace(" ","");
        phrase = phrase.replace(".","");
        char[] lettersM1 = phrase.toCharArray();
        System.out.println(lettersM1);
        char[] lettersM2 = reverse(lettersM1);
        System.out.println(lettersM2);
        boolean palindrom = true;
        if (palindrom) {
            for (int i = 0; i < lettersM1.length; i++) {
                if(lettersM1[i] != lettersM2[i]) {
                    palindrom = false;}
            }
        }
        if (palindrom) {
            System.out.println("Эта фраза - палиндром.");
        }else {
            System.out.println("Эта фраза - не палиндром.");
        }
    }
    static char[] reverse(char[] lettersM) {
        char [] newLM = new char[lettersM.length];
        for (int i = 0; i < lettersM.length; i++) {
            newLM[lettersM.length - 1 - i] = lettersM[i];
        }
        return newLM;
    }
}