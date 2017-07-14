package android.chenxiweather.com.chenxiweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/7/14.
 */

public class Province extends DataSupport{
    private int id;                //省份ID
    private String provinceName;   //省份名称
    private int provinceCode;      //省份代码

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
