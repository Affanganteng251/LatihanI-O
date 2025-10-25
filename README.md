<h1>LATIHAN INPUT & OUTPUT</h1>

<h3>1. Latihan A</h3>
<div align="justify">
Program yang berfungsi untuk menjumlahkan dua bilangan yang dimasukkan oleh pengguna melalui keyboard. Program dimulai dengan mengimpor kelas Scanner dari paket java.util, yang digunakan untuk membaca input dari pengguna. Di dalam metode main, dibuat sebuah objek Scanner bernama input untuk menerima data dari pengguna. Selanjutnya, program menampilkan pesan di layar yang meminta pengguna memasukkan bilangan pertama, kemudian membaca nilai tersebut dan menyimpannya dalam variabel bilangan1. Hal yang sama dilakukan untuk bilangan kedua yang disimpan dalam variabel bilangan2. Setelah kedua bilangan diperoleh, program melakukan operasi penjumlahan antara bilangan1 dan bilangan2, lalu menyimpan hasilnya dalam variabel hasil. Terakhir, program menampilkan hasil penjumlahan tersebut ke layar dengan pesan “Jumlahnya adalah: ...”. Di akhir program, objek Scanner ditutup menggunakan input.close() untuk menghindari kebocoran sumber daya.
</div>

<hr>

<h3>2. Latihan B</h3>
<div align="justify">
Program yang digunakan untuk menghitung jumlah kata dalam satu baris teks yang dimasukkan oleh pengguna. Program ini menggunakan kelas BufferedReader dan InputStreamReader untuk membaca input dari keyboard. Pertama, objek InputStreamReader dibuat untuk menghubungkan aliran input standar (System.in), kemudian dibungkus oleh BufferedReader agar proses pembacaan teks menjadi lebih efisien. Program menampilkan pesan di layar yang meminta pengguna untuk memasukkan satu baris teks, lalu membaca input tersebut dan menyimpannya dalam variabel barisTeks. Setelah itu, dilakukan pengecekan apakah teks yang dimasukkan tidak kosong atau null. Jika pengguna benar-benar memasukkan teks, program akan memisahkan setiap kata menggunakan metode split("\\s+"), di mana \\s+ berarti satu atau lebih spasi. Hasil pemisahan disimpan dalam array kata, dan jumlah kata dihitung berdasarkan panjang array tersebut menggunakan kata.length. Nilai ini kemudian ditampilkan di layar sebagai “Jumlah kata”. Jika pengguna tidak memasukkan teks apa pun, program akan menampilkan “Jumlah kata: 0”. Di akhir eksekusi, objek BufferedReader ditutup untuk mengakhiri proses pembacaan input dengan baik.
</div>

<hr>

<h3>3. Latihan C</h3>
<div align="justify">
Program Java ini menggunakan berbagai kelas dari paket java.io, java.nio.file, dan java.util untuk membaca file teks yapping.txt, menghitung frekuensi munculnya setiap kata, dan menyimpan hasil perhitungan ke dalam file count.txt. Pertama, objek Path dibuat untuk menunjuk ke yapping.txt dan count.txt, yang merupakan file input. Selanjutnya, pasangan kata dan jumlah kemunculannya disimpan dalam sebuah HashMap yang disebut wordCount. Setelah semua baris diproses, blok coba kedua digunakan untuk menulis hasil perhitungan ke dalam file count.txt dengan BufferedWriter. Setiap entri dari wordCount diformat sebagai "jumlah", dan setiap pasangan dimasukkan ke dalam baris baru. Program akan menampilkan pesan error di konsol jika terjadi kesalahan saat membaca atau menulis file.
</div>

<hr>

<h3>4. Latihan D</h3>
<div align="justify">
Program yang dapat menyalin atau copy file secara biner. Ini berarti program ini dapat menyalin file baik teks maupun non-teks seperti dokumen, gambar, atau video. Program dimulai dengan memeriksa argumen pengguna dengan args. Jika jumlah argumen tidak sama dengan dua, program akan menampilkan pesan penggunaan yang benar, misalnya java CopyFileBinary <file_sumber> <file_tujuan>, dan kemudian menghentikan eksekusi. Nama file sumber yang akan disalin dan file tujuan tempat salinan disimpan masing-masing diwakili oleh dua argumen tersebut. Penjelasan dikeluarkan oleh program setelah seluruh isi file disalin dengan sukses. Program akan menangkap pengecualian IOException jika terjadi kesalahan seperti file tidak ditemukan atau tidak dapat diakses, dan pesan kesalahan akan ditampilkan di konsol. Dengan pendekatan ini, program mampu menyalin file dengan efisien dan aman tanpa kehilangan data.
</div>

<hr>
