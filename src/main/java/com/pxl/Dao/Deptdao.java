package com.pxl.Dao;

        import com.pxl.po.Dept;
        import org.apache.ibatis.annotations.Delete;
        import org.apache.ibatis.annotations.Insert;
        import org.apache.ibatis.annotations.Select;
        import org.apache.ibatis.annotations.Update;

        import java.util.List;

public interface Deptdao {
    //查询全部
    @Select("select * from student")
    List<Dept>selectAll();
    /*id查*/
    @Select("select *from student where stu_id=#{stu_id}")
    Dept selectOne(int stu_id);
    //添加
    @Insert("insert into student (stu_name,stu_sex)values(#{stu_name},#{stu_sex})")
    int insert(Dept dept);
    //修改
    @Update("update student set stu_name=#{stu_name}where stu_id=#{stu_id}")
    int update(Dept dept);
    //删除
    @Delete("delete from student where stu_id=#{stu_id}")
    int delete(int stu_id);
}
