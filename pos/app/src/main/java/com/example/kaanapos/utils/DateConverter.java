package com.example.kaanapos.utils;

import androidx.room.TypeConverter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConverter {
//    static DateFormat df = new SimpleDateFormat(Constants.TIME_STAMP_FORMAT);

    @TypeConverter
    public static Date toDate(String dateLong){
//        Date myDate = null;
//        DateFormat format = new SimpleDateFormat("MMM dd, yyyy  hh:mm aa");
//        try {
//            myDate = format.parse(dateLong);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }

        return new Date(dateLong);
    }

    @TypeConverter
    public static String fromDate(Date date){
        String finalDate="";
        try{
            SimpleDateFormat timeFormat = new SimpleDateFormat("MMM dd , yyyy  hh:mm aa", Locale.getDefault());
            finalDate = timeFormat.format(date);

        }catch (Exception e){}
        return String.valueOf(finalDate);
    }

//    static DateFormat df = new SimpleDateFormat(Constants.TIME_STAMP_FORMAT);
//
//    @TypeConverter
//    public static Date fromTimestamp(String value) {
//        if (value != null) {
//            try {
//                return df.parse(value);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            return null;
//        } else {
//            return null;
//        }
//    }
}
