public class teste {
    public static void main(String[] args) {
        String str = "The Betles";
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == ' '){
                System.out.println(i);
                System.out.println("TEM ESEPAÇO");
            }

        }
    }
}
