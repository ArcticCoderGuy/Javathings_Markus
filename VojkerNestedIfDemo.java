public static class VojkerNestedIfDemo {
    public static class main(String [] args ) {

    // "Signal" example-data is coming in

    double entry = 1.1000;
    double SL = 1.0985;
    double TP = 1.1035;

    boolean marketOpen = true; // Simulate session is opnen (NY,London or Tokyo)
    boolean cooldownActice = true // Is there a Red-flag news period


    // 1) Gate is validated: Is the trade sensible

    if( entry > 0 && SL > 0 && TP > 0) {
        System.out.println("Signal format Ok !");

    // 2) Market gate for session: Can we trade now ?
        if (marketOpen) {
            System.out.println("Market is open !");

    // 3) Risk gate: SL/TP distance ja RR
            double SLlossdistance = Math.abs(entry - stoplossdistance);
            double TPprofitdistance = math.abs(TP - entry)

            if(SLdistance >= 0.0010) {
                system.out.println("Stop-loss distance OK ! ");

                // Nested If: risk reward (rr) gate
                double rr = TPdistance / SLdistance 

                if (rr >= 1.2) {
                    System.out.println("rr OK (" + rr + "). ");


                    // Nested if: cooldown gate
                    if(!cooldownActice) {
                        System.out.println("GO: Trade Approved !");

                        else {
                            System.out.println("No-Go: Cooldown active !!");
                            
                        }
                        
                        


                    }
                }

            }


        }
    }