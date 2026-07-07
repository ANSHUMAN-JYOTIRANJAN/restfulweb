package com.anshuman.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonSbiController {
	
	// Spring Boot Implementation(sbi)
//	@GetMapping(value = "/{version}/personsbi",version = "1.0.0")
//	public PersonV1 getFirstVersionOfPerson() {
//		return new PersonV1("Bob Chalu");
//	}
//	
//	@GetMapping(value = "/{version}/personsbi",version = "2.0.0")
//	public PersonV2 getSecondVersionOfPerson() {
//		return new PersonV2(new Name("Bob","charle"));
//	}
	
//	@GetMapping(path = "/personsbi", params = "version=1")
//	public PersonV1 getFirstVersionofPersonRequestParameter() {
//		return new PersonV1("Bob charle");
//	}
//	@GetMapping(path = "/personSbi", params = "version=2")
//	public PersonV2 getSecondVersionofPersonRequestParameter() {
//		return new PersonV2(new Name("Bob","charle"));
//	}
	
	//queryParam
//	@GetMapping(path = "/personsbi",  version="1.0.0")
//	public PersonV1 getFirstVersionofPersonRequestParameter() {
//		return new PersonV1("Bob charle");
//	}
//	@GetMapping(path = "/personsbi", version="2.0.0")
//	public PersonV2 getSecondVersionofPersonRequestParameter() {
//		return new PersonV2(new Name("Bob","charle"));
//	}
//	@GetMapping(path = "/personsbi/header",headers="X-API-VERSION=1")
//	public PersonV1 getFirstVersionofPersonRequestHeader() {
//		return new PersonV1("Bob charle");
//	}
//	@GetMapping(path = "/personsbi/header",headers = "X-API-VERSION=2")
//	public PersonV2 getSecondVersionofPersonRequestHeader() {
//		return new PersonV2(new Name("Bob","charle"));
//	}
//	
//	@GetMapping(path = "/personsbi/accept",produces="application/vnd.company.app-v1+json")
//	public PersonV1 getFirstVersionOfPersonAcceptHeader() {
//		return new PersonV1("Bob charle");
//	}
//	@GetMapping(path = "/personsbi/accept",produces="application/vnd.company.app-v2+json")
//	public PersonV2 getSecondVersionOfPersonAcceptHeader() {
//		return new PersonV2(new Name("Bob","Charle"));
//	}
	
}
