import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertSort {

    public static void main(String[] arg){
        User[] arr = new User[10];
        for(int i=0; i<arr.length; i++){
            int age =(int)(Math.random()*26);
            String name = String.valueOf((char)(age+65));
            arr[i] = new User(name,age);
        }

        List<User> iList = Arrays.asList(arr);
        for(int k=0;k<iList.size();k++){
            User u = iList.get(k);
            System.out.print(u.name+"|"+u.age+"，");
        }

        Comparator<User> uComp = new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.age - o2.age;
            }
        };

        //question：sort List `iList` by Method of `InsertSort`

        for(int i=0;i<iList.size()-1;i++){
            int j = i;
            User temp = iList.get(i+1);
            while( j>=0 && uComp.compare(iList.get(j),temp)>0){
                iList.set(j+1,iList.get(j));
                j--;
            }
            iList.set(j+1,temp);
            System.out.println();
            for(int k=0;k<iList.size();k++){
                User u = iList.get(k);
                System.out.print(u.name+"|"+u.age+"，");
            }
        }

    }

}


