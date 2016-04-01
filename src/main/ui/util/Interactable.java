package main.ui.util;

import main.ui.util.Displayable;
import main.ui.util.Validatable;

/**
 * Created by DM53848 on 3/31/2016.
 */
public interface Interactable {
    public void SetDisplay(Displayable display);
    public void SetValidator(Validatable validator);
    public String requestString();
}
