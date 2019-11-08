package com.example.kaanapos.repository.typeconverters;

import java.io.Serializable;

public class MenuItemTaxConverter implements Serializable {

//    @TypeConverter // note this annotation
//    public String fromOptionValuesList(List<Tax> optionValues) {
//        if (optionValues == null) {
//            return (null);
//        }
//        Gson gson = new Gson();
//        Type type = new TypeToken<List<Tax>>() {
//        }.getType();
//        String json = gson.toJson(optionValues, type);
//        return json;
//    }
//
//    @TypeConverter // note this annotation
//    public List<Tax> toOptionValuesList(String optionValuesString) {
//        if (optionValuesString == null) {
//            return (null);
//        }
//        Gson gson = new Gson();
//        Type type = new TypeToken<List<Tax>>() {
//        }.getType();
//        List<Tax> productCategoriesList = gson.fromJson(optionValuesString, type);
//        return productCategoriesList;
//    }
}
