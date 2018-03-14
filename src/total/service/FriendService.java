package total.service;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {
@Autowired
SqlSessionTemplate template;
	
	public boolean frinedDBInsert(Map map) {
		
		return template.insert("friend.DBinsert", map) == 1;
	}
	
	
	public boolean friendRequest(String other) {
		
		return template.selectOne("friend.request", other) != null;
	}
	
	
}
