public class TextTwist {
    public static void main(String[] args) {
        String word1 = "caster";
        String[] guesses1 = {"cat", "create", "sat"};
        System.out.println(totalPoints(guesses1, word1));

        String word2 = "recant";
        String[] guesses2 = {"trance", "recant"};
        System.out.println(totalPoints(guesses2, word2));

        String word3 = "tossed";
        String[] guesses3 = {"dote", "dotes", "toes", "set", "dot", "dots", "sted"};
        System.out.println(totalPoints(guesses3, word3));

    }

    public static int totalPoints(String[] guesses, String word){
        int points = 0;

        for(String guess : guesses){

            boolean contains =false;
            String tempWord = word;
            char[] guessArr = guess.toCharArray();

            for (char c : guessArr) {
                if(tempWord.contains(c + "")){
                    tempWord = tempWord.replace(c, '0');
                    contains = true;
                }else{
                    contains = false;
                    break;
                }
            }
            if(contains){
                points += guess.length() - 2;
                if(guess.length() == 6)
                    points += 50;
            }
        }
        return points;
    }
}
