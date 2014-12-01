package cn.com.ths.dbcenter.domain.popularfeelings;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名: GetPeripheryActivityListDate</br>
 * 包名：cn.com.ths.dbcenter.temp </br>
 * 描述: 用于模拟舆情页面数据，接口调通后删除 </br>
 * 发布版本号：</br>
 * 开发人员： weiyubiao</br>
 * 创建时间： 2014-11-27
 */

public class GetPopularFeelingsDate
{
    
    /**
     * 封装舆情页面四个列表数据的数据模型
     */
    private PopularFeeling mPopularFeeling;
    
    /**
     * 部委要闻
     * ministriesNews
     */
    private List<NewsIndex> memuMN = new ArrayList<NewsIndex>();
    
    /**
     * 省厅资讯
     * informationMinistriesAgencies
     */
    private List<NewsIndex> menuIMAg = new ArrayList<NewsIndex>();
    
    /**
     * 今日舆情
     * TodayPublicOpinion
     */
    private List<NewsIndex> menuTPO = new ArrayList<NewsIndex>();
    
    /**
     * 舆情聚焦
     * PublicOpinionFocus
     */
    private List<NewsIndex> menuPOF = new ArrayList<NewsIndex>();
    
    public PopularFeeling getmPopularFeeling()
    {
        return mPopularFeeling;
    }
    
    public void setmPopularFeeling(PopularFeeling mPopularFeeling)
    {
        this.mPopularFeeling = mPopularFeeling;
    }
    
    public GetPopularFeelingsDate()
    {
        super();
        for (int i = 0; i < 15; i++)
        {
            
 
            memuMN.add(new NewsIndex("部委要闻" + i, "来自新浪201401129" + i));
            menuIMAg.add(new NewsIndex("省厅资讯" + i, "来自新浪201401129" + i));
            
            menuTPO.add(new NewsIndex("今日舆情" + i, "来自新浪201401129" + i));
            
            menuPOF.add(new NewsIndex("舆情聚焦" + i, "来自新浪201401129" + i));
            
        }
        
        mPopularFeeling = new PopularFeeling(memuMN, menuIMAg, menuTPO, menuPOF);
        
    }
    
}
