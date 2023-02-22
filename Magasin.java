import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private List<Article> articles;

    public Magasin() {
        articles = new ArrayList<>();
    }

    public int indiceDe(int code) {
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void ajouter(Article a) {
        if (articles.contains(a)) {
            throw new IllegalArgumentException("L'article est déjà présent dans le magasin.");
        }
        articles.add(a);
    }

    public boolean supprimer(int code) {
        int index = indiceDe(code);
        if (index != -1) {
            articles.remove(index);
            return true;
        }
        return false;
    }

    public boolean supprimer(Article a) {
        return articles.remove(a);
    }

    public int nombreArticlesEnSolde() {
        int count = 0;
        for (Article a : articles) {
            if (a instanceof ArticleEnSolde) {
                count++;
            }
        }
        return count;
    }

    public void enregistrer(String chemin) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(chemin))) {
            for (Article a : articles) {
                writer.println(a.toString());
            }
        }
    }
}