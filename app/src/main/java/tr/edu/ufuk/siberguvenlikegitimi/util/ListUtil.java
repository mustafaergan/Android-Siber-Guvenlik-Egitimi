package tr.edu.ufuk.siberguvenlikegitimi.util;

import java.util.ArrayList;
import java.util.List;

import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Rol;

/**
 * Created by mustafa_2 on 2.6.2019.
 */

public class ListUtil {

    public static List remove(List valueList, int position) {
        valueList.remove(position);
        List newList = new ArrayList();
        for (Object item: valueList) {
            newList.add(item);
        }
        return valueList;
    }

    public static Rol rolBul(String name) {
        if(name.equals("Yönetici"))
            return StaticList.rolList.get(0);
        else
            return StaticList.rolList.get(1);

    }
}
