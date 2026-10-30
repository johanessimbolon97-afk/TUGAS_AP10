## TP10 — Character Manager Sprint #4 (Theming & MVC Properties)

### 📸 Screenshot Perbandingan Tampilan
1. Screenshot 2026-10-22 174343.png
2. Screenshot 2026-10-22 024003.png

### 🎨 Alasan Arsitektur MVC pada Pengaturan Warna
Warna dan aspek visual disimpan di `AppTheme` (`view`) dan **bukan** sebagai atribut pada class `Character` (`model`) untuk menjaga **pola pemisahan tanggung jawab MVC**. Class `Character` murni bertanggung jawab mengelola state dan logika domain bisnis karakter (seperti level, nama, dan perhitungan status). Jika `Character` mengimpor library Swing/AWT (`java.awt.Color`), layer Model akan terikat kuat (*tightly coupled*) pada framework GUI desktop. Hal ini membuat layer Model sulit diuji (*unit testing*) secara independen dan menghambat migrasi jika aplikasi di masa depan beralih ke platform lain (seperti CLI, Android, atau web).

### ⚙️ Dua Properti Tambahan yang Dipilih
1. **Border Khusus Per Role (`BorderFactory.createCompoundBorder`)**:
   - **Alasan**: Memberikan penanda visual berupa garis tepi dengan warna aksen yang lebih terang di sekeliling kartu karakter, dikombinasikan dengan *empty padding* di dalam. Hal ini mempertegas batas antar-kartu dan meningkatkan pembacaan hirarki visual per *role*.
2. **Tooltip Rich-Text Dinamis (`setToolTipText`)**:
   - **Alasan**: Menampilkan pop-up informasi detail saat kursor melayang (*hover*) di atas kartu karakter, mencakup deskripsi peranan *role* dan rincian HP/ATK. Ini memberikan konteks tambahan bagi pengguna tanpa membuat tampilan kartu utama menjadi terlalu sesak (*cluttered*).

### 🔗 Link Google Docs Dokumen Analisis (Bagian D)
- **Dokumen Analisis**: (https://docs.google.com/document/d/1AfA3JyKCzhZSw6CzftOC1YMK4b1E9erEm0JXKds3WIc/edit?usp=sharing)

