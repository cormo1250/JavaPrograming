public class Car {
    //zmienne opisujace elementy obiektu klasy (pola)

    private String kolor;
    private String marka;
    private int Silnik;
    private int rokProdukcji;

    //Funkcje (metody), ktore sluza "do oblugi" klasy
    // kazda klasa posiada 3 zestawy metod
    // 1- getter: pobieranie wartosci danej zmiennej (pola)
    // 2- setter: umozliwa ustawienie wartosci dla danej zmiennej (pola)
    // 3- inne: pozostale metody w klasie

    public String getKolor() {
        return kolor;
    }
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}