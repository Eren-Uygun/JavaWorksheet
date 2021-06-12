package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.SkillService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.SkillDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService {
	
	private SkillDao _skillDao;

	
	@Autowired
	public SkillManager(SkillDao _skillDao) {
		super();
		this._skillDao = _skillDao;
	}

	@Override
	public Result add(Skill cvSkill) {
		return new SuccessDataResult<Skill>(_skillDao.save(cvSkill), "Yetkinlik eklendi");
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccessDataResult<List<Skill>>(_skillDao.findAll(),"Yetkinlik bilgileri listelendi");
	}

}
