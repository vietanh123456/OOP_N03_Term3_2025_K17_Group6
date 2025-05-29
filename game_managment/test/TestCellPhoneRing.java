public class TestCellPhoneRing {
    
public static void test(){
    CellPhone noiseMaker = new CellPhone();
    ObnoxiousTune ot = new ObnoxiousTune();
    //Tune ot = new ObnoxiousTune();
    try {
        
    
    noiseMaker.ring(ot);
    }
    catch (Exception e){
        System.out.println(e);
    }


}
   

}
