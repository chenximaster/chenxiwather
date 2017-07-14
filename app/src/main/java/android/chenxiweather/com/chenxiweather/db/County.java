package android.chenxiweather.com.chenxiweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/7/14.
 */

public class County extends DataSupport{
    private int id;             //县城ID
    private String countyName;  //县城名称
    private String weatherId;   //天气状况
    private int cityId;         //城市对应县城主键

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
