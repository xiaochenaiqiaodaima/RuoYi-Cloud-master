package com.ruoyi.common.core.xss;

import com.ruoyi.common.core.utils.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @TaskCode:
 * @description: 自定义xss校验注解实现
 * @author: minshuai.chen
 * @create: 2022/6/13 11:02
 **/
public class XssValidator implements ConstraintValidator<Xss,String> {
    private static  final String HTML_PATTERN = "<(\\S*?)[^>]*>.*?|<.*? />";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isBlank(value))
        {
            return true;
        }
        return !containsHtml(value);
    }

    public static boolean containsHtml(String value){
        Pattern pattern = Pattern.compile(HTML_PATTERN);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
