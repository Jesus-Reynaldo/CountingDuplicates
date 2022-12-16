
public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("aaabbmascclij"));
    }
    public static int duplicateCount(String text) {
        // Write your code here
        int count = 0;
        String textLower=text.toLowerCase();
        for (int i = 0; i < textLower.length(); i++) {
            char caracterA = textLower.charAt(i);
             for (int j = i+1; j < textLower.length(); j++) {
                 char caracterB = textLower.charAt(j);
                 if(caracterA==caracterB && caracterA!='_'){
                     textLower=textLower.replace(caracterB,'_');
                     count++;
                 }
             }
        }
        return count;
    }

}
