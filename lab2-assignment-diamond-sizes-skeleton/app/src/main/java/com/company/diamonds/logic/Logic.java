package com.company.diamonds.logic;

import android.support.annotation.StringDef;

import com.company.diamonds.ui.OutputInterface;

import org.apache.commons.lang3.StringUtils;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        String s = "+";
        String d1 = "--";
        String d = "====";
        String e = "/";
        String e1 = "\\";
        String r = "<";
        String r1 = ">";
        String q = "|";
        String v = " ";
        String x = StringUtils.repeat(d1,size);
        String v1 = StringUtils.repeat(v,size-1);
        mOut.println(s+x+s);
        /*for(int i=0;i<size;i++){
            String x1 = StringUtils.repeat(d1,size);
            mOut.println(s+x1+s);
            if(size==1){
                mOut.println(q+r+r1+q);
            } else{

            }
        }*/
        if(size == 1){
            mOut.println(q+r+r1+q);
            mOut.println(s+x+s);
        } else if (size==2) {
            mOut.println(q+v+e+e1+v+q);
            mOut.println(q+r+d1+r1+q);
            mOut.println(q+v+e1+e+v+q);
            mOut.println(s+x+s);
        }
        switch (size){
            case 3:
                mOut.println(q+v1+e+e1+v1+q);
                mOut.println(q+v+e+d1+e1+v+q);
                mOut.println(q+r+d+r1+q);
                mOut.println(q+v+e1+d1+e+v+q);
                mOut.println(q+v+v+e1+e+v+v+q);
                mOut.println(s+x+s);

                break;
            case 4:
                mOut.println(q+v+v+v+e+e1+v+v+v+q);
                mOut.println(q+v+v+e+d1+e1+v+v+q);
                mOut.println(q+v+e+d+e1+v+q);
                mOut.println(q+r+d1+d1+d1+r1+q);
                mOut.println(q+v+e1+d+e+v+q);
                mOut.println(q+v+v+e1+d1+e+v+v+q);
                mOut.println(q+v+v+v+e1+e+v+v+v+q);
                mOut.println(s+x+s);
                break;
            case 5:
                mOut.println(q+v+v+v+v+e+e1+v+v+v+v+q);
                mOut.println(q+v+v+v+e+d1+e1+v+v+v+q);
                mOut.println(q+v+v+e+d+e1+v+v+q);
                mOut.println(q+v+e+d1+d1+d1+e1+v+q);
                mOut.println(q+r+d+d+r1+q);
                mOut.println(q+v+e1+d1+d1+d1+e+v+q);
                mOut.println(q+v+v+e1+d+e+v+v+q);
                mOut.println(q+v+v+v+e1+d1+e+v+v+v+q);
                mOut.println(q+v+v+v+v+e1+e+v+v+v+v+q);
                mOut.println(s+x+s);
                break;
            case 6:
                mOut.println(q+v+v+v+v+v+e+e1+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+e+d1+e1+v+v+v+v+q);
                mOut.println(q+v+v+v+e+d+e1+v+v+v+q);
                mOut.println(q+v+v+e+d1+d1+d1+e1+v+v+q);
                mOut.println(q+v+e+d+d+e1+v+q);
                mOut.println(q+r+d1+d1+d1+d1+d1+r1+q);
                mOut.println(q+v+e1+d+d+e+v+q);
                mOut.println(q+v+v+e1+d1+d1+d1+e+v+v+q);
                mOut.println(q+v+v+v+e1+d+e+v+v+v+q);
                mOut.println(q+v+v+v+v+e1+d1+e+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+e1+e+v+v+v+v+v+q);
                mOut.println(s+x+s);
                break;
            case 7:
                mOut.println(q+v+v+v+v+v+v+e+e1+v+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+e+d1+e1+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+e+d+e1+v+v+v+v+q);
                mOut.println(q+v+v+v+e+d1+d1+d1+e1+v+v+v+q);
                mOut.println(q+v+v+e+d+d+e1+v+v+q);
                mOut.println(q+v+e+d1+d1+d1+d1+d1+e1+v+q);
                mOut.println(q+r+d+d+d+r1+q);
                mOut.println(q+v+e1+d1+d1+d1+d1+d1+e+v+q);
                mOut.println(q+v+v+e1+d+d+e+v+v+q);
                mOut.println(q+v+v+v+e1+d1+d1+d1+e+v+v+v+q);
                mOut.println(q+v+v+v+v+e1+d+e+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+e1+d1+e+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+v+e1+e+v+v+v+v+v+v+q);
                mOut.println(s+x+s);
                break;
            case 8:
                mOut.println(q+v+v+v+v+v+v+v+e+e1+v+v+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+v+e+d1+e1+v+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+e+d+e1+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+e+d1+d1+d1+e1+v+v+v+v+q);
                mOut.println(q+v+v+v+e+d+d+e1+v+v+v+q);
                mOut.println(q+v+v+e+d1+d1+d1+d1+d1+e1+v+v+q);
                mOut.println(q+v+e+d+d+d+e1+v+q);
                mOut.println(q+r+d1+d1+d1+d1+d1+d1+d1+r1+q);
                mOut.println(q+v+e1+d+d+d+e+v+q);
                mOut.println(q+v+v+e1+d1+d1+d1+d1+d1+e+v+v+q);
                mOut.println(q+v+v+v+e1+d+d+e+v+v+v+q);
                mOut.println(q+v+v+v+v+e1+d1+d1+d1+e+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+e1+d+e+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+v+e1+d1+e+v+v+v+v+v+v+q);
                mOut.println(q+v+v+v+v+v+v+v+e1+e+v+v+v+v+v+v+v+q);
                mOut.println(s+x+s);
                break;
        }
    }

}
