public class array_New0 {
        public static void main(String[] args) {
            int[] myArray = {1, 4, 7, 9};
            String[] Str = {"one" , "four" ,"seven" ,"nine"};
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == 1) {
                    System.out.println("Str[0]" + "=" + "One");
                } else if (myArray[i] == 4) {
                    System.out.println("Str[1]" + "=" + "Four");
                } else if (myArray[i] == 7) {
                    System.out.println("Str[2]" + "=" + "Seven");
                } else if(myArray[i]==9){
                    System.out.println("Str[3]" + "=" + "Nine");
                }else {
                    System.out.println("null");





                }
            }
        }
    }


