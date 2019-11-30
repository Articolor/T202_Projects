package com.wl.controller;

import com.wl.model.PAC_Packaging;
import com.wl.model.RET_Returnlist;
import com.wl.service.PAC_packagingService;
import com.wl.service.Ret_YpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Ret_YpsController {
    @Autowired
    private Ret_YpsService rets;
    @Autowired
    private PAC_packagingService pac;

    //模糊查询分页一体
    @RequestMapping("/findRet")
    public Map<String,Object> findAllRet(RET_Returnlist ret,int page, int rows){
        System.out.println("findRet");

        System.out.println(ret+"...."+page+"\t"+rows);
        List<RET_Returnlist> list = rets.selectResult(ret, (page - 1) * rows + 1, rows*page);
        for (RET_Returnlist l:list){
            System.out.println(l);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("ret",list);
        Integer count = rets.selectCount(ret);
        map.put("count",count);
        return map;
    }

    //修改
    @RequestMapping("upRet")
    public int upRet(RET_Returnlist ret){
        System.out.println("修改"+ret);
        return rets.updateByPrimaryKeySelective(ret);
    }

    //新增
    @RequestMapping("addRet")
    public int addRet(RET_Returnlist ret){
        System.out.println("新增"+ret);
        System.out.println(rets.insert(ret));
        return  rets.insert(ret);
    }


    //申请返货
    @RequestMapping("findRetWork")
    public Map<String,Object> find(RET_Returnlist ret,int page, int rows){
        System.out.println(ret);
        List<RET_Returnlist> list = rets.selectRetWork(ret, (page-1)*rows+1, rows*page);
        for (RET_Returnlist l:list){
            System.out.println(l);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("ret",list);
        map.put("count",rets.selectRetWorkCount(ret));
        return map;
    }


    //包装材料管理
    @RequestMapping("findPac")
    public Map<String,Object> findPac(PAC_Packaging p,int page,int rows){
        System.out.println(p);
        Map<String,Object> map=new HashMap<>();
        map.put("pac",pac.selectPacking(p,(page-1)*rows+1,rows*page));
        map.put("count",pac.selectPackingCount(p));
        return map;
    }

    //包装材料修改
    @RequestMapping("upPac")
    public int upPac(PAC_Packaging p){
      return  pac.updateByPrimaryKeySelective(p);
    }

    //包装材料新增
    @RequestMapping("addPac")
    public int addPac(PAC_Packaging p){
        return pac.insertSelective(p);
    }
}
