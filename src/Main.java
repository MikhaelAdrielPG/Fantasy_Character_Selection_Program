import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // import scanner
        Scanner scanner = new Scanner(System.in);

        // dataset karakter
        String[][] karakterData = {
                {"Knight",
                        "Knight adalah pejuang yang ulung dengan kemampuan bertahan yang hebat. "
                                + "Dia membawa perisai besar dan pedang berat untuk melindungi diri dan rekan-rekannya dalam pertempuran."},
                {"Mage",
                        "Mage adalah penyihir kuat dengan kemampuan sihir yang luar biasa. "
                                + "Dia dapat melempar mantra untuk menghancurkan musuhnya dari jarak jauh. "
                                + "Meskipun dia lemah dalam pertempuran fisik, kekuatannya dalam sihir menjadikannya pilihan yang bijaksana dalam tim."},
                {"Archer",
                        "Archer adalah penembak jitu yang sangat terampil. Dia menggunakan busur panjang "
                                + "untuk menyerang musuh dari jarak jauh dengan tepat. Kecepatan dan ketepatan adalah kekuatannya dalam pertempuran."},
                {"Berserker",
                        "Berserker adalah pejuang berani yang mengandalkan kekuatan dan kemarahan dalam pertempuran. "
                                + "Dia bergerak cepat dan menyerang musuhnya dengan kemarahan yang tak terbendung. "
                                + "Meskipun dia kuat dalam serangan, kekurangan pertahanan membuatnya harus berhati-hati dalam pertempuran."}
        };

        System.out.println("Selamat datang di Pemilihan Karakter Fantasy!");

        // Menampilkan pilihan karakter kepada pengguna
        System.out.println("Berikut adalah pilihan karakter yang tersedia:");
        System.out.println();
        for (int i = 0; i < karakterData.length; i++) {
            System.out.println((i + 1) + ". " + karakterData[i][0]);
        }

        // Meminta pengguna untuk memilih karakter
        int choice;
        String selectedCharacterName = "";
        String selectedCharacterDescription;
        boolean validChoice = false;
        while (!validChoice) {
            try {
                System.out.println();
                System.out.print("Masukkan nomor karakter yang Anda pilih (1-4): ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= karakterData.length) {
                    validChoice = true;
                    // Mendapatkan deskripsi karakter yang dipilih pengguna
                    selectedCharacterName = karakterData[choice - 1][0];
                    selectedCharacterDescription = karakterData[choice - 1][1];

                    // Menampilkan deskripsi karakter yang dipilih pengguna
                    System.out.println();
                    System.out.println("Anda memilih karakter " + selectedCharacterName + ".");
                    System.out.println(selectedCharacterDescription);
                } else {
                    System.out.println("Input tidak valid. Masukkan nomor karakter yang sesuai.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan nomor karakter yang sesuai.");
                scanner.nextLine(); // digunakan untuk membersihkan buffer scanner dan maju ke baris berikutnya, sehingga program akan siap untuk menerima input yang baru.
            }
        }
        System.out.println();
        System.out.println("Selamat bermain permainan fantasy dengan karakter " + selectedCharacterName + " Anda!");
        scanner.close();
    }
}