package com.zhouyu.convertest;

import com.zhouyu.service.User;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;



/**
 * created     by benjiamin at 2022-08-30 / 23:17 /17
 */
public class StringToUserConverter   implements ConditionalGenericConverter {
    @Override
    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return sourceType.getType().equals(String.class)&& targetType.getType().equals(User.class);
    }

    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new ConvertiblePair(String.class,User.class));
    }

    @Override
    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
       User user=new User();
       user.setName((String)source);

        return user;
    }
}
