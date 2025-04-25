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
        ArrayList<String> exclaims = new ArrayList<>();
        for (int i = 0; i < allReviews.length-1; i++){
            String c = allReviews[i].getComment();
            if (!(c.substring(c.length()-1).equals(".")) && !(c.substring(c.length()-1).equals("!"))) c += ".";
            if (c.indexOf("!") > 0) exclaims.add(i + "-" + c);
        }
        return exclaims;
    }
}
