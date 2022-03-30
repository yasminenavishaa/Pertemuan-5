#LAPORAN JOBSHEET 5 PRAKTIKUM STRUKTUR DATA

Dibuat oleh : <p>
Yasmine Navisha Andhani <p>
1F D4 Teknik Informatika <p>
2141720047 <p>

# 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort <p>
## 5.2.1 Langkah-langkah Percobaan
1. Buat project baru dengan nama “bubble-selection-insertion”, kemudian buat package dengan nama “jobsheet6”.
2. Buatlah sebuah class dengan nama Mahasiswa.
3. Sesuaikan class Mahasiswa dengan melihat class diagram di atas dengan menambahkan attribute, konstruktor, dan fungsi atau method. Untuk lebih jelasnya class tersebut dapat dilihat pada potongan kode di bawah ini.<p>
<img src="J5 - 5.2.1 (3).PNG"> <p>
4. Buat class DaftarMahasiswaBerprestasi seperti di bawah ini! <p>
<img src="J5 - 5.2.1 (4).PNG"> <p>
5. Tambahkan method tambah() di dalam class tersebut! Method tambah() digunakan untuk menambahkan objek dari class Mahasiswa ke dalam atribut listMhs.<p>
<img src="J5 - 5.2.1 (5).PNG"> <p>
6. Tambahkan method tampil() di dalam class tersebut! Method tampil() digunakan untuk menampilkan semua data mahasiswa-mahasiswa yang ada di dalam class tersebut! Perhatikan penggunaan sintaks for yang agak berbeda dengan for yang telah dipelajari sebelumnya, meskipun secara konsep sebenarnya mirip.<p>
<img src="J5 - 5.2.1 (6).PNG"> <p>
7. Tambahkan method bubbleSort() di dalam class tersebut! <p>
<img src="J5 - 5.2.1 (7).PNG"> <p>
8. Buat class Main dan didalamnya buat method main() seperti di bawah ini!<p>
<img src="J5 - 5.2.1 (8).PNG"> <p>
9. Di dalam method main(), buatlah sebuah objek DaftarMahasiswaBerprestasi dan buatlah 5 objek mahasiswa kemudian tambahkan semua objek mahasiswa tersebut dengan memanggil fungsi tambah pada objek DaftarMahasiswaBerprestasi. Silakan dipanggil fungsi tampil() untuk melihat semua data yang telah dimasukan, urutkan data tersebut dengan memanggil fungsi bubbleSort() dan yang terakhir panggil fungsi tampil kembali. <p>
<img src="J5 - 5.2.1 (9).PNG"> <p>

## 5.2.2 Verifikasi Hasil Percobaan
<img src="J5 - 5.2.2 (a).PNG"> <p>
<img src="J5 - 5.2.2 (b).PNG"> <p>


## 5.2.3 Pertanyaan
1. Terdapat di method apakah proses bubble sort?
> : Proses bubble sort terdapat pada method bubbleSort() : void pada class DaftarMahasiswaBerprestasi.
2. Terdapat di method apakah proses selection sort?
> : Proses bubble sort terdapat pada method selectionSort() : void pada class DaftarMahasiswaBerprestasi.
3. Apakah yang dimaksud proses swap? Tuliskan potongan program untuk melakukan proses swap tersebut!
> : Proses pertukaran nilai/proses yang sesuai urutan pada sorting dimana letak nilai akan ditempatkan pada letak urutnya, baik pengurutan ascending atau descending. <p>
<img src="J5 - 5.2.3 (3).PNG"> <P>
4. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini: <p>
<img src="J5 - 5.2.3 (4).PNG"> <p>
Untuk apakah proses tersebut? <p>
> : Untuk memberikan pemilihan kondisi/persyaratan kondisi dimana jika listMhs[j].ipk > listMhs[j-1].ipk maka kondisi tersebut akan terpenuhi maka dilakukan proses swap nilai sesuai dengan syarat yang telah diberikan. Namun, karena syarat tadi lebih dari maka yang keluar nantinya adalah proses pertukaran nilai degan urutan descending atau dari nilai terbesar ke yang terkecil.
5. Perhatikan perulangan di dalam bubbleSort() di bawah ini: <p>
<img src="J5 - 5.2.3 (5).PNG"> <p>
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? <p>
> : Perulangan i /perulangan luar bertujuan agar proses swapping pada perulangan j tetap berlanjut hingga semua bilangan sudah terurutkan, Sedangkan perulangan j/perulangan dalam bertugas untuk melakukan swapping/penukaran nilai secara terus menerus hingga bilangan sudah terurut sesuai dengan syarat kondisi (ascending atau descending).
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ? <p>
> : Agar batas dari perulangan luar/perulangan i memiliki rentang panjang length sejumlah listMhs.length – 1 atau panjang array listMhs di kurangi 1 ketika melakukan perulangan dari perulangan swapping yang dilakukan oleh perulangan j
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ? <p>
> : Agar batas dari perulangan dalam/perulangan j memiliki rentang panjang length sejumlah listMhs.length – i atau panjang array listMhs di kurangi i ketika melakukan swapping/penukaran nilai dari array listMhs agar bisa urut.
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh ? <p>
> : Perulangan yang akan berlangsung pada i apabila length listMhs 50 adalah sebanyak length dari array listMhs – 1 (listMHs.length – 1) sampai proses swapping atau tahap bubblesort pada perulangan j habis/sudah memenuhi kondisi terurut (jika belum perulangan akan terus dilakukan). Dan jika dalam bentuk angka sesungguhnya perulangan i berlangsung sebanyak 49 kali. Dan tahap bubblesort yang akan ditempuh jika length listMhs 50 adalah sebanyak length dari array listMhs – i (listMHs.length – i) sampai proses swapping atau penukaran nilai dari elemen-elemen array listMhs sudah memenuhi kondisi terurut (jika belum maka swapping akan terus dilakukan). Dan jika dalam bentuk angka sesungguhnya perulangan j/ tahap bubblesort 
berlangsug sebanyak 1273 kali.

# 5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
## 5.3.1 Langkah-langkah Percobaan
1. Lihat kembali class DaftarMahasiswaBerprestasi, dan tambahkan method selectionSort() di dalamnya! Method ini juga akan melakukan proses sorting secara ascending, tetapi menggunakan pendekatan selection sort. <p>
<img src="J5 - 5.3.1 (1).PNG"> <p>
2. Setelah itu, buka kembali class Main, dan di dalam method main() tambahkan baris program untuk memanggil method selectionSort() tersebut! <p>
<img src="J5 - 5.3.1 (2).PNG"> <p>
3. Coba jalankan kembali class Main, dan amati hasilnya! Apakah kini data mahasiswa telah tampil urut menaik berdasar ipk?

## 5.3.2 Verifikasi Hasil Percobaan
<img src="J5 - 5.2.2 (a).PNG"> <p>
<img src="J5 - 5.3.2.PNG"> <p>


## 5.3.3 Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini: <p>
<img src="J5 - 5.3.3.PNG"> <p>
Untuk apakah proses tersebut, jelaskan!
> : - Proses tersebut bertujuan untuk mencari nilai elemen min pada semua nilai elemen pada array yang seharusnya (minimal pada pertama). Kemudian elemen array tersebut di tetapkan atau di isolasi dan tidak di ganggu lagi. <p> 
- Menemukan sebuah elemen array yang memiliki nilai kecil dari index kedua dari elemen awal jika terkecil, setelah itu melakukan penukaran elemen tersebut dengan elemen array pada posisi (indeks) kedua (dari awal tergantung penggunaan untuk mencari nilai terkecil), kemudian untuk mengisolasi atau menetapkan elemen array tersebut ditambah dengan elemen array yang sebelumnya. <p>
- Dari program diatas nilai terkecil atau min dideklarasikan dengan idxmin, lalu masuk perulangan kedua unruk memberikan syarat if (listMhs[j].ipk < listMhs[idxMin].ipk) pada nilai tersebut dan jika menenuhi kondisi maka nilai terkecil sudah diketemukan.

# 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
## Langkah - langkah Percobaan
1. Lihat kembali class DaftarMahasiswaBerprestasi, dan tambahkan method insertionSort() di dalamnya. Method ini juga akan melakukan proses sorting secara ascending, tetapi menggunakan pendekatan Insertion Sort. <p>
<img src="J5 - 5.4.1 (1).PNG"> <p>
2. Setelah itu, buka kembali class Main, dan di dalam method main() tambahkan baris program untuk memanggil method insertionSort() tersebut! <P>
<img src="J5 - 5.4.1 (2).PNG"> <p>
3. Coba jalankan kembali class Main, dan amati hasilnya! Apakah kini data mahasiswa telah tampil urut menaik berdasar ipk?

## 5.4.2 Verifikasi Hasil Percobaaan
<img src="J5 - 5.2.2 (a).PNG"> <p>
<img src="J5 - 5.4.2.PNG"> <p>

## 5.4.3 Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara ascending atau decending, anda dapat melakukannya dengan menambahkan parameter pada pemanggilan fungsi insertionSort. <p>
<img src="J5 - 5.4.3 (a).PNG"> <p>
> : <img src="J5 - 5.4.3 (b).PNG"> <p>
<img src="J5 - 5.4.3 (c).PNG"> <p>
<img src="J5 - 5.4.3 (d).PNG"> <p>

# 5.5 Latihan Praktikum
Sebuah yang bergerak dalam bidang penjualan tiket pesawat sedang mengembangkan backend untuk sistem pemesanan tiket, salah satu fiturnya adalah menampilkan daftar tiket yang tersedia berdasarkan pilihan filter yang diinginkan user. Daftar tiket ini harus dapat di sorting berdasarkan harga dimulai dari harga termurah ke harga tertinggi. Implementasikanlah class diagram berikut ini kedalam bahasa pemrograman java kemudian buatlah proses sorting data untuk harga tiket menggunakan algoritma bubble sort dan selection sort. <p>
<img src="J5 - 5.5 (a).PNG"> <p>


