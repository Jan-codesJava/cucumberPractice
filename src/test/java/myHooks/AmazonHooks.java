package myHooks;

import io.cucumber.java.*;


public class AmazonHooks {

    @Before("@Smoke")
    public void setup_browser(Scenario sc) {
        System.out.println("launch chrome browser");
        System.out.println(sc.getName());
        int i = 9/0;
        //will give arithmetic exception
    }

      @Before(order = 2)
      public void setup_url(){
        System.out.println("launch url");
    }


     @After(order = 2)
       public void tearDown_close(Scenario sc){
         System.out.println("close the browser");
         System.out.println(sc.getName());
}

    @After("@Smoke")
    public void tearDown_logout() {
        System.out.println("logout from application");
    }

    // @BeforeStep
    //public void takescreenshot() {
    //    System.out.println("take the screenshot");
//}

//    @AfterStep
    //   public void refreshPage(){
    //   System.out.println("refresh the page");}
//}

}