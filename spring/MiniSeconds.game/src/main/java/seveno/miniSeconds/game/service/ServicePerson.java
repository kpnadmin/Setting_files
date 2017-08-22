package seveno.miniSeconds.game.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import seveno.miniSeconds.game.dao.IDaoPerson;
import seveno.miniSeconds.game.model.ModelPerson;



@Service("servicePerson")
public class ServicePerson implements IServicePerson {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    @Qualifier("daoPerson")
    IDaoPerson dao;
    
    @Override
    public int login(ModelPerson person) {
        int result = -1;
        try {
            result = dao.login(person);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("login" + e.getMessage());
            throw e;
        }
        return result;
    }
    
    @Override
    public List<ModelPerson> getPersonList(ModelPerson person) {
        List<ModelPerson> result = null;
        
        try {
            result = dao.getPersonList(person);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("getPersonList" + e.getMessage() );
            throw e;
        }
        
        
        return result;
    }
    
    @Override
    public int insertPerson(ModelPerson person) {
        int result = -1; 
        
        try {
            result = dao.insertPerson(person);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("insertPerson" + e.getMessage() );
            throw e;
        }
        
        
        return result;
    }

    @Override
    public int insertPersonList(List<ModelPerson> persons) {
       int result = -1; 
       
       try {
        result = dao.insertPersonList(persons);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        // e.printStackTrace();
        logger.error("insertPersonList" + e.getMessage() );
        throw e;
    }
        return result;
    }
}
