package ro.sci;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Book carte1 = new Book();
        carte1.setNume("carte1");
        carte1.setNrPagini(10);

        Book carte2 = new Book();
        carte2.setNume("carte2");
        carte2.setNrPagini(100);

        Novel nuv1 = new Novel();
        nuv1.setNume("nuv1");
        nuv1.setNrPagini(100);
        nuv1.setType("nuvela");

        Novel nuv2 = new Novel();
        nuv2.setNume("nuv2");
        nuv2.setNrPagini(85);
        nuv2.setType("nuvela");

        ArtAlbum art1 = new ArtAlbum();
        art1.setNume("art1");
        art1.setNrPagini(25);
        art1.setCaliateHartie("cool");

        ArtAlbum art2 = new ArtAlbum();
        art2.setNume("art2");
        art2.setNrPagini(40);
        art2.setCaliateHartie("fine");

        Book nuvela = new Novel();
        nuvela.setNume("nuvela");
        nuvela.setNrPagini(50);
        ((Novel) nuvela).setType("history");

        Book albumArta = new ArtAlbum();
        albumArta.setNume("albumArta");
        albumArta.setNrPagini(38);
        ((ArtAlbum) albumArta).setCaliateHartie("good");


        Library librarie = new Library();

        librarie.addBook(carte1);
        librarie.addBook(carte2);
        librarie.addBook(nuv1);
        librarie.addBook(nuv2);
        librarie.addBook(art1);
        librarie.addBook(art2);
        librarie.addBook(nuvela);
        librarie.addBook(albumArta);

        /*
        TODO de lucrat cu cele 2 metode de tip remove plus de scris alte 2 metode
        1. stergeti o carte dupa nume
        2. stergeti toate cartile de acelasi tip
        3. stergeti toate cartile cu aceiasi calitate a hartiei
        4. metoda specifica 2
        5. stergeti toate cartile cu acelasi nume
        metodele se implementeaza in Library si se apeleaza in Main1
        */

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer:");
        int myInt = keyboard.nextInt();
        String myString = keyboard.nextLine();

        System.out.println("Am citit: "+ myInt);
        System.out.println("Am citit: " +myString);
    }
}
