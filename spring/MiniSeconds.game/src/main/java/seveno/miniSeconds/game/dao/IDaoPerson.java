package seveno.miniSeconds.game.dao;

import java.util.List;

import seveno.miniSeconds.game.model.ModelPerson;



public interface IDaoPerson {
    
    int login(ModelPerson person);
    List<ModelPerson> getPersonList(ModelPerson person);
    int insertPerson(ModelPerson person);
    int insertPersonList(List<ModelPerson> persons);
    
    
}
