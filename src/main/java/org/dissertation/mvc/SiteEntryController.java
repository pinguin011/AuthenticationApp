package org.dissertation.mvc;

import org.dissertation.model.SiteEntry;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteEntryController {

	@RequestMapping(value="/test",method= RequestMethod.POST )
	public @ResponseBody SiteEntry test(@RequestBody SiteEntry entry){
		
		return entry;

	}
}
