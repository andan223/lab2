public class MovieController {
    private Movie model;
    private MovieView view;

    public MovieController(Movie model, MovieView view){
        this.model = model;
        this.view = view;
    }

    public void setMovieName(String name){
        model.setName(name);
    }

    public String getMovieName(){
        return model.getName();
    }

    public void setMovieId(String id){
        model.setId(id);
    }

    public String getMovieId(){
        return model.getId();
    }

    public void setMovieCategory(String category){
        model.setCategory(category);
    }

    public String getMovieCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.printMovieDetails(model.getName(), model.getId(), model.getCategory());
    }
}
