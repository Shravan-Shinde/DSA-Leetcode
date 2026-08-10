class Solution {
    public int compress(char[] chars) {

        int n=chars.length;
        int temp=0;
        int i=0;

        while (i<n) {
            char ch=chars[i];
            int count=0;
            while (i<n && chars[i]==ch) {
                i++;
                count++;
            }

            chars[temp]=ch;
            temp++;

            if (count>1) {
                String num=String.valueOf(count);
                for (int j=0; j<num.length(); j++) {
                    chars[temp]=num.charAt(j);
                    temp++;
                }
           
              }
        }
        return temp;
    }
}