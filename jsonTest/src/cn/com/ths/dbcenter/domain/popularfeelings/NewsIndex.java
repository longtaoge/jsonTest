package cn.com.ths.dbcenter.domain.popularfeelings;

/** 
 * 类名: NewsIndex</br> 
 * 包名：cn.com.ths.dbcenter.domain.popularfeelings </br> 
 * 描述: 舆情页面Item数据模型 </br>
 * 发布版本号：</br>
 * 开发人员： weiyubiao</br>
 * 创建时间： 2014-11-28 
 */ 

public class NewsIndex
{
    /**
     * 标题
     */
    private String title;
    
    /**
     * 日期
     */
    private String update;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getUpdate()
    {
        return update;
    }

    public void setUpdate(String update)
    {
        this.update = update;
    }

    public NewsIndex(String title, String update)
    {
        super();
        this.title = title;
        this.update = update;
    }

    public NewsIndex()
    {
        super();
        
    }

    @Override
    public String toString()
    {
        return "NewsIndex [title=" + title + ", update=" + update + "]";
    }
    
    
    
    
    
    
    
    
    
    
}
