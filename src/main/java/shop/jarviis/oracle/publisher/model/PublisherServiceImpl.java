package shop.jarviis.oracle.publisher.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {
	@Autowired PublisherMapper pubMapper;

	@Override
	public void save(PublisherDto t) {
		pubMapper.save(t);
	}

	@Override
	public PublisherDto findById(Integer id) {
		return pubMapper.findById(id);
	}

	@Override
	public List<PublisherDto> findAll() {
		return pubMapper.findAll();
	}

	@Override
	public void update(PublisherDto t) {
		pubMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		pubMapper.delete(id);
	}
	
}
