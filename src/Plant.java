public class Plant {
    private String type="";//not needed just a test
    private int idnum=0;
    private static int seedsowned;
    private final int growth=300;
    private boolean harvestable[]= new boolean[10];
    private double price[]=new double[10];//insert 10 prices in the order of the names
    private String name[]=new String[10];//insert 10 names of plants being sold in order of prices
  
    public Plant(){
        idnum=0;
        type="";
    }
    
    public Plant(String ty, int i){
        idnum=i;
        type=ty;
    }
    
    public void removePlant(String planttype, int idnum){
        
    }
    
    public int growthperiod(){
        
    }
    public boolean readyToHarvest(String planttype, int idnum){
        
    }
    
    public void grow(){
        
    }
    
}
