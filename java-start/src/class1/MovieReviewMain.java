package class1;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview moviereview = new MovieReview();

        moviereview.review = "재밌다.";
        moviereview.title = "어바웃 타임";

        MovieReview abouttime = new MovieReview();

        abouttime.review = "인생 시간 영화";
        abouttime.title = "어바웃 타임";

        System.out.println("영화제목 " + moviereview.title + "영화 리뷰 " + moviereview.review);
    }
}
