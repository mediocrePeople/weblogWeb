package cn.itcast.weblog.service.impl;

import cn.itcast.weblog.mapper.UvMapper;
import cn.itcast.weblog.pojo.FlowNumPojo;
import cn.itcast.weblog.pojo.UvReturnPojo;
import cn.itcast.weblog.service.UvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UvServiceImpl implements UvService {
    @Autowired
    private UvMapper uvMapper;

    @Override
    public UvReturnPojo getUvReturnPojo() {

        UvReturnPojo uvReturnPojo = new UvReturnPojo();

        List<String> dates = new ArrayList<String>();
        List<Long> uvs = new ArrayList<Long>();
        List<Long> new_uvs = new ArrayList<Long>();

        List<FlowNumPojo> flowNumPojoList = uvMapper.getAllFlowNum();

        for (FlowNumPojo flowNumPojo:flowNumPojoList){
            dates.add(flowNumPojo.getDateStr());
            uvs.add(flowNumPojo.getuVNum());
            new_uvs.add(flowNumPojo.getNewUvNum());
        }

        uvReturnPojo.setDates(dates);
        uvReturnPojo.setUvs(uvs);
        uvReturnPojo.setNew_uvs(new_uvs);
        return uvReturnPojo;
    }
}
