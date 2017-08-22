package seveno.miniSeconds.game.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import seveno.miniSeconds.game.model.ModelPerson;



@Repository("daoPerson")
public class DaoPerson implements IDaoPerson {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;


    @Override
    public int login(ModelPerson person) {
        // TODO Auto-generated method stub
        return session.selectOne("mapper.mysql.mapperPerson.login", person);
    }


    @Override
    public List<ModelPerson> getPersonList(ModelPerson person) {
        // TODO Auto-generated method stub
        return session.selectList("mapper.mysql.mapperPerson.getPersonList", person);
    }


    @Override
    public int insertPerson(ModelPerson person) {
        // TODO Auto-generated method stub
        return session.insert("mapper.mysql.mapperPerson.insertPerson", person);
    }


    @Override
    public int insertPersonList(List<ModelPerson> persons) {
        // TODO Auto-generated method stub
        return session.insert("mapper.mysql.mapperPerson.insertPersonList",persons);
    }
    
    
}
