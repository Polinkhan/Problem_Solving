package problem_solving;

class SUb_Set_Genarate {
    static void set(String s,int index,String temp) {
        if(index==s.length()){
            System.out.println(temp);
            return;
        }
        set(s,index+1,temp+s.charAt(index));
        set(s,index+1,temp);
    }
    public static void main(String args[]) {
        set("123",0,"");
    }
}
