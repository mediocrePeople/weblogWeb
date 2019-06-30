package cn.itcast.weblog.service.impl;

import cn.itcast.weblog.mapper.AvgNumMapper;
import cn.itcast.weblog.pojo.AvgPvNumPojo;
import cn.itcast.weblog.pojo.AvgReturnPojo;
import cn.itcast.weblog.service.AvgNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AvgNumServiceImpl implements AvgNumService {
    @Autowired
    private AvgNumMapper avgNumMapper;

    @Override
    public AvgReturnPojo getAvgReturnPojo() {
        AvgReturnPojo avgReturnPojo = new AvgReturnPojo();
        List<String> dates = new ArrayList<String>();
        List<String> data = new ArrayList<String>();

        avgReturnPojo.setData(data);
        avgReturnPojo.setDates(dates);

        List<AvgPvNumPojo> avgPvNumPojoList = avgNumMapper.getAllAvgNum();

        for (AvgPvNumPojo avgPvNumPojo : avgPvNumPojoList){
            dates.add(avgPvNumPojo.getDateStr());
            data.add(avgPvNumPojo.getAvgPvNum());
        }

        return avgReturnPojo;
    }
}
