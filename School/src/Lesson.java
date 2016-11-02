import java.io.Serializable;

/**
 * Created by Babajko on 29.10.2016.
 */
public class Lesson implements Serializable {
    private Lessons lesson;
    private int rating;

    Lesson(Lessons lesson) {
        this.lesson = lesson;
    }

    Lessons getLesson() {
        return lesson;
    }

    int getRating() {
        return rating;
    }

    public void setLesson(Lessons lesson) {
        this.lesson = lesson;
    }

    void setRating(int rating) {
        this.rating = rating;
    }

    static Lessons strToLesson(String str){
        Lessons lessons;
        switch (str.toUpperCase().trim()){
            case "HISTORY": lessons = Lessons.HISTORY; break;
            case "MATH": lessons = Lessons.MATH; break;
            case "PHYSICS": lessons = Lessons.PHYSICS; break;
            case "BIOLOGY": lessons = Lessons.BIOLOGY; break;
            case "CHEMISTRY": lessons = Lessons.CHEMISTRY; break;
            default: lessons = null;
        }
        return lessons;
    }

}
