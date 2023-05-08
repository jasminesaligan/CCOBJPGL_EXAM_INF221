interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Siargao siargao);
    void visit(Cebu cebu);
    void visit(Batanes batanes);
    void visit(Baguio baguio);
    void visit(Bohol bohol);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}