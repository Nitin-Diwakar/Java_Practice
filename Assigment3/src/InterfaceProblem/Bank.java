package InterfaceProblem;

class Bank implements CreditCard{

    @Override
    public void ruppes(int amount){
        System.out.println("₹"+amount);
    }

    @Override
    public void dollars(double amount){
        System.out.println("$"+amount);
    }

    @Override
    public void pounds(int amount){
        System.out.println("£"+amount);
    }
}
