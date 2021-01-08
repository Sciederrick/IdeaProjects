package com.send_message;

public class SyncDemo {
    public static void main(String args[]){
        Sender snd = new Sender();
        ThreadedSend S1 = new ThreadedSend(" Hi ", snd);
        ThreadedSend S2 = new ThreadedSend(" Bye ", snd);

        //  Start two threads of ThreadedSend
        S1.start();
        S2.start();

        //  wait for threads to end
        try{
            S1.join();
            S2.join();
        }catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}
