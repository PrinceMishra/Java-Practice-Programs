class State{

    private int l,b,h;

    void setDimension(int l, int b, int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }

    void showDimension()
    {
        System.out.println("L : "+l);
        System.out.println("B : "+b);
        System.out.println("H : "+h);
    }
   
}



class Example{

    public static void main(String[] args){

        State st= new State();
        st.setDimension(5,4,3);
        st.showDimension();
        State st1= new State();

        System.out.println(st);
        System.out.println(st.equals(st1));

    }
}