public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay Boracay) {

        // Define your visit
        int  airFare = 100;
        System.out.println(" ");
        System.out.println("The promo airfare for Boracay travel is " + airFare);

        if (budget > airFare) {
            System.out.println("You have arrived in Boracay!");
            System.out.println("Boracay! Wow! You are stepping on the whitest sand!");
            budget -= airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    public void visit(Siargao Siargao) {

        // Define your visit
        int  airFare = 200;
        System.out.println("The promo airfare for Siargao travel is " + airFare);

        if (budget > airFare) {
            System.out.println("You have arrived in Siargao!");
            System.out.println("Siargao! Get exicted to learn surfing!");
            budget -= airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    public void visit(Batanes Batanes) {

        // Define your visit
        int  airFare = 200;
        System.out.println("The promo airfare for Batanes travel is " + airFare);

        if (budget > airFare) {
            System.out.println("You have arrived in Batanes!");
            System.out.println("Batanes! Experience the New Zealand of the Philippines!");
            budget -= airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    public void visit(Bohol Bohol) {

        // Define your visit
        int  airFare = 150;
        System.out.println("The promo airfare for Bohol travel is " + airFare);

        if (budget > airFare) {
            System.out.println("You have arrived in Bohol!");
            System.out.println("Bohol! Get hungry when you see a bunch of Chocolate hills!");
            budget -= airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    public void visit(Baguio Baguio) {

        // Define your visit
        int  airFare = 100;
        System.out.println("The promo airfare for Baguio travel is " + airFare);

        if (budget > airFare) {
            System.out.println("You have arrived in Baguio!");
            System.out.println("Baguio! Who's not ready to taste the unique strawberry taho!?");
            budget -= airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    
    public void visit(Cebu Cebu) {

        // Define your visit
        int  airFare = 200;
        System.out.println("The promo airfare for Cebu travel is " + airFare);

        if (budget > airFare) {
            System.out.println("You have arrived in Cebu!");
            System.out.println("Cebu! Best place to experience swimming with whale sharks!");
            budget -= airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }


    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }


    
}