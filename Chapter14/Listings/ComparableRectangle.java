package Chapter14.Listings;

import com.sun.corba.se.spi.ior.iiop.MaxStreamFormatVersionComponent;

/**
 *
 * @author Shady Bajary
 * @Listing 14.7
 */
public class ComparableRectangle extends Rectangle implements Comparable {
    /** Construct a ComparableRectangle with specified properties */
    public ComparableRectangle(double width, double height){
        super(width, height);
    }
    
    /** Implement the compareTo method defined in Comparable */
    @Override
    public int compareTo(Object o){
        if(getArea() > ((ComparableRectangle)o).getArea())
            return 1;
        if(getArea() < ((ComparableRectangle)o).getArea())
            return -1;
        else
            return 0;
    }
}
