import java.util.Scanner;
    class Example2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        String reversed = reverse(name);
        System.out.println("Reversed name: " + reversed);
    }
    public static String reverse(String str) {
        if (str.isEmpty()) {  
            return str;
        } 
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
    