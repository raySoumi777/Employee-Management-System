package adminLogin;

import javax.swing.JOptionPane;

class login  
{  
    //main() method start  
    public static void main(String arg[])  
    {  
        try  
        {  
            //create instance of the CreateLoginForm  
        	loginaGui form = new loginaGui();  
            form.setSize(300,100);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            //handle exception   
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
} 
