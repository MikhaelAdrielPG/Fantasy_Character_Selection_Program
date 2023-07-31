import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        displayKarakterOptions(karakterData);

        // Meminta pengguna untuk memilih karakter
        int choice = getValidChoice(scanner, karakterData.length);

        String selectedCharacterName = karakterData[choice - 1][0];
        String selectedCharacterDescription = karakterData[choice - 1][1];

        // Menampilkan deskripsi karakter yang dipilih pengguna
        displaySelectedCharacter(selectedCharacterName, selectedCharacterDescription);

        System.out.println();
        System.out.println("Selamat bermain permainan fantasy dengan karakter " + selectedCharacterName + " Anda!");
        scanner.close();
    }

    // Fungsi untuk menampilkan pilihan karakter kepada pengguna
    private static void displayKarakterOptions(String[][] karakterData) {
        System.out.println("Berikut adalah pilihan karakter yang tersedia:");
        System.out.println();
        for (int i = 0; i < karakterData.length; i++) {
            System.out.println((i + 1) + ". " + karakterData[i][0]);
        }
    }

    // Fungsi untuk meminta pengguna untuk memilih karakter dengan validasi input
    private static int getValidChoice(Scanner scanner, int maxChoice) {
        int choice = 0;
        boolean validChoice = false;
        while (!validChoice) {
            try {
                System.out.println();
                System.out.print("Masukkan nomor karakter yang Anda pilih (1-" + maxChoice + "): ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= maxChoice) {
                    validChoice = true;
                } else {
                    System.out.println("Input tidak valid. Masukkan nomor karakter yang sesuai.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan nomor karakter yang sesuai.");
                scanner.nextLine(); // membersihkan buffer scanner dan maju ke baris berikutnya
            }
        }
        return choice;
    }

    // Fungsi untuk menampilkan deskripsi karakter yang dipilih pengguna
    private static void displaySelectedCharacter(String selectedCharacterName, String selectedCharacterDescription) {
        System.out.println();
        System.out.println("Anda memilih karakter " + selectedCharacterName + ".");
        System.out.println(selectedCharacterDescription);
    }
}
