package techproed.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;

public class Hooks {

    /*
    Hooks class'ının kullanım amacı scenario'lardan önce veya sonra çalışmasını istediğimiz kodları
belirttiğimiz class'tır.Bunu @Before ve @After notasyonlarına sahip methodlar ile yaparız.
Bu notasyonlar'ın importu io.cucumber dan olmalıdır.
    Bu class'ın scenario'lar tarafından görülüp burdaki @Before, @After methodlarını işleme alabilmesi için
 Hooks class'ını farklı bir package da oluşturmak istersek Runner class'ındaki glue parametresine bu
 package'ı tanımlamaız gerekir. Ancak Hooks class'ını direk stepDefinition package'ı altında oluşturursak
 Runner class'ındaki glue parametresinde stepDefinition package'ı tanımlı olduğu için başka bir işlem yapmama
 gerek kalmaz.Glue parametresinde stepDefinition package'ı tanımlı olduğu için direk hook class'ınıda kullanabiliriz.
     */
    @Before
    public void setUp() throws Exception {
        System.out.println("Scenariolar calismaya basladi");
    }

    @Before("@arac2")
    public void setUp2() {
        System.out.println("Google' de Ford aratildi");
    }

    @Before("@.0arac3")
    public void setUp3() {
        System.out.println("Google' de Ford aratildi");
    }

     /*
    Scenario'dan önce çalışmasını istediğimiz @Before methodunun notasyonuna parametre
    olarak scenario'ya tanımladığımız tag'ı belirte biliriz. Dolayısıyla sadece
    parametre olarak belirttiğimiz @Before methodu Scenario'dan önce çalışacaktır
     */


    @After
    public void tearDown(Scenario scenario) throws Exception {
        if(scenario.isFailed() ){ //scenari fail olursa
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg", "scenario"+ scenario.getName());
        }
        Driver.getDriver();
    }

    // Bu method fail olan scenariolarda fail olan kismin resmini rapora ekleyecektir.
}
