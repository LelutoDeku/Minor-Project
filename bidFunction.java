class Main {
    float minBid=0; //default value
    float initialBid=0;
    float bidDiff=0; //default value
    int bidCount=0;
    float bidAmount=0;
    public void setminBid(float minBid) {
        this.minBid = minBid;
    }
    public void setinitialBid(float initialBid) {
        this.initialBid = initialBid;
    }
    public void setbidDiff(float bidDiff) {
        this.bidDiff = bidDiff;
    }
    public void setbidCount(int bidCount) {
        this.bidCount = bidCount;
    }
    public float getminBid() {
        return minBid;
    }
    public float getinitialBid() {
        return initialBid;
    }
    public float getbidDiff() {
        return bidDiff;
    }
    public int getbidCount() {
        return bidCount;
    }
    public void calculateBid(float currentBid,float previousBid,int player1,int player2,int player3)
    {
        if(player1==1)
        {
            if(currentBid<minBid && currentBid-previousBid>bidDiff)
            {
                System.out.println("Please do not bid below the minimum bid");
            }
            else
            {
                System.err.println("Player 1 has bid "+currentBid);
                bidAmount=currentBid+previousBid;
                bidCount++;
            }
        }
        if(player2==1)
        {
            if(currentBid<minBid && currentBid-previousBid>bidDiff)
            {
                System.out.println("Please do not bid below the minimum bid");
            }
            else
            {
                System.err.println("Player 2 has bid "+currentBid);
                bidAmount=currentBid+previousBid;
                bidCount++;
            }
        }
        if(player3==1)
        {
            if(currentBid<minBid && currentBid-previousBid>bidDiff)
            {
                System.out.println("Please do not bid below the minimum bid");
            }
            else
            {
                System.err.println("Player 3 has bid "+currentBid);
                bidAmount=currentBid+previousBid;
                bidCount++;
            }
        }
    }
    public static void main(String[] args) {
        Main obj=new Main();
        obj.setminBid(100);
        obj.setinitialBid(0);
        obj.setbidDiff(10);
        obj.setbidCount(0);
        obj.calculateBid(0,0,1,1,1);
        obj.calculateBid(120,0,1,1,1);
        obj.calculateBid(140,0,1,1,1);
        obj.calculateBid(150,0,1,1,1);
        obj.calculateBid(160,0,1,1,1);
        obj.calculateBid(170,0,1,1,1);
        obj.calculateBid(180,0,1,1,1);
        obj.calculateBid(190,0,1,1,1);
        obj.calculateBid(200,0,1,1,1);
        obj.calculateBid(2,0,1,1,1);
        obj.calculateBid(220,0,1,1,1);
        obj.calculateBid(230,0,1,1,1);
        obj.calculateBid(240,0,1,1,1);
        obj.calculateBid(250,0,1,1,1);
        obj.calculateBid(260,0,1,1,1);
        obj.calculateBid(270,0,1,1,1);
        obj.calculateBid(280,0,1,1,1);
        obj.calculateBid(290,0,1,1,1);
        obj.calculateBid(300,0,1,1,1);
        obj.calculateBid(3,0,1,1,1);
        obj.calculateBid(320,0,1,1,1);
        obj.calculateBid(330,0,1,1,1);



}
}

