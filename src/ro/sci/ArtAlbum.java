package ro.sci;

public class ArtAlbum extends Book {

    private String caliateHartie;

    public String getCalitateHartie() {
        return caliateHartie;
    }

    public void setCaliateHartie(String caliateHartie) {
        this.caliateHartie = caliateHartie;
    }

    @Override
    public String toString() {
        return "ArtAlbum{" +
                "caliateHartie='" + caliateHartie + '\'' +
                '}';
    }
}
