
import com.pxl.Dao.Deptdao;
import com.pxl.po.Dept;
        import org.apache.ibatis.io.Resources;
        import org.apache.ibatis.session.SqlSession;
        import org.apache.ibatis.session.SqlSessionFactory;
        import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
        import java.io.InputStream;
        import java.util.List;

public class Test {
    private InputStream is;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private Deptdao dd;

    @Before
    public void before() throws IOException {
        is = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession(true);
        dd = sqlSession.getMapper(Deptdao.class);
    }

    @org.junit.Test
    public void testAll() throws IOException {
//查询全部
        dd.selectAll().forEach(System.out::println);

    }

    //根据id查
    @org.junit.Test
    public void testSelectOne() {
        Dept dept = dd.selectOne(2);
        System.out.println(dept);
    }

    @org.junit.Test
    public void zeng() {
        Dept dept = new Dept();
        dept.setStu_name("笑话");
        dept.setStu_sex("男");
        int insert = dd.insert(dept);
        System.out.println("insert = " + insert);
    }

    @org.junit.Test
    public void shan() {
        int delete = dd.delete(3);
        System.out.println("delete = " + delete);
    }

    @org.junit.Test
    public void xiu() {
        Dept dept = new Dept();
        dept.setStu_sex("女");
        dept.setStu_id(3);
        dept.setStu_name("haha");

        int update = dd.update(dept);
        System.out.println("update = " + update);
    }

}
