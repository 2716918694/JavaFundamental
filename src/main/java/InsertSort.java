import java.util.Comparator;
import java.util.List;

public class InsertSort {

    public static void main(String[] arg){
        //获取长度为len不重复随机User列表
        List<User> iList = BubbleSort.genarateNoRepetitionUsers(6);
        for(int k=0;k<iList.size();k++){
            User u = iList.get(k);
            System.out.print(u.name+"|"+u.age+"，");
        }

        //create a comparator
        Comparator<User> uComp = new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.age - o2.age;
            }
        };

        //question：sort List `iList` by Method of `InsertSort`

        //start sort
        for(int i=0;i<iList.size()-1;i++){
            int j = i;
            User temp = iList.get(i+1);
            //move next if this lager than pre
            while( j>=0 && uComp.compare(iList.get(j),temp)>0){
                iList.set(j+1,iList.get(j));
                j--;
            }
            iList.set(j+1,temp);

            // log steps of sort
            System.out.println();
            for(int k=0;k<iList.size();k++){
                User u = iList.get(k);
                System.out.print(u.name+"|"+u.age+"，");
            }
        }

    }

}


