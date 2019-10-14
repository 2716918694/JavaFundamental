import java.util.*;

public class TempNote {

    public static void main(String[] args) {

        //常用集合API
        /**
         * Resizable-array implementation of the <tt>List</tt> interface.  Implements
         * all optional list operations, and permits all elements, including
         * <tt>null</tt>.  In addition to implementing the <tt>List</tt> interface,
         * this class provides methods to manipulate the size of the array that is
         * used internally to store the list.  (This class is roughly equivalent to
         * <tt>Vector</tt>, except that it is unsynchronized.)
         */
        List<String> list = new ArrayList();
        //增
        /**
         * <p>Lists that support this operation may place limitations on what
         * elements may be added to this list.  In particular, some
         * lists will refuse to add null elements, and others will impose
         * restrictions on the type of elements that may be added.  List
         * classes should clearly specify in their documentation any restrictions
         * on what elements may be added.
         */
        System.out.println(list.add("Tom"));
        //删
        list.remove(0);
        //改
        list.set(0, "Jack");
        //查
        list.get(0);
        //判断空
        list.isEmpty();
        //大小
        int size = list.size();
        //遍历
        /**
         *      方法一 for循环
         */
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        /**
         *      方法二 超级for循环
         */
        for(String  item : list){
            System.out.println(item);
        }
        /**
         *      方法三 迭代器
         */
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //数组转换
        Set set = new HashSet();
        //增
        //删
        //改
        //查
        //遍历
        Map map = new HashMap();
        //增
        //删
        //改
        //查
        //遍历

    }
}
