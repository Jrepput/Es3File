import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
    String nm, nmf, pr, usr;
    int pri, usri, prf, usrf, n;
		File f = new File("test.txt");
    PrintWriter fw = new PrintWriter(f);
    File v = new File("eskere.txt");
    PrintWriter vw = new PrintWriter(v);
	  Scanner sfile = new Scanner(f);//Scanner collegato al file
    Scanner svile = new Scanner(v);
    int pro = 99;
    while (pro!=0){
      System.out.println("Scegli il programma:");
      System.out.println("1) Inserimento nuovo prodotto");
      System.out.println("2) Stampa prodotti usura maggiore di N ");
      System.out.println("3) Creare nuovo file con prodotti %>70.");
      System.out.println("0) Esci");
      pro=s.nextInt();
      if (pro==1){
        System.out.print("Inserire Nome: ");
				nm = s.nextLine();
        System.out.print("Inserisci Prezzo:");
        pr = s.nextLine();
        System.out.print("Inserisci usura: ");
        usr = s.nextLine();
        fw.write(nm+", "+pr+", "+ usr);
      }
      else if(pro==2){
        System.out.print("Inserisci percentuale: ");
        n = s.nextInt();
        while (sfile.hasNextLine()) { // Lettura del file
          var str = sfile.nextLine();
          var res = str.split(", ");
          nm = res[0];
          pr = res[1];
          usr = res[2];
          usri = Integer.parseInt(usr);
          if(usri>=n){
            System.out.print("Prodotto: "+ nm + " Prezzo: "+ pr + " Usura: "+ usr);
          }
        }
      }
      else if(pro==3){
        while (sfile.hasNextLine()) { // Lettura del file
          var str = sfile.nextLine();
          var res = str.split(", ");
          nm = res[0];
          pr = res[1];
          usr = res[2];
          usri = Integer.parseInt(usr);
          if(usri>=70){
            vw.write(nm+", "+pr+", "+ usr);
          }
        }
      }
	}
}
}   