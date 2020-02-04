import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;

    public ThemePark(String name){
        this.name = name;
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.reviews = new ArrayList<IReviewed>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return reviews;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addAttractionToList(attraction);
    }

    public HashMap returnReviews() {
        HashMap allReviews = new HashMap();
        for (IReviewed iReviewed : reviews){
            allReviews.put(iReviewed.getName(), iReviewed.getRating());
        }
        return allReviews;
    }

//    public ArrayList getAllAllowedFor(Visitor visitor){
//        ArrayList allowed = new ArrayList<IReviewed>();
//        ArrayList security = new ArrayList<ISecurity>();
//        for (Attraction attraction: attractions){
//        if (attraction.)
//    }
}
