package cn.itcast.weblog.controller;

import cn.itcast.weblog.pojo.AvgReturnPojo;
import cn.itcast.weblog.pojo.UvReturnPojo;
import cn.itcast.weblog.service.AvgNumService;
import cn.itcast.weblog.service.UvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    private AvgNumService avgNumService;
    @Autowired
    private UvService uvService;

//    @Autowired
//    private FlowService flowService;
    @RequestMapping("/index.action")
    public String skipToIndex(){
        return "index";
    }

    /**
     * 获取平均页面浏览数量
     * @return AvgReturnPojo
     */
    @RequestMapping("/avgPvNum.action")
    @ResponseBody
    public AvgReturnPojo getAvgReturnPojo(){
        return avgNumService.getAvgReturnPojo();
    }

    /**
     * 近一周访客数量变化趋势：'独立访客', '新独立访客'
     * @return UvReturnPojo
     */
    @RequestMapping("/uvNum.action")
    @ResponseBody
    public UvReturnPojo getUvReturnPojo(){
        return uvService.getUvReturnPojo();
    }
}

