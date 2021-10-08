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
    fun addOffice(): ArrayList<Office> {
        val listOffice = ArrayList<Office>()
        for (i in 1..10) {
            listOffice.add(
                Office(
                    i,
                    "Alumnus $i",
                    "خِرِّيجٌ",
                    "هُوَ خِرِّيجٌ مِن جَامِعَةِ دَاتُو كَارَامَا الإِسلَامِيَّةِ الحُكُومِيَّةِ بَالُو",
                    "Dia Alumni UIN Datokarama Palu"
                )
            )
        }
        return listOffice
    }

    //campus
    fun addCampus(): ArrayList<Campus> {
        val listCampus = ArrayList<Campus>()
        for (i in 1..10) {
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
        }
        return listCampus
    }

    //market
    fun addMarket(): ArrayList<Market> {
        val listMarket = ArrayList<Market>()
        for (i in 1..10) {
            listMarket.add(
                Market(
                    i,
                    "Saya $i",
                    "أنا",
                    "انا اذهب للسوق",
                    "Saya Pergi Ke Pasar"
                )
            )
        }
        return listMarket
    }

    //hospital
    fun addHospital(): ArrayList<Hospital> {
        val listHospital = ArrayList<Hospital>()
        for (i in 1..10) {
            listHospital.add(
                Hospital(
                    i,
                    "Saya $i",
                    "أنا",
                    "أذهب إلى المستشفى",
                    "Saya Pergi Ke Rumah Sakit"
                )
            )
        }
        return listHospital
    }
}