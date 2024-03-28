import java.util.Scanner;

public class BuscaArtistas {
    public static void main(String[] args) {
        
        String [] cantores = new String[10];

        cantores[0] = "Ariana Grande";
        cantores[1] = "Bruno Mars";
        cantores[2] = "Lady Gaga";
        cantores[3] = "The Weeknd";
        cantores[4] = "Adele";
        cantores[5] = "Justin Bieber";
        cantores[6] = "Byonce";
        cantores[7] = "Ed Sheeran";
        cantores[8] = "Taylor Swift";
        cantores[9] = "Post Malone";
        
        for(int i=0; i<cantores.length;i++){
            System.out.println("Cantor(a):"+cantores[i]);
        }

        System.out.println("Digite um cantor(a):");
        Scanner digite = new Scanner(System.in);
        String procure = digite.nextLine();
        System.out.println(procure);

        boolean achou = false;
        for(int i=0; i<cantores.length;i++){
            String elementos = cantores[i];
            if(elementos.equals(procure)){
                System.out.println("Achou");
                achou = true;
                break;
            //}else{
                //System.out.println("Não achou");
            }

        }
    }


}

