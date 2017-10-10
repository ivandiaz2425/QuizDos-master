package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Models.CommentModelDiazIvan;
import com.jonmid.quizdos.Models.UserModelDiazIvan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IVANCHO on 10/10/2017.
 */

public class CommentJsoDiazIvan {

    public static List<CommentModelDiazIvan> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CommentModelDiazIvan> CommentModelDiazIvanList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);

            CommentModelDiazIvan commentmodeldiazivan = new CommentModelDiazIvan();
            commentmodeldiazivan.setName(item.getString("name"));
            commentmodeldiazivan.setEmail(item.getString("email"));
            commentmodeldiazivan.setBody(item.getString("body"));

            CommentModelDiazIvanList.add(commentmodeldiazivan);
        }
        return CommentModelDiazIvanList;
    }
}
