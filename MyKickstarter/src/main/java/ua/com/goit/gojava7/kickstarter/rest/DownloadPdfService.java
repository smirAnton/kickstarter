package ua.com.goit.gojava7.kickstarter.rest;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class DownloadPdfService {

	@RequestMapping(value = "/file", method = RequestMethod.GET, produces = "application/pdf")
	public ResponseEntity<InputStreamResource> downloadPdfFile() throws IOException {

		ClassPathResource pdfFile = new ClassPathResource("ReferenceCard.pdf");

		return ResponseEntity.ok().contentLength(pdfFile.contentLength())
				.contentType(MediaType.parseMediaType("application/octet-stream"))
				.body(new InputStreamResource(pdfFile.getInputStream()));
	}
}
