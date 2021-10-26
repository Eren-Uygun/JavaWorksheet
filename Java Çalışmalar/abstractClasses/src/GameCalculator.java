public abstract class GameCalculator {
    //Abstractların yapısal anlamda classlardan farkı yoktur.
    //Abstractlar newlenemez , newlenebilmesi için operasyonlarının override edilmesi gerekir.(Yanlış bir yazım stili)
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
