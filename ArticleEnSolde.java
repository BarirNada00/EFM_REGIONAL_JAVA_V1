public class ArticleEnSolde extends Article {
    private double remise;

    public ArticleEnSolde(int code, double prixOrigine, double remise) {
        super(code, prixOrigine);
        if (remise < 0 || remise > 90) {
            throw new IllegalArgumentException("La remise doit être comprise entre 0 et 90.");
        }
        this.remise = remise;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        if (remise < 0 || remise > 90) {
            throw new IllegalArgumentException("La remise doit être comprise entre 0 et 90.");
        }
        this.remise = remise;
    }

    public double prixArticle() {
        return getPrixOrigine() * (1 - remise / 100);
    }

    public String toString() {
        return super.toString() + ";" + remise;
    }
}