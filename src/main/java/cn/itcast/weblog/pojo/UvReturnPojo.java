package cn.itcast.weblog.pojo;

import java.util.List;

public class UvReturnPojo {

    private List<String> dates;
    private List<Long> uvs;
    private List<Long> new_uvs;

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<Long> getUvs() {
        return uvs;
    }

    public void setUvs(List<Long> uvs) {
        this.uvs = uvs;
    }

    public List<Long> getNew_uvs() {
        return new_uvs;
    }

    public void setNew_uvs(List<Long> new_uvs) {
        this.new_uvs = new_uvs;
    }
}
