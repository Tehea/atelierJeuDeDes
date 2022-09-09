package JeuDeDes;


import JeuDeDes.De;


public class Test {

    
    public static void main(String[] args) {
        
        /*Instruction 7*/
        De de1 = new De(1,6);
        De de2 = new De(2,6);
        De de3 = new De(3,6);
        de1.lancer();
        de2.lancer();
        de3.lancer();
        //123456
        System.out.println(de1.toString());
        System.out.println(de2.toString());
        System.out.println(de3.toString());
        
        /*Instruction 8*/
        de1.piper();
        de2.piper();
        de3.piper();
        System.out.println(de1.toString());
        System.out.println(de2.toString());
        System.out.println(de3.toString());
        
    }
    
}
