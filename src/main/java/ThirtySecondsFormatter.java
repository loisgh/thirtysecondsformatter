/**
 * Created by loisgh on 5/26/16.
 */
public class ThirtySecondsFormatter {

    public static String format(double quote) {
        //(int)quote            -- returns the integer portion of the input
        //quote - (int)quote    -- returns the decimal portion
        //multiply the decimal portion of the quote by 32 to get the number of 32'nds in the quote
        //format the decimal portion so that leading zeros are included if the result is only one position
        return (int)quote + "-" + String.format("%02d",(int)(32 * (quote - (int)quote)));
    }
}
