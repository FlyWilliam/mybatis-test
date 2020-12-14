package com.fun.mybatis.utils;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.PropertyUtilsBean;




public class BeanUtil {

	public static final String CLASS_PROPERTY_NAME = "class";

	/**
	 * bean对象按属性值为value转map
	 * 
	 * @param obj
	 * @return
	 */
	public static Map<String, Object> beanToMapByField(Object obj) {
		if (obj == null) {
			return null;
		}
		Map<String, Object> params = new HashMap<String, Object>();
		if (obj instanceof Map) {
			Map<?, ?> ml = ((Map<?, ?>) obj);
			for (Entry<?, ?> entry : ml.entrySet()) {
				Object key = entry.getKey();
				params.put(key == null ? null : key.toString(), entry.getValue());
			}
			return params;
		}
		try {
			PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
			PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
			for (int i = 0; i < descriptors.length; i++) {
				String name = descriptors[i].getName();
				if (!CLASS_PROPERTY_NAME.equals(name)) {
					params.put(name, propertyUtilsBean.getNestedProperty(obj, name));
				}
			}
		} catch (Exception e) {
			return null;
		}
		return params;
	}
}
