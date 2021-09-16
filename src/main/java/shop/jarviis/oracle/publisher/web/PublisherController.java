package shop.jarviis.oracle.publisher.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.publisher.model.PublisherDto;
import shop.jarviis.oracle.publisher.model.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController{
	
	@Autowired PublisherDto pubDto;
	@Autowired PublisherService pubService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(PublisherDto t) {
		pubService.save(t);
		
	}

	@RequestMapping("/detail")
	public String findById(Integer pubId ) {
		pubDto = pubService.findById(pubId);
		System.out.println(pubDto.toString());
		return "잘 봤습니다.";
	}

	@RequestMapping
	public String findAll() {
		List<PublisherDto> pubs = pubService.findAll();
		for (PublisherDto pub: pubs) {
			System.out.println(pub.toString());
		}
		return  "잘봤습니다.";
	}

	@RequestMapping(value ="/update", method = RequestMethod.POST)
	public void update(PublisherDto t) {
		pubService.update(t);
		
	}

	@RequestMapping("/delete")
	public void delete(Integer pubId) {
		pubService.delete(pubId);
	}
}
