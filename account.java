public class account {
    

   private String userName;
   private recipeBook recipebook;
    

    account(String userName,recipeBook recipebook){
        this.userName=userName;
        this.recipebook = recipebook;
    }

   public String getUserName(){
        return userName;
    }

    public void setUserName(String newUserName){
        userName= newUserName;
    }

    public Object getRecipeBook(){
        return recipebook;
    }




    


}
