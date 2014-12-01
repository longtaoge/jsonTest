package org.xiangbalao.jsontest;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import cn.com.ths.dbcenter.domain.popularfeelings.GetPopularFeelingsDate;
import cn.com.ths.dbcenter.domain.popularfeelings.NewsIndex;
import cn.com.ths.dbcenter.domain.popularfeelings.PopularFeeling;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener
{
    
    private Button get;
    
    private Button reset;
    
    private Button parse;
    
    private TextView content;
    
    PopularFeeling pf;
    
    String jsonString;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        intiUI();
    }
    
    private void intiUI()
    {
        
        content = (TextView)findViewById(R.id.content);
        get = (Button)findViewById(R.id.get);
        parse = (Button)findViewById(R.id.parse);
        reset = (Button)findViewById(R.id.reset);
        
        get.setOnClickListener(this);
        parse.setOnClickListener(this);
        reset.setOnClickListener(this);
        
    }
    
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.get:
                
                GetPopularFeelingsDate dao = new GetPopularFeelingsDate();
                
                pf = dao.getmPopularFeeling();
                
                // content.setText(pf.toString());
                
                jsonString = JSON.toJSONString(pf);
                jsonString = GsonTools.createGsonString(pf);
                
                HashMap<String, List<NewsIndex>> map = (HashMap<String, List<NewsIndex>>)getMap(pf);
                jsonString = GsonTools.createGsonString(map);
                // Gson gson = new Gson();
                // map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
                // }.getType());
                //
                Log.i("TEST", jsonString);
                
                // Log.i("TEST", map.toString());
                
                content.setText(jsonString);
                // content.setText(map.toString());
                break;
            
            case R.id.parse:
                
                PopularFeeling p = GsonTools.changeGsonToBean(jsonString, PopularFeeling.class);
                
                // PopularFeeling p=GsonTools.changeGsonToListMaps(jsonString);
                Gson gson = new Gson();
                
                Map<String, List<NewsIndex>> map2 = new HashMap<String, List<NewsIndex>>();
                
                // JSON 转 map 
                map2 = gson.fromJson(jsonString, new TypeToken<Map<String, List<NewsIndex>>>()
                {
                }.getType());
         
                
                
                
                content.setText(map2.get("a").toString());
                // content.setText(p.toString());
                
                break;
            
            case R.id.reset:
                
                content.setText(pf.toString());
                break;
            default:
                break;
        }
        
    }
    
    private Map<String, List<NewsIndex>> getMap(PopularFeeling pf)
    
    {
        
        HashMap<String, List<NewsIndex>> map = new HashMap<String, List<NewsIndex>>();
        
        map.put("a", pf.getMemuMN());
        map.put("b", pf.getMenuIMAg());
        map.put("c", pf.getMenuPOF());
        map.put("d", pf.getMenuTPO());
        
        return map;
        
        // TODO Auto-generated method stub
        
    }
    
}
