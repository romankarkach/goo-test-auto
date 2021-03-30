	import static com.codeborne.selenide.Condition.*;
	import static com.codeborne.selenide.Selenide.*;
	
	import org.testng.annotations.Test;
	import org.openqa.selenium.By;

@Test
public class Test1 {
	public void searchGoogle()
	{
		open("http://google.com");
	    $(By.name("q")).val("test")
	    	.pressEnter();

	    $("#ires li.g").shouldBe(visible)
	    	.shouldHave(text("Test"));

	    screenshot("google_results");
	 }
}
