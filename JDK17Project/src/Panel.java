//import java.awt.*;
//import java.util.Scanner;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.util.ArrayList;
//import javax.swing.JPanel;
//import javax.swing.JFrame;
//import javax.swing.Timer;
///*
//class Vehicle {
//    int passengers;
//    int fuelcap;
//    int mpg;
//    Vehicle (int p, int f, int m) {
//        passengers = p;
//        fuelcap = f;
//        mpg = m;
//    }
//    int range() {
//        return mpg*fuelcap;
//    }
//    double fuelNeeded (int miles) {
//        return (double) miles/mpg;
//    }
//}
//
//class CompFuel {
//    public static void main(String[] args) {
//        Vehicle minivan = new Vehicle(1,23,34);
//        Vehicle sportscar = new Vehicle(2,56,23);
//        double gallons;
//        int dist = 252;
//
//        gallons = minivan.fuelNeeded(dist);
//        System.out.println("To go " + dist + " miles minivan needs " +
//                gallons + " gallons of fuel.");
//
//        gallons = sportscar.fuelNeeded(dist);
//        System.out.println("To go " + dist + " miles sportscar needs " +
//                gallons + " gallons of fuel.");
//
//    }
//}
//class Queue {
//    char[] q;
//    int putloc, getloc;
//
//    Queue(int size){
//        q = new char[size];
//        putloc = getloc = 0;
//    }
//
//    void put(char ch){
//        if(putloc==q.length){
//            System.out.println(" - Queue is full.");
//            return;
//        }
//        q[putloc++] = ch;
//    }
//    char get(){
//        if(getloc==putloc){
//            System.out.println(" - Queue is empty");
//            return (char) 0;
//        }
//        return q[getloc++];
//    }
//}
//*/
///*
//class Project {
//    public static void main(String[] args) {
//        Queue bigQ = new Queue(100);
//        Queue smallQ = new Queue(4);
//        char ch;
//
//
//        System.out.println("Storing the alphabet");
//        for (int i=0; i<26; i++)
//            bigQ.put((char) ('A' + i));
//
//
//        System.out.println("Contents: ");
//        for (int i=0; i<26; i++){
//            ch = bigQ.get();
//            if (ch != (char) 0)
//                System.out.print(ch);
//            System.out.print(" ");
//        }
//        System.out.println("\n");
//
//
//        for (int i=0; i<5; i++){
//            System.out.println("Attempting to store " +
//                                (char) ('Z'- i));
//            smallQ.put((char) ('Z' - i));
//        }
//        System.out.println();
//
//
//        System.out.println("Contents of smallQ");
//        for (int i=0; i<5; i++){
//            ch = smallQ.get();
//            if (ch != (char) 0)
//                System.out.print(ch);
//        }
//    }
//}
//
//class Project {
//    public static void main(String[] args) {
//
//        BigInteger max = new BigInteger("0");
//        BigInteger temp = new BigInteger("0");
////        int[] tab = new int[1000];
//
//        String bruh = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
//
//
//        for(int i=12; i<1000; i++){
//
//            temp = BigInteger.valueOf((long) bruh.charAt(i) * bruh.charAt(i-1) * bruh.charAt(i-2) * bruh.charAt(i-3)
//                    * bruh.charAt(i-4) * bruh.charAt(i-5) * bruh.charAt(i-6) * bruh.charAt(i-7)
//                    * bruh.charAt(i-8) * bruh.charAt(i-7) * bruh.charAt(i-12) * bruh.charAt(i-11)
//                    * bruh.charAt(i-12));
//            System.out.println(i + ": temp: " + temp);
//            if(temp.compareTo(max) > 0){
//                max = temp;
//            }
//            temp = BigInteger.valueOf(0);
//        }
//
//        System.out.println(max);
//
//    }
//}
//
//
//*/
///*
//class Project {
//    public static void main(String[] args) {
//        long res=0;
//        int[][] tab = {
//                {8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8},
//                {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0},
//                {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65},
//                {52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91},
//                {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
//                {24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
//                {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
//                {67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
//                {24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
//                {21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95},
//                {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92},
//                {16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
//                {86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
//                {19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
//                {4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
//                {88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
//                {4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
//                {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
//                {20, 73, 35, 29, 78, 31, 90, 0, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
//                {1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48}
//                };
//
//        //horizontally
//        int temp=0, maxh=0;
//        for (int i=0; i<20; i++) {
//            for (int j=0; j<20-3; j++) {
//                temp = tab[i][j] * tab[i][j+1] * tab[i][j+2] * tab[i][j+3];
//                if (temp>maxh)
//                    maxh = temp;
//            }
//        }
//        System.out.println("maxh:\t" + maxh);
//        //vertically
//        int maxv=0;
//        for (int i=0; i<20-3; i++) {
//            for (int j=0; j<20; j++) {
//                temp = tab[i][j] * tab[i+1][j] * tab[i+2][j] * tab[i+3][j];
//                if (temp>maxv)
//                    maxv = temp;
//            }
//        }
//        System.out.println("maxv:\t" + maxv);
//        //diagonally l-down
//        int maxd1=0;
//        for (int i=0; i<20-3; i++) {
//            for (int j=0; j<20-3; j++) {
//                temp = tab[i][j] * tab[i+1][j+1] * tab[i+2][j+2] * tab[i+3][j+3];
//                if (temp>maxd1)
//                    maxd1 = temp;
//            }
//        }
//        System.out.println("maxd1:\t" + maxd1);
//        //diagonally r-down
//        int maxd2=0;
//        for (int i=0; i<20-3; i++) {
//            for (int j=19; j>=3; j--) {
//                temp = tab[i][j] * tab[i+1][j-1] * tab[i+2][j-2] * tab[i+3][j-3];
//                if (temp>maxd2)
//                    maxd2 = temp;
//            }
//        }
//        System.out.println("maxd2:\t" + maxd2);
//
//
//        System.out.println(res);
//    }
//}
//class Project{
//    public static void main(String[] args) {
//       long n = 0, index = 0;
//       long howLong = 0;
//       long[][] tab = new long[2][1000000];
//
//       for(int i=2; i<1000000; i++){
//           n=i;
//           howLong = 0;
//           while(n!=1){
//               foe:
//                   if(n%2==0){
//                       while (n%2==0){
//                           n/=2;
//                           howLong++;
//                       }
//                   }
//                   else{
//                       while(n%2==1){
//                            n = 3*n + 1;
//                            howLong++;
//                            if (n%2==0)
//                                break foe;
//                       }
//                   }
//           }
//           //0,i - index; 1,i - length
//           tab[0][i] = i;
//           tab[1][i] = howLong;
//           n=0;
//       }
//
//
//       long max=0;
//       for (int i=0; i<1000000-1; i++){
//           if(tab[1][i]<tab[1][i+1]){
//               max = tab[1][i+1];
//               index = i;
//           }
//       }
//       System.out.println("max: " + max + ", index: " + index);
//    }
//}
//*/
////class Project{
////    public static void main(String[] args) {
////        long num=0, sum = 0, res=0;
////        boolean z =false;
////        int[] tab = new int[28123];
////        int enc=0;
////
////
////        for(int i=1; i<=28123; i++){
////            num=i;
////            while(num>=1){
////                for (int j=1; j<=28123; j++){
////                    if(num%i==0){
////                        sum += j;
////                        num/=j;
////                    }
////                }
////            }
////            if(sum==i){
////                System.out.println("proper");
////            } else if (sum>i) {
////                System.out.println("deficient");
////            }
////            else{
////                System.out.println("abundant");
////                //index of the abundant number
////                tab[enc++] = i;
////            }
////            sum=0;
////            num=0;
////        }
////        for(int k=0; k<=enc; k++){
////            for (int m=0; m<=enc; m++){
////                if(tab[k]+tab[m]<=28123)
////                {
////                    System.out.println("no");
////                }
////                else {
////
////                }
////            }
////        }
////
////
////        System.out.println("sum " + res);
////    }
////}
//
//
////    int add(int a, int b){
////        return a+b;
////    }
//
//
//
////    String divide(int a, int b){
////        try{
////            System.out.println("Insert integer");
////            Scanner sc = new Scanner(System.in);
////            sc.nextInt();
////
////            return Integer.toString(a/b);
////        } catch (ArithmeticException ae){
////            return "Do not divide by zero"+ae.getMessage();
////        } catch (InputMismatchException ime){
////            return ime.getMessage();
////        } catch (Exception e){
////            return e.getMessage();
////        }
////    }
//
//
//
//
////imie uzytkownika
////class Project{
////    public static void main(String[] args) {
////        System.out.println("Podaj imię użytkownika");
////        Scanner sc = new Scanner(System.in);
////        String name;
////        name = sc.next();
////        System.out.println("Cześć, " + name + ".");
////    }
////}
//
////class Project{
////    public static void main(String[] args) {
////        System.out.println("Podaj liczbe: ");
////        Scanner scan = new Scanner(System.in);
////        int num;
////        num = scan.nextInt();
////        if (num > 0){
////            System.out.println("Liczba nie ujemna.");
////        } else if (num == 0) {
////            System.out.println("Liczba = 0.");
////        }
////        else {
////            System.out.println("Liczba ujemna.");
////        }
////    }
////}
//
//
//public class Panel extends JPanel {
//    private ArrayList<Kula> listaKul;
//    private int size = 20;
//    private Timer timer;
//    private final int DELAY = 16;
//    //dla 30fps -> 1s/30 = 0,033s
//    public Panel() {
//        listaKul = new ArrayList<>();
//        setBackground(Color.BLACK);
//        addMouseListener(new Event());
//        timer = new Timer(DELAY, new Event());
//        timer.start();
//    }
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        for (Kula k : listaKul) {
//            g.setColor(k.color);
//            g.drawOval(k.x, k.y, k.size, k.size);
//        }
//        g.setColor(Color.YELLOW);
//        g.drawString(Integer.toString(listaKul.size()),40,40);
//    }
//
//    private class Event implements MouseListener,
//            ActionListener {
//        @Override
//        public void mouseClicked(MouseEvent e) {
//        }
//        @Override
//        public void mousePressed(MouseEvent e) {
//            listaKul.add(new Kula(e.getX(), e.getY(), size));
//            repaint();
//        }
//        @Override
//        public void mouseReleased(MouseEvent e) {
//        }
//        @Override
//        public void mouseEntered(MouseEvent e) {
//        }
//        @Override
//        public void mouseExited(MouseEvent e) {
//        }
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            for (Kula k : listaKul) {
//                k.update();
//            }
//            repaint();
//        }
//    }
//    private class Kula {
//        public int x, y, size, xspeed, yspeed;
//        public Color color;
//        private final int MAX_SPEED = 5;
//        public Kula(int x, int y, int size) {
//            this.x = x;
//            this.y = y;
//            this.size = size;
//            color = new Color((float) Math.random(), (float)
//                    Math.random(), (float) Math.random());
//            xspeed = (int) (Math.random() * MAX_SPEED * 2 -
//                    MAX_SPEED);
//            yspeed = (int) (Math.random() * MAX_SPEED * 2 -
//                    MAX_SPEED);
//        }
//        public void update() {
//            x += xspeed;
//            y += yspeed;
//            if (x <= 0 || x >= getWidth()) {
//                xspeed = -xspeed;
//            }
//            if (y <= 0 || y >= getHeight()) {
//                yspeed = -yspeed;
//            }
//        }
//    }
//}
//
//

// dont touch the /.../ please


