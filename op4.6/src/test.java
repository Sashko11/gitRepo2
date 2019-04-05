import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int mass[]= new int[size];
        for(int i=0; i<size; i++){
            mass[i]=scanner.nextInt();
            if(mass[i]%2==0) {
                System.out.print(mass[i]+" ");
            }
        }
    }
}
