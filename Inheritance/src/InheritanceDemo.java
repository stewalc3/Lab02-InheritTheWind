import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workerArrayList = new ArrayList<Worker>();
    Worker w1 = new Worker("Lucas", "Stewart", "000001", "Mr.", 2000, 30.30);
    Worker w2 = new Worker("Louis", "Nagy", "000002", "Mr.", 1999, 40.40);
    Worker w3 = new Worker("Nick", "Beavan", "000003", "Mr.", 2000, 40.00);
    SalaryWorker sw1 = new SalaryWorker("Chunyu", "Ye", "000004", "Ms.", 2001, 0, 90000);
    SalaryWorker sw2 = new SalaryWorker("Sean", "Gue", "000005", "Mr.", 2000, 0, 105000);
    SalaryWorker sw3 = new SalaryWorker("Ever", "Clear", "000006", "Dr.", 1965, 0, 130000);

        workerArrayList.add(w1);
        workerArrayList.add(w2);
        workerArrayList.add(w3);
        workerArrayList.add(sw1);
        workerArrayList.add(sw2);
        workerArrayList.add(sw3);

        for (int i=0; i < workerArrayList.size(); i++)
        {

            if (!(workerArrayList.get(i) instanceof SalaryWorker)) {
                Worker worker = (Worker) workerArrayList.get(i);
                System.out.println(worker.formalName());
                System.out.println(worker.displayWeeklyPay(40));
                System.out.println("\n");
                System.out.println(worker.displayWeeklyPay(50));
                System.out.println("\n");
                System.out.println(worker.displayWeeklyPay(40));
            }
            System.out.println("\n");
        }

    }
        }


