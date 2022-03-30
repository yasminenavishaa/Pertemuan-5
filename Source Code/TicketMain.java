public class TicketMain {
    public static void main(String[] args) {
        TicketService data = new TicketService();
        Ticket t1 = new Ticket("Citilink", 200000, "Jakarta", "Surabaya");
        Ticket t2 = new Ticket("Lion air", 250000, "Jakarta", "Surabaya");
        Ticket t3 = new Ticket("Garuda Indonesia", 350000, "Jakarta", "Surabaya");
        Ticket t4 = new Ticket("AirAsia", 300000, "Jakarta", "Surabaya");

        data.tambah(t1);
        data.tambah(t2);
        data.tambah(t3);
        data.tambah(t4);

        System.out.println("Daftar Harga ticket sebelum di sorting = ");
        data.tampil();
        System.out.println();

        System.out.println("Data ticket setelah di sorting berdasarkan ipk");
        System.out.println("Sorting dengan metode Bubble sort");
        data.bubbleSort();
        data.tampil();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Sorting dengan metode Selection sort");
        data.selectionSort();
        data.tampil();
        System.out.println("-------------------------------");
    }
}
