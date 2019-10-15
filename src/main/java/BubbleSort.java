import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        //本test用来对包含User对象按age排序
        List<User> iList = genarateNoRepetitionUsers(10);
        for(int k=0;k<iList.size();k++){
            User u = iList.get(k);
            System.out.print(u.name+"|"+u.age+"，");
        }

        //创建比较器
        Comparator<User> uComp = new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.age - o2.age;
            }
        };

        //进行排序
        for(int i=0;i<iList.size();i++){
            for(int j=0;j<iList.size()-1-i;j++){
                if(uComp.compare(iList.get(j),iList.get(j+1))>0) {
                    User temp = iList.get(j);
                    iList.set(j,iList.get(j+1));
                    iList.set(j+1,temp);
                }
            }
            System.out.println();
            for(int k=0;k<iList.size();k++){
                User u = iList.get(k);
                System.out.print(u.name+"|"+u.age+"，");
            }
        }
    }

    public static List<User> genarateNoRepetitionUsers(int len){
        if (len <= 0) len = 1;
        if (len > 26) len = 26;
        User[] arr = new User[len];
        //先随机添加几个,从indexs池中可取不重复的
        List<Integer> indexs = new ArrayList();
        for(int i=0;i<26;i++){
            indexs.add(i);
        }

        for(int i=0; i<arr.length; i++){
            int random =(int)(Math.random()*indexs.size());
            int age = indexs.get(random);
            String name = String.valueOf((char)(age+65));
            arr[i] = new User(name,age);
            indexs.remove(random);
        }

        return Arrays.asList(arr);
    }
}

class User {

    String name;
    int age;

    User(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}