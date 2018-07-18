package testCategories;

/*
* <Test Suite to execute tests b category>
**/

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(RegressionTestCategory.class)
//@Categories.IncludeCategory(SmokeTestCategory.class)
//@Suite.SuiteClasses({sampleDriverTest.class})
public class Execute {
}
