package sequality;

public class Calculate {

    public int sum(int x, int y) {
    return x + y;
    }

    public int cum_sum(int start,int end){
        return (start+end)*(end-start+1)/2;
    }

    public double average(double sum, int num){
        double ave=0;
        ave = sum/num;
        return ave;
        

    }

    public int odd_sum(int start,int end){
        int odd_sum=0 ,i = 0;
        for(i=start;i<=end;i++)
        {
            if(i%2!=0)
            {
                odd_sum = odd_sum +i;
            }
        }
        return odd_sum;
    }

    public int even_sum(int start,int end){
        int even_sum=0,i = 0;
        for(i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                even_sum = even_sum +i;
            }
        }
        return even_sum;
    }

}
