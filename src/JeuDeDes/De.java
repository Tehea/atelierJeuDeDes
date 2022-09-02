package JeuDeDes;

/*QUESTION 1*/
 /*Instruction 1*/
public class De {

    private int num;
    private int nbFaces;
    private int valeur;
    private boolean estPipe = false;/*Instruction 8*/

 /*Instruction 2*/
    public int getNum() {
        return num;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int getValeur() {
        return valeur;
    }

    /*Instruction 3*/
    public De() {  // Constructeur 1 
        this(0,6); //"this()" appelle un constructeur
        //ici on appelle un constructeur à 2 paramètres car dans "this()" y'a 2 paramètres
    }

    public De(int nbFaces) {  // Constructeur 2
        this(0,nbFaces);//on appelle le Constructeur 1
    }
    
    /*Instruction 4*/
    public De(int num, int nbFaces) {
        this.num = num;
        this.nbFaces = nbFaces;
    }

    /*Instruction 5*/
    public int lancer() {
        
        this.valeur = (int) (Math.random() * nbFaces) + 1;
        
        if (estPipe) {  /*Instruction 8*/
            if (valeur == 3) {
                valeur = 2;
            } else if (valeur == 5) {
                valeur = 4;
            } else if (valeur == 6) {
                valeur = 1;
            }
                /* OU Solution Kenny */
            /*
            int[] valeursPipees = {1, 2, 4};
            this.valeur = valeursPipees[(int) (Math.round(2 * Math.random()))];
            estPiper = true;
            return valeur;
            */

                /* OU Solution Mr ERNY */
            /*
            this.valeur = (int)(Math.random()*3) + 1;
            if(valeur == 3) {
                this.valeur = 4;
            }
            */
        }
        return valeur;
    }

    /*Instruction 6*/
    @Override
    public String toString() {
        if (estPipe == true) {
            return "Dé n° " + num + " : " + valeur + "  " + "Ce dé est PIPER";
        } else {
            return "Dé n° " + num + " : " + valeur;
        }
    }

    /*Instruction 8*/
    public void piper() {
        estPipe = true;
    }

}
