package LibraryManagementSystem;

public abstract class Member {
    private int MemberId;

    private String MemberName;

    private long phnNo;

    public abstract  void getMemberShipType();

    public abstract  void printDetails();


    public int getMemberId(){
        return MemberId;
    }

    public void SetMemberId(int MemberId){
        this.MemberId = MemberId;
    }

    public String getMemberName(){
        return MemberName;
    }

    public void SetMemberName(String MemberName){
        this.MemberName = MemberName;
    }

     public long getMemberphnNo(){
        return phnNo;
    }

    public void SetMemberphnNo(long MemberId){
        this.phnNo = phnNo;
    }
    




}
