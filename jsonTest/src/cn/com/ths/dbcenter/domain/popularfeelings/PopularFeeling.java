package cn.com.ths.dbcenter.domain.popularfeelings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/** 
 * 类名: PopularFeeling</br> 
 * 包名：cn.com.ths.dbcenter.domain.popularfeelings </br> 
 * 描述: 封装舆情页面四个列表数据的数据模型 </br>
 * 发布版本号：</br>
 * 开发人员： weiyubiao</br>
 * 创建时间： 2014-11-28 
 */ 

public class PopularFeeling implements Serializable
{
  

    /**
     * 部委要闻
     * ministriesNews
     */
    private List<NewsIndex>  memuMN =new ArrayList<NewsIndex>();
    /**
     *省厅资讯
     *informationMinistriesAgencies
     */
    private List<NewsIndex>  menuIMAg=new ArrayList<NewsIndex>();
    /**
     * 今日舆情
     * TodayPublicOpinion
     */
    private List<NewsIndex>  menuTPO=new ArrayList<NewsIndex>() ;
    /**
     * 舆情聚焦
     * PublicOpinionFocus
     */
    private List<NewsIndex>  menuPOF=new ArrayList<NewsIndex>();
    public List<NewsIndex> getMemuMN()
    {
        return memuMN;
    }
    public void setMemuMN(List<NewsIndex> memuMN)
    {
        this.memuMN = memuMN;
    }
    public List<NewsIndex> getMenuIMAg()
    {
        return menuIMAg;
    }
    public void setMenuIMAg(List<NewsIndex> menuIMAg)
    {
        this.menuIMAg = menuIMAg;
    }
    public List<NewsIndex> getMenuTPO()
    {
        return menuTPO;
    }
    public void setMenuTPO(List<NewsIndex> menuTPO)
    {
        this.menuTPO = menuTPO;
    }
    public List<NewsIndex> getMenuPOF()
    {
        return menuPOF;
    }
    public void setMenuPOF(List<NewsIndex> menuPOF)
    {
        this.menuPOF = menuPOF;
    }
  
    @Override
    public String toString()
    {
        return "PopularFeeling [memuMN=" + memuMN + ", menuIMAg=" + menuIMAg + ", menuTPO=" + menuTPO + ", menuPOF="
            + menuPOF + "]";
    }
    public PopularFeeling(List<NewsIndex> memuMN, List<NewsIndex> menuIMAg, List<NewsIndex> menuTPO,
        List<NewsIndex> menuPOF)
    {
        super();
        this.memuMN = memuMN;
        this.menuIMAg = menuIMAg;
        this.menuTPO = menuTPO;
        this.menuPOF = menuPOF;
    }
  
    public PopularFeeling()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    
    
    
    
    
    
    
}
