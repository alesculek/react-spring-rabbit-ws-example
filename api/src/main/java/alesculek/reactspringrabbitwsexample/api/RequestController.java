package alesculek.reactspringrabbitwsexample.api;

import alesculek.reactspringrabbitwsexample.api.DTOs.ProcessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestController {

	@Autowired
	protected RabbitConfig rabbitConfig;

	@RequestMapping(value = "/v1/request/process/", method = RequestMethod.POST)
	public ResponseEntity<ProcessResponse> index(@RequestBody List<String> serialNumbers) {
		ProcessResponse processResponse = new ProcessResponse();
		processResponse.totalCnt = serialNumbers.size();

		System.out.println("RabbitMQ Host: " + this.rabbitConfig.getHost());

		return new ResponseEntity<>(processResponse, HttpStatus.OK);
	}

}
