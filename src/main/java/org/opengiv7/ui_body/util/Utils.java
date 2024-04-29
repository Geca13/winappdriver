package org.opengiv7.ui_body.util;

import org.opengiv7.qacommon.annotations.Util;
import org.openqa.selenium.WebElement;

public class Utils {

    /**
     * Checks if a radio button WebElement is selected.
     * @param radioButton The radio button WebElement to check.
     * @return true if the radio button is selected, false otherwise.
     */
    @Util
    public static boolean isRadioButtonSelected(WebElement radioButton) {
        return radioButton.isSelected();
    }
}
