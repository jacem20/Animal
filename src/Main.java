public class Main {
    public static void main(String[] args) {
        Animal chien = new Chien();
        Animal chat = new Chat();

        Veterinaire veterinaire = new Veterinaire();

        veterinaire.examiner(chat);
        System.out.println("---------------------");
        veterinaire.examiner(chien);

    }
}