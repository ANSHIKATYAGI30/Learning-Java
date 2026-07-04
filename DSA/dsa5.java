public class dsa5 {

    public static void main(String[] args){
        
        String st = "welcomeToScaler";
        removeVowels(st);

        System.out.println();
        reverseVowels(st);

        upperCaseToLowerCase(st);
    }

    public static void removeVowels(String st){

        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                continue;

            System.out.print(ch);
        }
    }

    public static boolean isVowel(char ch){
        return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
    }

    public static void reverseVowels(String st){

        char[] s = st.toCharArray();

        int i=0;
        int j=s.length-1;

        while(i<j){
            while(i<j && !isVowel(s[i]))
                i++;
            while(i<j && !isVowel(s[j]))
                j--;

            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;

            i++;
            j--;
        }

        System.out.println(new String(s));
    }

    
    public static void upperCaseToLowerCase(String st){
        String result = "";

        for (int i = 0; i < st.length(); i++) {

            char ch = st.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result += ch;
        }

        System.out.println(result);
    }
}
