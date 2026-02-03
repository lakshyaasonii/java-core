package Exception_Handling;

public class User{
    private String USER;

    public void setUSER(String username){
        try{
            if(username == null){
                throw new UsernameNotValidException("User name should not be NULL!!");
            }
            else{
                USER = username;
                System.out.println("Username is : " + USER);
            }
        }catch(UsernameNotValidException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Work has been done 👍");
        }
    }


}
