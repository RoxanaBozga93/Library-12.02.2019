package ro.sci;

import com.sun.javafx.scene.control.skin.VirtualFlow;

//import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Library {

    private List<Book> listOfBooks;
    private List<Book> listOfNovels;
    private List<Book> listOfArtAlbums;

    public Library(){
        listOfBooks=new VirtualFlow.ArrayLinkedList<>();
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBook (Book carte) {
        listOfBooks.add(carte);
    }

    public void removeAllBooksWithName (String numeCarte) {
        Iterator<Book> it = listOfBooks.iterator();
        Book book;
        while(it.hasNext()) {
            book = it.next();
            if (book.getNume().equals(numeCarte)){
                it.remove();
            }
        }
    }

    public void remove(Book book){
        listOfBooks.remove(book);
    }

    public void removeAllBooksWithType (String type) {
        Iterator<Book> it = listOfBooks.iterator();
        Book book;
        while(it.hasNext()) {
            book = it.next();
            if (book instanceof Novel)
            {
                if (((Novel) book).getType().equals(type)) {
                    it.remove();
                }
            }

        }
    }

    public void removeAllBooksWithPaperQuality (String paperQuality) {
        Iterator<Book> it = listOfBooks.iterator();
        Book book;
        while(it.hasNext()) {
            book = it.next();
            if (book instanceof ArtAlbum)
            {
                if (((ArtAlbum) book).getCalitateHartie().equals(paperQuality)) {
                    it.remove();
                }
            }

        }
    }

    public void createListOfNovels (List<Book> listOfBooks) {
        for (int i=0; i<listOfBooks.size(); i++){
            if ( listOfBooks.get(i) instanceof Novel)
            {
                listOfNovels.add(listOfBooks.get(i));
            }

        }
    }

    public void createListOfArtAlbums (List<Book> listOfBooks) {
        for (int i=0; i<listOfBooks.size(); i++){
            if ( listOfBooks.get(i) instanceof ArtAlbum)
            {
                listOfArtAlbums.add(listOfBooks.get(i));
            }

        }
    }


}
