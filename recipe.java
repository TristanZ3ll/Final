import java.util.ArrayList;

public class recipe {
    
    private String name;
   private int cookTime;
   private String instuctions;
    private int rating;
    private String catagory;


    ArrayList<String> ingredients = new ArrayList<String>();


    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getCookTime(){
        return cookTime;
    }

    public void setCookTime(int newCookTime){
        cookTime = newCookTime;
    }



    public String getInstruct(){
        return instuctions;
    }


    public void setInstuct(String newInstructions){
        instuctions = newInstructions;
}

    public int getRating(){
        return rating;
    }

    public void setRating(int newRating){
        rating = newRating;
    }

    public String getCat(){
        return catagory;
    }

    public void setCat(String newCat){
        catagory =newCat;
    }


}


