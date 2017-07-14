package android.chenxiweather.com.chenxiweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/7/14.
 */

public class City extends DataSupport{
    private int id;            //城市ID
    private String cityName;   //城市名称
    private String cityCode;   //城市代码
    private int provinceId;    //省份关联城市主键

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
