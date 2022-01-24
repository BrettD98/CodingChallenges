public class Validate {
    public static void main(String[] args) {
        validate("121317");// ➞ true

        validate("1234");// ➞ true

        validate("45135");// ➞ false

        validate("89abc1");// ➞ false

        validate("900876");// ➞ true

        validate(" 4983");//➞ false
    }

    public static void validate(String pin){
        //check length
        if(pin.length() ==4 || pin.length() == 6){
            //check if numbers
            try{
                Integer.parseInt(pin);
                System.out.println(true);
            }catch(Exception e){
                System.out.println(false);
            }
        }else{
            System.out.println(false);
        }
    }

}
