public class ex08_10 {
    public static void main(String[] args) {
        Webtoon levelUp = new Webtoon("나 혼자만 레벨업", "판타지", "추공님");
        Webtoon sweetHome = new Webtoon("스위트홈", "스릴러", "칸비님");
        Webtoon itaewonClass = new Webtoon("이태원 클래스", "드라마", "광진님");

        Webtoon[] webtoons = {levelUp, sweetHome, itaewonClass};
        for (int i = 0; i < webtoons.length; i++) {
            System.out.println(webtoons[i].toString());
        }
        System.out.printf("웹툰 객체의 총 수 : %d", Webtoon.getCount());
    }
}

class Webtoon {
    private String title;
    private String genre;
    private String author;
    private static int count = 0;

    public Webtoon(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        Webtoon.count++;
    }

    public String toString() {
        return "title :" + title + ",\tgenre :" + genre + ",\tauthor :" + author;
    }

    public static int getCount() {
        return Webtoon.count;
    }
}