package com.heroku.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.heroku.model.Heroku;

@Path("/json")
public class HerokuRestService {


		@GET
		@Path("/get")
		@Produces(MediaType.APPLICATION_JSON)
		public Heroku getTrackInJSON() {
			return new Heroku("My First Heroku","Java",new Date().toString());

		}

}
