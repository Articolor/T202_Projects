package com.wl.mapper;

import com.wl.model.My_Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface My_EmpMapper {
    @Select("select * from my_emp")
    public List<My_Emp> findAllEmp();


    @Update("update my_emp set ename=#{ename} where empno=#{empno}")
    public Integer updateEMP(My_Emp my_emp);


    @Delete("delete from my_emp where empno=#{empno}")
    public Integer deleteEmp(int empno);

    @Insert("insert into my_emp values(my_seq.nextval,#{ename},#{job},#{mgr},sysdate,#{sal},#{deptno},#{sex})")
    public Integer insertemp(My_Emp emp);


    //select * from (select rownum rn,e.* from my_emp e) where rn>=1 and rn<=5
    @Select("select * from (select rownum rn,e.* from my_emp e) where rn>=#{page} and rn<=#{rows} ")
    public List<My_Emp> findAllFy(int page, int rows);

}
