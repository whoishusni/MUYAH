/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */
package id.husni.muyah.utils

import id.husni.muyah.data.source.local.entity.Campus
import id.husni.muyah.data.source.local.entity.Hospital
import id.husni.muyah.data.source.local.entity.Market
import id.husni.muyah.data.source.local.entity.Office

//BULK INSERT DATA
object AddDataHelper {
    //TODO: Office
    fun addOffice(): ArrayList<Office> {
        val listOffice = ArrayList<Office>()
        listOffice.add(
            Office(
                1,
                "Alumnus",
                "خِرِّيجٌ",
                "هُوَ خِرِّيجٌ مِن جَامِعَةِ دَاتُو كَارَامَا الإِسلَامِيَّةِ الحُكُومِيَّةِ بَالُو",
                "Dia Alumni UIN Datokarama Palu"
            )
        )
        return listOffice
    }

    //TODO: Campus
    fun addCampus(): ArrayList<Campus> {
        val listCampus = ArrayList<Campus>()
        listCampus.add(
            Campus(
                1,
                "Absen ",
                "غَائِبٌ",
                "كُنتُ غَائِبًا فِي دَرسِ اللًّغَةِ العَرَبِيَّةِ",
                "Aku absen pada mata kuliah Bahasa Arab"
            )
        )
        listCampus.add(
            Campus(
                2,
                "Alumnus",
                "خِرِّيجٌ",
                "هُوَ خِرِّيجٌ مِن جَامِعَةِ دَاتُو كَارَامَا الإِسلَامِيَّةِ الحُكُومِيَّةِ بَالُو",
                "Dia Alumni UIN Datokarama Palu"
            )
        )
        listCampus.add(
            Campus(
                3,
                "Aula/Auditorium",
                "قَاعَةٌ",
                "نَحنُ نَحضُرُ النَّدوَةَ العَالَمِيَّةَ فِي قَاعَةِ الجَامِعَةِ",
                "Kami menghadiri Seminar Internasional di gedung Audiotorium Kampus "
            )
        )
        listCampus.add(
            Campus(
                4,
                "Bangku",
                "مَقعَدٌ",
                "أَخَذتُ مَقعَدَ مِنَ الفَصلِ",
                "Aku telah mengambil bangku dari dalam kelas"
            )
        )
        listCampus.add(
            Campus(
                5,
                "Beasiswa",
                "المِنحَةُ الدِرَاسِيَّةُ",
                "نِلتُ المِنحَةَ الدِّرَاسِيَّةَ مِنَ الجَامِعَةِ",
                "Aku mendapatkan Beasiswa dari Kampus"
            )
        )
        listCampus.add(
            Campus(
                6,
                "Belajar",
                "تَعَلَّمَ : يَتَعَلَّمُ",
                "أَنَا أتَعَلَّمُ اللُّغَةَ العَرَبِيَّةَ ",
                "Aku belajar setiap hari"
            )
        )
        listCampus.add(
            Campus(
                7,
                "Berbicara",
                "تَكَلَّمَ : يَتَكَلَّمُ",
                "تَكَلَّمَنِي صَدِيقِي أَنَّهُ مَرِيضٌ",
                "Temanku mengatakan kepadaku bahwa ia sedang sakit"
            )
        )
        listCampus.add(
            Campus(
                8,
                "Berdiskusi",
                "تَنَاقَشَ : يَتَنَاقَشُ",
                "نَحنُ نَتَناَقَشُ عَن مَادَّةِ التَّعلِيمِ",
                "Kami berdiskusi tentang materi perkuliahan"
            )
        )
        listCampus.add(
            Campus(
                9,
                "Buku",
                "كِتَابٌ",
                "لِي كِتَابٌ جَدِيدٌ",
                "Aku memiliki sebuah buku yang baru"
            )
        )
        listCampus.add(
            Campus(
                10,
                "Debat",
                "مُنَاظَرَةٌ",
                "نَحنُ نُشَاهِدُ مُنَاظَرَةَ اللُّغَةِ العَرَبِيَّةِ",
                "Kami menyaksikan debat Bahasa Arab"
            )
        )
        listCampus.add(
            Campus(
                11,
                "Dekan",
                "عَمِيْدُ الكُلِّيَّةِ",
                "إلتَقَيتُ مَعَ عَمِيْدِ الكُلِّيَّةِ",
                "Aku telah berjumpa dengan Dekan"
            )
        )
        listCampus.add(
            Campus(
                12,
                "Disertasi",
                "أُطْرُوْحَةُ الدُّكتُورَاه",
                "إِنتَهَيتُ فِي كِتَابَةِ أُطْرُوْحَةِ الدُّكتُورَاه مُسرِعَةً",
                "Aku telah menyelesaikan penulisan Disertasi dengan cepat"
            )
        )
        listCampus.add(
            Campus(
                13,
                "Doktor",
                "الدُّكتُورُ",
                "عَمِيْدُ كُلِّيَّتُنَا إِسمُهُ الدُّكتُورُ حَملَانُ المَاجِستِير ",
                "Dekan kita bernama Dr. Hamlan, M.Ag"
            )
        )
        listCampus.add(
            Campus(
                14,
                "Fakultas",
                "كُلِّيَّةٌ",
                "هِيَ طَالِبَةٌ فِي كُلِّيَّةِ التَّربِيَةِ",
                "Dia Mahasiswi Fakultas Tarbiyah"
            )
        )
        listCampus.add(
            Campus(
                15,
                "IPK",
                "بَرنَامِجُ العَمَلِ العَالَمِي",
                "كَم نَتِيجَةَ بَرنَامِجِ عَمَلِ عَالَمِيِّكَ؟",
                "Berapakah nilai IPKmu?"
            )
        )
        listCampus.add(
            Campus(
                16,
                "Jurnal",
                "مَجَلَّةٌ",
                "أَنَا مُدِيرُ مَجَلَّةِ البَرِيقِ",
                "Aku pengelola Jurnal Al-Bariq"
            )
        )
        listCampus.add(
            Campus(
                17,
                "Jurusan",
                "قِسمٌ",
                "هَل أَنتَ طَالِبٌ فِي قِسمِ اللُّغَةِ العَرَبِيَّةِ؟",
                "Apakah kamu Mahasiswa PBA?"
            )
        )
        listCampus.add(
            Campus(
                18,
                "Kapur tulis",
                "طَبَاشِرٌ",
                "أَكتُبُ عَلَى السَّبُّورَةِ بِطَبَاشِرِ",
                "Aku menulis di papan tulis dengan menggunakan Kapur tulis"
            )
        )
        listCampus.add(
            Campus(
                19,
                "Kampus",
                "جَامِعَةٌ",
                "نَحنُ نَذهَبُ إِلَى الجَامِعَةِ فِي كُلِّ الصَبَاحِ",
                "Kami pergi ke kampus setiap hari"
            )
        )
        listCampus.add(
            Campus(
                20,
                "Kelas",
                "فَصلٌ",
                "نُنَظِّفُ الفَصلَ فِي كُلِّ الصَّبَاحِ",
                "Kami membersihkan kelas setiap pagi hari"
            )
        )
        listCampus.add(
            Campus(
                21,
                "Keluar",
                "خَرَجَ : يَخرُجُ",
                "هُوَ يَخرُجُ مِنَ الفَصلِ إِلَى الحَمَّامِ",
                "Dia keluar dari kelas menuju Toilet"
            )
        )
        listCampus.add(
            Campus(
                22,
                "Kertas",
                "وَرَقٌ",
                "هَل يَجُوزُ أَن أَطلُبَ مِنكَ الوَرَقَ؟",
                "Bolehkah aku meminta kertas darimu?"
            )
        )
        listCampus.add(
            Campus(
                23,
                "Ketua Prodi",
                "رَئِيسُ القِسْمِ",
                "أُقَدِّمُ مَوضُوعَ بَحثِي مَعَ رَئِيسِ قِسْمِ اللُّغَةِ العَرَبِيَّةِ",
                "Aku mengajukan judul penelitianku kepada Ketua Prodi PBA"
            )
        )
        listCampus.add(
            Campus(
                24,
                "Kurikulum",
                "مَنهَجُ التَّعلِيمِ",
                "تَغَيَّرَ مَنهَجُ التَّعلِيمِ فيِ كُلِّ السَّنَةِ ",
                "Kurikulum telah berganti setiap tahun"
            )
        )
        listCampus.add(
            Campus(
                25,
                "Kursi",
                "كُرسِيٌ",
                "نَحنُ نَجلِسُ عَلَى الكُرسِيِّ",
                "Kami duduk di atas Kursi"
            )
        )
        listCampus.add(
            Campus(
                26,
                "Laboratorium",
                "مَعمَلٌ",
                "فيِ الجَامِعَةِ مَعمَلٌ كَبِيرٌ",
                "Di kampus terdapat sebuah Laboratorium"
            )
        )
        listCampus.add(
            Campus(
                27,
                "Laboratorium Bahasa",
                "مَعمَلُ اللُّغَةِ",
                " قِسمُ تَعلِيمِ اللُّغَةِ العَرَبِيَةِ لَهَا مَعمَلُ اللُّغَة",
                "Prodi Pendidikan Bahasa Arab memiliki sebuah Laboratorium Bahasa"
            )
        )
        listCampus.add(
            Campus(
                28,
                "Laboratorium Komputer",
                "مَعمَلُ الكُمبِـيُوْتِرِ",
                "فيِ الجَامِعَةِ مَعمَلُ الكُمبِـيُوْتِرِ",
                "Di kampus terdapat sebuah Laboratorium Komputer"
            )
        )
        listCampus.add(
            Campus(
                29,
                "Magister",
                "مَاجِستِير",
                "لَقَّبَنِي رَئِيسُ الجَامِعَةِ بمَاجِستِير قبل التَّخَرُّجِ",
                "Rektor memberiku gelar Magister sebelum kelulusan"
            )
        )
        listCampus.add(
            Campus(
                30,
                "Mahasiswa",
                "طَالِبٌ",
                "أَنَا طَالِبٌ نَشِيطٌ",
                "Aku seorang Mahasiswa yang penuh semangat"
            )
        )
        listCampus.add(
            Campus(
                31,
                "Mahasiswi",
                "طَالِبَةٌ\n",
                "أَنتِ طَالِبَةٌ نَشِيطَةٌ",
                "Kamu seorang Mahasiswa yang penuh semangat"
            )
        )
        listCampus.add(
            Campus(
                32,
                "Makalah",
                "مَقَالَةٌ",
                "كُنَّا بَاحِثِينَ فِي هذَا اليَومِ",
                "Kami menjadi pemateri di hari ini"
            )
        )
        listCampus.add(
            Campus(
                33,
                "Masuk",
                "دَخَلَ : يَدخُلُ",
                "دَخَلَ عُثمَانُ الفَصلَ",
                "Usman telah memasuki kelas"
            )
        )
        listCampus.add(
            Campus(
                34,
                "Meja",
                "مَكتَبٌ",
                "نَحنُ نَكتُبُ عَلَى المَكتَبِ",
                "Kami menulis di atas meja"
            )
        )
        listCampus.add(
            Campus(
                35,
                "Meminjam",
                "إِستَعَرَ : يَستَعِرُ",
                "ياَ أَخِي أَستَعِرُ سَيَّارَتَكَ",
                "Wahai saudaraku, aku ingin meminjam mobilmu"
            )
        )
        listCampus.add(
            Campus(
                36,
                "Meminta Izin",
                "إِستَأذَنَ : يَستَأذِنُ",
                "إِستَأذَنَ أَحمَدُ المُحَاضِرَ",
                "Ahmad meminta izin kepada Dosen"
            )
        )
        listCampus.add(
            Campus(
                37,
                "Mengajar",
                "عَلَّمَ : يُعَلِّمُ",
                "المُحَاضِرُ يُعَلِّمُنِي الدَّرسَ",
                "Dosen mengajariku sebuah pelajaran"
            )
        )
        listCampus.add(
            Campus(
                38,
                "Mengerti",
                "فَهِمَ : يَفهَمُ",
                "أَنَا أَفهَمُ جَمِيعُ الدُّرُوسِ",
                "Aku memahami semua pelajaran"
            )
        )
        listCampus.add(
            Campus(
                39,
                "Menghadiri",
                "حَضَرَ : يَحضُرُ",
                "حَضَرَ المُحَاضِرُ فِي الفَصلِ",
                "Dosen telah hadir di dalam kelas"
            )
        )
        listCampus.add(
            Campus(
                40,
                "Menghafal",
                "حَفِظَ : يَحفَظُ",
                "حَفِظتُ المُفرَدَاتِ كَثِيرَةِ",
                "Aku telah menghafal banyak kosakata"
            )
        )
        listCampus.add(
            Campus(
                41,
                "Negeri",
                "الحُكُومِيَّةُ",
                "جَامِعَةُ دَاتُو كَارَامَا الإِسلَامِيَّةُ الحُكُومِيَّةُ بَالُو",
                "Universitas Islam Negeri Datokarama Palu"
            )
        )
        listCampus.add(
            Campus(
                42,
                "Papan Pengumuman",
                "لَوحَةُ الإعلَانَاتِ",
                "الأَخبَارُ مَكتُوبٌ فِي لَوحَةِ الإعلَانَاتِ",
                "Informasi tertulis di papan pengumuman"
            )
        )
        listCampus.add(
            Campus(
                43,
                "Papan tulis",
                "سَبُّورَةٌ",
                "تِلكَ سَبُّورَةٌ",
                "Itu sebuah Papan tulis"
            )
        )
        listCampus.add(
            Campus(
                44,
                "Pemateri",
                "باَحِثٌ، مُقَدِّمٌ",
                "مَن سَيَكُونُ بَاحِثاً الأَنَ؟",
                "Sekarang siapa yang ingin menjadi Pemateri?"
            )
        )
        listCampus.add(
            Campus(
                45,
                "Perpustakaan",
                "مَكتَبَةٌ",
                "أَناَ أَبحَثُ الكُتُبَ في المَكتَبَةِ",
                "Aku mencari buku di Perpustakaan"
            )
        )
        listCampus.add(
            Campus(
                46,
                "Polpen",
                "قَلَمٌ",
                "هَل عِندَكَ قَلَمٌ؟",
                "Apakah kamu memiliki Polpen?"
            )
        )
        listCampus.add(
            Campus(
                47,
                "Profesor\n",
                "اُستَاذٌ\n",
                "هُوَ الأُستَاذُ الدُّكتُورُ جَعفَرُ الصٍّدِّيقُ المَاجِستِير",
                "Beliau adalah Prof. Dr. Jafar Sidik, M.Pd"
            )
        )
        listCampus.add(
            Campus(
                48,
                "Proposal",
                "إِقتِرَاحٌ",
                "مُنَاقَشَةُ الإِقتِرَاحِ",
                "Ujian seminar Proposal"
            )
        )
        listCampus.add(
            Campus(
                49,
                "Rektor",
                "رَئِيسُ الجَامِعَةِ",
                "نَحنُ لَا نَنتَظِر إِنتِخَابُ رَئِيسِ الجَامِعَةِ",
                "Kami tidak menantikan pemilihan Rektor"
            )
        )
        listCampus.add(
            Campus(
                50,
                "RPP/RPS",
                "إِعدَادُ التَّدرِيسِ",
                "صَنَعتُ إِعدَادَ التَّدرِيسِ",
                "Aku telah membuat RPP/RPS"
            )
        )
        return listCampus
    }

    // TODO: market
    fun addMarket(): ArrayList<Market> {
        val listMarket = ArrayList<Market>()
        listMarket.add(
            Market(
                1,
                "Agen",
                "وَكِيلٌ",
                "نَحنُ أَحَدٌ مِن وَكِيلِ التَّغيِيرِ",
                "Kita adalah bagian dari Agen Perubahan"
            )
        )
        listMarket.add(
            Market(
                2,
                "Alat Penakar",
                "مِكيَالُ",
                "أَنَا أَستَعمِلُ المِكيَالَ فيِ المَطبَخِ",
                "Aku menggunakan Alat penakar di dapur"
            )
        )
        listMarket.add(
            Market(
                3,
                "Anggaran Belanja",
                "مِيزَانِيَّةٌ",
                "أَنَا أَصنَعُ المِيزَانِيَّةَ كُلَّ الشَّهرِ",
                "Aku membuat Anggaran belanja di setiap bulan"
            )
        )
        listMarket.add(
            Market(
                4,
                "Barang Impor",
                "اِستِيرَادُ",
                "إِشتَرَيتُ الإِستِيرَادَ",
                "Aku telah membeli barang Impor"
            )
        )
        listMarket.add(
            Market(
                5,
                "Barang Selundupan",
                "البَضَائِعُ المُهَرَّبَةُ",
                "كاَدَ يَشتَرِي البَضَائِعَ المُهَرَّبَةَ\n",
                "Dia hampir saja membeli barang selundupan"
            )
        )
        listMarket.add(
            Market(
                6,
                "Barter",
                "مُبَادَلةٌ",
                "هَل تُرِيدُ المُبَادَلَةَ مَعِي؟",
                "Apakah kamu ingin melakukan barter denganku?"
            )
        )
        listMarket.add(
            Market(
                7,
                "Bawang Merah",
                "بَصَلٌ",
                "كاَدَت لَا تَشتَرِي البَصَلَ فيِ السُّوقِ",
                "Dia (Pr) hampir saja tidak membeli bawang merah di pasar"
            )
        )
        listMarket.add(
            Market(
                8,
                "Bawang Putih",
                "ثُومٌ",
                "هَل تُحِبِّينَ الثُّومَ ؟",
                "Apakah kamu (Pr) menyukai Bawang Putih?"
            )
        )
        listMarket.add(
            Market(
                9,
                "Belanja/Shopping",
                "تَسَوُّقُ",
                "هِوَايَتِي تَسَوُّقٌ",
                "Hobiku adalah berbelanja"
            )
        )
        listMarket.add(
            Market(
                10,
                "Beli",
                "شِرَاءُ",
                "رَكِّز عَلَى الشِّرَاءِ !",
                "Konsentrasilah ketika membeli !"
            )
        )
        listMarket.add(
            Market(
                11,
                "Beras",
                "رُزٌّ",
                "أَنَا أَقلِي الرُّزَّ",
                "Aku menggoreng Nasi"
            )
        )
        listMarket.add(
            Market(
                12,
                "Buah-buahan",
                "ثَمَرَاتُ",
                "أَعطَيتُ الثَّمَرَاتِ إِلَيهِم",
                "Aku telah memberikan Buah-buahan kepada mereka"
            )
        )
        listMarket.add(
            Market(
                13,
                "Cabai, Rica, Lada",
                "فِلفِلٌ",
                "هَل يُوجَدُ الفِلفِلُ ؟",
                "Apakah ada rica?"
            )
        )
        listMarket.add(
            Market(
                14,
                "Cicil",
                "تَسقِيطٌ",
                "هَل مُمكِنُ التَّسقِيطُ؟",
                "Bisakah dicil?"
            )
        )
        listMarket.add(
            Market(
                15,
                "Dagangan, Komoditi",
                "بِضَاعَةٌ/سِلْعَةٌ",
                "أَبِي يَبِيعُ البِضَاعَةَ الكَثِيرَةَ",
                "Ayahku menjual barang dagangan yang banyak"
            )
        )
        listMarket.add(
            Market(
                16,
                "Daging",
                "لَحمٌ",
                "حَرَّمَ اللهُ لَحمَ الخِنزِيرِ",
                "Allah SWT. Telah mengharamkan Daging Bagi"
            )
        )
        listMarket.add(
            Market(
                17,
                "Diskon",
                "تَخفِيضُ / خَصمٌ",
                "هَل يُوجَدُ التَخفِيضُ ؟",
                "Apakah ada diskonnya?"
            )
        )
        listMarket.add(
            Market(
                18,
                "Dompet",
                "مَحفَظَةُ النُّقُودِ",
                "لِي مَحفَظَةُ النُّقُودِ",
                "Aku memiliki sebuah Dompet"
            )
        )
        listMarket.add(
            Market(
                19,
                "Export",
                "صَّادِرَاتُ",
                " تَحتَاجُ إِندُونِيسِيَا إِلَى زِيَادَةِ الصَّادِرَاتِ إِلى اليَبَن",
                "Indonesia menginginkan penambahan Ekspor ke Jepang"
            )
        )
        listMarket.add(
            Market(
                20,
                "Garansi",
                "ضَمَّانُ",
                "عِندِي الحَاسُوْبُ المَحْمُوْلُ مَعَ بِطَاقَةِ ضَّمَانِهِ",
                "Aku mempunyai Laptop beserta kartu garansinya"
            )
        )
        listMarket.add(
            Market(
                21,
                "Gula",
                "سُكَّرٌ",
                "أَينَ وَضَعتَ الشُكَّرَ؟",
                "Di manakah kamu menaruh Gula?"
            )
        )
        listMarket.add(
            Market(
                22,
                "Harga",
                "ثَمَنٌ/سِعْرٌ",
                "بِكَم ثَمَنَهُ؟",
                "Berapakah harganya?"
            )
        )
        listMarket.add(
            Market(
                23,
                "Harga Asli",
                "الثَّمَنُ الأَصلِيُ",
                "لَا تُكَذِّبُنِي، هَل هذَا الثَّمَنُ الأَصلِيُّ ؟",
                "Jangan membohongiku, apakah ini harga asli?"
            )
        )
        listMarket.add(
            Market(
                24,
                "Hutang",
                "دَينٌ",
                "مَتَى تُسَوِّي دَينَكَ ؟",
                "Kapan kamu melunasi hutangmu?"
            )
        )
        listMarket.add(
            Market(
                25,
                "Ikan",
                "سَمَكٌ",
                "أَكَلتُ السَّمَكَ",
                "Aku telah memakan Ikan"
            )
        )

        return listMarket
    }

    //TODO: Hospital
    fun addHospital(): ArrayList<Hospital> {
        val listHospital = ArrayList<Hospital>()
        listHospital.add(
            Hospital(
                1,
                "Alkohol",
                "كُحُولٌ",
                "الطَّبِيبُ يُعطِينِي الكُحُول",
                "Dokter itu memberikanku Alkohol"
            )
        )
        listHospital.add(
            Hospital(
                2,
                "Apotek",
                "صَيدَلِيَّةٌ",
                "الصَيدَلِيُّ يَعمَلُ  في الصَيدَلِيَّةِ",
                "Apoteker itu bekerja di Apotek"
            )
        )
        listHospital.add(
            Hospital(
                3,
                "Apoteker",
                "صَيدَلِيٌّ",
                "ذَهَبَ الصَيدَلِيُّ إِلَى الصَيدَلِيَّةِ",
                "Apoteker itu pergi ke Apotek"
            )
        )
        listHospital.add(
            Hospital(
                4,
                "Bangsal Rumah Sakit",
                "جَنَاحٌ المُستَشفَى ",
                "زُرتُ إِلَى جَنَاحِ المُستَشفَى ",
                "Aku telah mengunjungi Bangsal Rumah Sakit"
            )
        )
        listHospital.add(
            Hospital(
                5,
                "Batuk",
                "سُعَالٌ",
                "لِمَاذَ أَصَابَهُ السُّعَال ؟",
                "Mengapa dia batuk?"
            )
        )
        listHospital.add(
            Hospital(
                6,
                "Berdarah",
                "نَزِيفٌ",
                "سَاعِدنِي، رَأسِي نَزِيفٌ",
                "Tolong Aku, Kepalaku berdarah"
            )
        )
        listHospital.add(
            Hospital(
                7,
                "Bidan",
                "قَابِلَةٌ",
                " القَابِلَةُ تُسَاعِدُ الوِلَادَةَ",
                "Bidan itu membantu persalinan"
            )
        )
        listHospital.add(
            Hospital(
                8,
                "Demam",
                "حُمَّى",
                "أَصَابَنِي الحُمَّى",
                "Aku terkena Demam"
            )
        )
        listHospital.add(
            Hospital(
                9,
                "Diare",
                "إِسهَالٌ",
                "هَل أَصَابَكِ الإِسهَال ؟",
                "Apakah kamu terserang Diare?"
            )
        )
        listHospital.add(
            Hospital(
                10,
                "Dokter",
                "طَبِيبٌ \\ طَبِيبَةٌ",
                "الطَّبِيبُ يَفحَصُ المَرضَى",
                "Dokter itu memeriksa Pasien"
            )
        )
        listHospital.add(
            Hospital(
                11,
                "Dokter Gigi",
                "طَبِيبُ الأَسنَانِ",
                "أَنَا أَخَافُ إِلَى طَبِيبِ الأَسنَانِ",
                "Aku takut pergi ke Dokter Gigi"
            )
        )
        listHospital.add(
            Hospital(
                12,
                "Dokter THT",
                "طَبِيبُ الْأَنفِ وَ الْأُذُنِ وَالْحَنجَرَةِ",
                "لاَزِم أَن تَذهَبَ إِلَى طَبِيبِ الْأَنفِ وَ الْأُذُنِ وَالْحَنجَرَةِ",
                "Kamu harus pergi ke Dokter THT"
            )
        )
        listHospital.add(
            Hospital(
                13,
                "Dosis Obat",
                "جَرعَةٌ",
                "كَم جَرعَةً لِهذِهِ الدَّوَاءِ ؟",
                "Berapakah Dosis obat ini?"
            )
        )
        listHospital.add(
            Hospital(
                14,
                "Flu",
                "زُكَّامٌ",
                "أَعرَاضُ الكُورُونَا الزُّكَّامُ وَ السُعَالُ",
                "Gejala Covid-19 yaitu Flu dan Batuk"
            )
        )
        listHospital.add(
            Hospital(
                15,
                "Infus",
                "تَسرِيبٌ",
                "هُوَ يَحتَاجُ التَّسرِيبَ",
                "Dia membutuhkan Infus"
            )
        )
        listHospital.add(
            Hospital(
                16,
                "Kain kasa",
                "شَاش",
                "هَل عِندَكَ الشَّاش؟",
                "Apakah kamu memilili Kain Kasa?"
            )
        )
        listHospital.add(
            Hospital(
                17,
                "Kanker Paru",
                "سَرَطَانُ الرِّئَةِ",
                " أَبَي يَمُوتُ بَعدَ أَصَابَهُ سَرَطَان الرِّئَةِ",
                "Ayahku wafat setelah terkena Kanker Paru-paru"
            )
        )
        listHospital.add(
            Hospital(
                18,
                "Kapas",
                "قُطنٌ",
                "لِي قُطنٌ ثَخِينٌ",
                "Aku memiliki Kapas yang tebal"
            )
        )
        listHospital.add(
            Hospital(
                19,
                "Kencing Manis",
                "السُّكَّرِيُّ",
                "إِيَاكَ أَنِ السُّكَّرِيَّ !",
                "Waspadalah terhadap penyakit kencing Manis"
            )
        )
        listHospital.add(
            Hospital(
                20,
                "Keracunan\n",
                "تَسَمُّمٌ",
                "أَصَابَهُم تَسَمُّم الطًّعَامِ",
                "Meraka terkena keracunan Makanan"
            )
        )
        listHospital.add(
            Hospital(
                21,
                "Kotak Obat/P3K",
                "صُندُوْقُ الإِسعَافِ",
                "لاَزِم أَن تَحمِلَ صُندُوْق الإِسعَافِ حَيثُ مَا كُنتَ",
                "Kamu harus selalu membawa Kotak Obat/P3K di manapun kamu berada"
            )
        )
        listHospital.add(
            Hospital(
                22,
                "Labolatorium",
                "مُختَبَرٌ",
                "المُختَبَرُ كَبِيرٌ",
                "Laboratorium itu Besar"
            )
        )
        listHospital.add(
            Hospital(
                23,
                "Luka",
                "جُرحٌ",
                "كَيفَ يُعَالِجُ جُرحِي ؟",
                "Bagaimana Dia akan mengobati Lukaku?"
            )
        )
        listHospital.add(
            Hospital(
                24,
                "Malaria",
                "مَلَاريَا",
                "انتَشَرَ المَلَاريَا إِلىَ الوِلاَيَاتِ",
                "Penyakit Malaria menyebar ke berbagai Wilayah"
            )
        )
        listHospital.add(
            Hospital(
                25,
                "Masker",
                "كِمَامَةٌ",
                "النَّاسُ يَحتَاجُونَ الكِمَامَةَ فِي عَصرِ الجَائِحَةِ",
                "Semua orang membutuhkan Masker pada Masa Pandemi"
            )
        )
        return listHospital
    }
}