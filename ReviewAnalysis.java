import java.util.ArrayList;
public class ReviewAnalysis
{
    private Review[] allReviews;

    public ReviewAnalysis(Review[] reviews){
        allReviews = reviews;
    }

    public double getAverageRating(){
        double sum = 0;
        for (Review r: allReviews) sum += r.getRating();
        return sum / allReviews.length;
    }

    ArrayList<String> comments = new ArrayList<String>();
    public ArrayList<String> collectComments(){
        String[] comments = {};
        for ()
        String[] exclaims = {};
        boolean containsExclaim = false;
        for (String c:)
    }
}
