package com.learn.springmybatis.entity.test;

/**
 * @author Jiang Zelong
 * @Classname RoleUtils
 * @since 2021/6/25 13:00
 */

public class RoleUtils {
    /**
     * 判断是否嘉宾
     * @param roleId
     * @return
     */
    public static boolean isGuest(String roleId){
        String[] guests = {"GUEST_IMPORTANT","GUEST_ORDINARY"};
        for (String guest : guests) {
            if(guest.equals(roleId)){
                return true;
            }
        }
        return false;
    }
}
