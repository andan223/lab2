//public class MVCPatternDemo {
//    public static void main(String[] args) {
//
//        //fetch student record based on his roll no from the database
//        Movie model  = retriveMovieFromDatabase();
//
//        //Create a view : to write course details on console
//        MovieView view = new MovieView();
//
//        MovieController controller = new MovieController(model, view);
//
//        controller.updateView();
//
//        //update model data
//        controller.setCourseName("Python");
//        System.out.println("nAfter updating, Course Details are as follows");
//
//        controller.updateView();
//    }
//
//    private static Movie retriveCourseFromDatabase(){
//        Movie course = new Movie();
//        course.setName("Java");
//        course.setId("01");
//        course.setCategory("Programming");
//        return course;
//    }
//}
