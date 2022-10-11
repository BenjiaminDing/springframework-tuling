package com.zhouyu.convertest;

import com.zhouyu.service.User;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * created     by benjiamin at 2022-08-30 / 22:33 /33
 */
public class StringToUserPropertyEditor  extends PropertyEditorSupport implements PropertyEditor {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
//        super.setAsText(text);

        User user=new User();
        user.setName(text);
        this.setValue(user);
    }
}
