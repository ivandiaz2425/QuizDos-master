package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Models.UserModelDiazIvan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IVANCHO on 10/10/2017.
 */

public class UserJsonDiazIvan {

    public static List<UserModelDiazIvan> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<UserModelDiazIvan> UserModelDiazIvanList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);

            JSONArray Address = item.getJSONArray("address");
            JSONObject AddressItem = Address.getJSONObject(0);

            JSONArray Company = item.getJSONArray("company");
            JSONObject CompanyItem = Company.getJSONObject(0);

            UserModelDiazIvan usermodeldiazivan = new UserModelDiazIvan();
            usermodeldiazivan.setName(item.getString("name"));
            usermodeldiazivan.setUsername(item.getString("username"));
            usermodeldiazivan.setEmail(item.getString("email"));
            usermodeldiazivan.setPhone(item.getString("phone"));
            usermodeldiazivan.setAddress(AddressItem.getString("street"));
            usermodeldiazivan.setCompany(CompanyItem.getString("name"));


            UserModelDiazIvanList.add(usermodeldiazivan);
        }
        return UserModelDiazIvanList;
    }
}
