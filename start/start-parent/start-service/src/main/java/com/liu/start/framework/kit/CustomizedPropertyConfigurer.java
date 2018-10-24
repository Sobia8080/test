package com.liu.start.framework.kit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/**
 * configurations
 * 找不到properties忽略
 */
public class CustomizedPropertyConfigurer extends PropertyPlaceholderConfigurer {

    private static Properties ctxProperties;

    /**
     * encrypted keys
     */
    private String[] encryptPropNames = {};


    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if (isEncryptProp(propertyName)) {
            return decode(propertyValue);
        } else {
            return propertyValue;
        }
    }

    private String decode(String value){
        // has no encrypted items yet
        return value;
//        return Encrypter.decrypt(value);
    }

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) throws BeansException {
        super.processProperties(beanFactory, props);
        ctxProperties = props;
    }

    public static String getProperty(String name) {
        return ctxProperties.getProperty(name);
    }

    private boolean isEncryptProp(String propertyName) {
        for (String encryptpropertyName : encryptPropNames) {
            if (encryptpropertyName.equals(propertyName))
                return true;
        }
        return false;
    }
}

