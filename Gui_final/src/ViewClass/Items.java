/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

/**
 *
 * @author Ruvini
 */
public class Items {
    private String foodId;
    private int noOfitems;
    
    public Items(){
        
    }
    public Items( String foodId,int noOfitems){
        this.foodId=foodId;
        this.noOfitems=noOfitems;
    }

    /**
     * @return the foodId
     */
    public String getFoodId() {
        return foodId;
    }

    /**
     * @param foodId the foodId to set
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    /**
     * @return the noOfitems
     */
    public int getNoOfitems() {
        return noOfitems;
    }

    /**
     * @param noOfitems the noOfitems to set
     */
    public void setNoOfitems(int noOfitems) {
        this.noOfitems = noOfitems;
    }
    
}
