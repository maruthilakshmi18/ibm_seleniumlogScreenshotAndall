package validatelistners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestNGTransform implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation,
			java.lang.Class testclass,
			java.lang.reflect.Constructor testconstructor,
			java.lang.reflect.Method testmethod)
	
	{
		annotation.setRetryAnalyzer(RetryLogicExample.class);
	}
}
