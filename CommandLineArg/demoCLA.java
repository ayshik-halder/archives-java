class demoCLA {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("The Command Line Arguments are:");
            for (String arg : args) {
                System.out.println(arg + " ");
            }

            // for(int i = 0; i < args.length; i++){
            // System.out.println(args[i]+" ");
            // }
        } else {
            System.out.println("No Command Line Arguments Passed");
        }
        System.exit(0);
    }
}
