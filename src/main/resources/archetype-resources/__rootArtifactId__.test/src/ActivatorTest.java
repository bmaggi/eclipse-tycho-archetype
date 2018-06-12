package ${package};

import org.junit.Assert;
import org.junit.Test;

public class ActivatorTest {

	@Test
	public void testActivatorId() {
		Assert.assertNotNull(Activator.PLUGIN_ID);
	}

}
