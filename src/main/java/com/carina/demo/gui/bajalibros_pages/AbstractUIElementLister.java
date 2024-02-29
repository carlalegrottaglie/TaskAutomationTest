package com.carina.demo.gui.bajalibros_pages;

import com.zebrunner.carina.webdriver.IDriverPool;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

//import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class AbstractUIElementLister {
    private WebDriver driver;
    public List<AbstractUIObject> listAbstractUIObjects(AbstractPage page) {
        List<AbstractUIObject> abstractUIObjects = new ArrayList<>();

        // Get all fields declared in the class hierarchy of the page object
        Field[] fields = page.getClass().getDeclaredFields();

        // Iterate through each field
        for (Field field : fields) {
            // Ensure the field is of type AbstractUIObject or its subclass
            if (AbstractUIObject.class.isAssignableFrom(field.getType())) {
                try {
                    // Set the field to be accessible
                    field.setAccessible(true);
                    // Get the value of the field from the page object instance
                    Object fieldValue = field.get(page);
                    // Check if the field value is an AbstractUIObject or its subclass
                    if (fieldValue instanceof AbstractUIObject) {
                        abstractUIObjects.add((AbstractUIObject) fieldValue);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return abstractUIObjects;
    }

    public void list (AbstractPage pageObject) {
        // Instantiate your page object with WebDriver instance
        // driver = nullDevice.getDriver(); // Replace with your driver initialization method
      //  BookPage pageObject = new BookPage(getDriver()); // Assuming BookPage constructor requires WebDriver instance

        // List all AbstractUIObjects on the page
        List<AbstractUIObject> abstractUIObjects = listAbstractUIObjects(pageObject);

        // Print the list of AbstractUIObjects
        for (AbstractUIObject abstractUIObject : abstractUIObjects) {
            System.out.println(abstractUIObject.getClass().getSimpleName());
        }
    }
}