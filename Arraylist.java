import java.util.ArrayList;
class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer> number=new ArrayList<>();
        number.add(-10);
        number.add(21);
        number.add(30);
        number.add(-47);
        number.add(56);

        int sum=0;
        for(int num:number){
            sum=sum+num;
        }
        System.out.println("Sum : "+sum);

        int max=number.get(0);
        for(int num:number){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Maximum : "+max);

        int min=number.get(0);
        for(int num:number){
            if(num<min){
                min=num;
            }
        }
        System.out.println("Minimum : "+min);

        double avg=sum/number.size();
        System.out.println("Average : "+avg);

        int even_num=0,odd_num=0;
        for(int num:number){
            if(num%2==0){
                even_num+=1;
            }
            else{
                odd_num+=1;
            }
        }
        System.out.println("Even Number : "+even_num);
        System.out.println("Odd Number : "+odd_num);

        int positive_num=0,negative_num=0,zero=0;
        for(int num:number){
            if(num<0){
                negative_num+=1;
            }
            else if(num>0){
                positive_num+=1;
            }
            else{
                zero+=1;
            }
        }
        System.out.println("Negative Number : "+negative_num);
        System.out.println("Positive Number : "+positive_num);
        System.out.println("Zeros : "+zero);

        //search
        int target=100;
        boolean flag=true;
        for(int num:number){
            if(num==target){
                flag=true;
                break;
        }
        else{
            flag=false;
        }
    }
    if(flag){
        System.out.println("Element Found");
    }
    else{
        System.out.println("Element Not Found");
    }

    for(int i=number.size()-1;i>=0;i--){
        System.out.println(number.get(i));
    }
    }
}