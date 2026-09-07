package threadInJava;

public class Multithreading {
    public static class Hello extends Thread{
        public void run(){
            for(int i=1;i<=100;i++){
                System.out.println("Hello");
            }

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static class Hi extends Thread{
        public void run(){
            for(int i=1;i<=100;i++){
                System.out.println("Hii");
            }

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        Hello s1 = new Hello();
        Hi s2 = new Hi();

        s1.start();
        s2.start();
    }
}
