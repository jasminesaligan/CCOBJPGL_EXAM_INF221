public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay Boracay) {

        // Define your visit
        System.out.println(" ");
        System.out.println("The promo airfare for Boracay travel is " + Boracay.airFare);

        if (budget >= Boracay.airFare) {
            System.out.println("You have arrived in Boracay!");
            System.out.println("Boracay! Wow! You are stepping on the whitest sand!");
            budget -= Boracay.airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    public void visit(Siargao Siargao) {

        // Define your visit
        System.out.println("The promo airfare for Siargao travel is " + Siargao.airFare);

        if (budget >= Siargao.airFare) {
            System.out.println("You have arrived in Siargao!");
            System.out.println("Siargao! Get exicted to learn surfing!");
            budget -= Siargao.airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    public void visit(Batanes Batanes) {

        // Define your visit
        System.out.println("The promo airfare for Batanes travel is " + Batanes.airFare);

        if (budget >= Batanes.airFare) {
            System.out.println("You have arrived in Batanes!");
            System.out.println("Batanes! Experience the New Zealand of the Philippines!");
            budget -= Batanes.airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    public void visit(Bohol Bohol) {

        // Define your visit
        System.out.println("The promo airfare for Bohol travel is " + Bohol.airFare);

        if (budget >= Bohol.airFare) {
            System.out.println("You have arrived in Bohol!");
            System.out.println("Bohol! Get hungry when you see a bunch of Chocolate hills!");
            budget -= Bohol.airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    public void visit(Baguio Baguio) {

        // Define your visit
        System.out.println("The promo airfare for Baguio travel is " + Baguio.airFare);

        if (budget >= Baguio.airFare) {
            System.out.println("You have arrived in Baguio!");
            System.out.println("Baguio! Who's not ready to taste the unique strawberry taho!?");
            budget -= Baguio.airFare;
            checkBudget();
            System.out.println(" ");

        } else {
            System.out.println("You ran out of budget! You cannot further visit any locations.");
        }

    }

    
    public void visit(Cebu Cebu) {

        // Define your visit
        System.out.println("The promo airfare for Cebu travel is " + Cebu.airFare);

        if (budget >= Cebu.airFare) {
            System.out.println("You have arrived in Cebu!");
            System.out.println("Cebu! Best place to experience swimming with whale sharks!");
            budget -= Cebu.airFare;
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