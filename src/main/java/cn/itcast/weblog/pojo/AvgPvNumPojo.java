package cn.itcast.weblog.pojo;

public class AvgPvNumPojo {

    /*id       | int(11)
    dateStr  | varchar(255)
    avgPvNum | decimal(6,2)*/

    private Long id;
    private String dateStr;
    private String avgPvNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getAvgPvNum() {
        return avgPvNum;
    }

    public void setAvgPvNum(String avgPvNum) {
        this.avgPvNum = avgPvNum;
    }
}
