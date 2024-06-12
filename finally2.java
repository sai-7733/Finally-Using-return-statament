class A{
    public static void main(String args[]){
        System.out.println(A.myMethod());
    }
    public static int myMethod(){
        System.out.println("myMethod started");
        try{
            return 112;
        }
        finally{
            System.out.println("This is finally block");
        }
        
    }
}