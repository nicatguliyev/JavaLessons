package Lessons;

public class PentagonNumbers {
    public static void main(String[] args) {
        writePentagonNumbers();
    }

    public static void writePentagonNumbers(){
        int a = 1;
        int x = 4;
        System.out.print(a+" ");
        for(int i = 2; i<=50; i++){
            if(i>2)
                x+=3;
                a+=x;
            System.out.print(a+" ");
        }
    }
}
