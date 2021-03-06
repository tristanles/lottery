package org.tristanles.results;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DrawResultTest extends StreamRedirectTest {
	
	DrawResult drawResult;
	
	@Before
	public void init() {
		drawResult = new DrawResult();
	}
	
	
	@Test
	public void DrawResultDisplayInformationalMessage() {
		drawResult.display();
		
		assertThat(testOut.toString()).isEqualTo("Tirage effectué" + System.lineSeparator());
	}
	
	
}
