package total.service;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service
public class NavService {

SqlSessionTemplate template;

	
	public boolean insert(Map map) {

		return template.insert("member.insert", map) == 1;
	}
	
}
