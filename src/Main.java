public class Main {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        Movie model  = new Movie("film1", "12", "drama");

        //Create a view : to write course details on console
        MovieView view = new MovieView();

        MovieController controller = new MovieController(model, view);

        controller.updateView();


    }
}

