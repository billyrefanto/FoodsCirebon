package com.dicoding.foodskhascirebon.model

import com.dicoding.foodskhascirebon.R

object FoodsData {
    private val foodNames = arrayOf(
        "Docang",
        "Empal Gentong",
        "Mie Koclok",
        "Nasi Lengko",
        "Empal Asam",
        "Sate Kalong",
        "Tahu Gejrot",
        "Rujak Kangkung",
        "Bubur Sop Ayam",
        "Pedesan Entog"
    )

    private val foodDetails = arrayOf(
        "Docang umumnya terdiri dari lontong, daun singkung, tauge, parutan kelapa dan juga kerupuk diatasnya. Penasaran dengan bagaimana rasanya? Anda bisa membuktikan sendiri saat mampir di Cirebon. Bukan bermaksud memberi spoiler, rasa kuah Docang sangat gurih dan segar",
        "kuliner ini menggunakan sebuah kuali yang berasal dari bahan tanah liat. Seperti namanya, Empal Gentong dibuat dari daging sapi yang dimasak hingga memberikan daging yang bertekstur lembut sehingga memudahkan kita untuk mengkonsumsinya",
        "Mie ini, disajikan dengan ayam suwir, irisan telur, tauge, dan tambahan daun bawang. Kuahnya yang putih dan kental, akan menambah cita rasa Mie Koclok. Tak perlu lagi untuk menggambarkan rasanya",
        "menggunakan beragam sayuran. Selain itu, adanya guyuran sambal kacang membuat citarasa Nasi Lengko menjadi beragam, tak terkecuali rasa gurih. Jika Anda berpikir tentang pecel, bisa dibilang Nasi Lengko adalah pecelnya orang Cirebon",
        "citarasa dari makanan khas di Cirebon ini memiliki rasa yang asam, namun segar di mulut kita. Bahan utama yang menciptakan rasa asam di kuliner yang satu ini adalah adanya belimbing wuluh.",
        "sate ini dinamakan Sate Kalong adalah aktivitas penjualnya yang hanya dilakukan di malam hari Karena itulah masyarakat menyebut makanan khas ini sebagai Sate Kalong. Namun, tidak serta unik gara-gara namanya saja, ternyata daging yang digunakan untuk membuat sate ini adalah daging kerbau. Berbeda dengan citarasa dari sate yang lain, Sate Kalong memiliki rasa yang manis. Untuk Anda pecinta pedas, Anda bisa juga mencocol sate kerbau dari Cirebon ini dengan sambal merah.",
        "Makanan khas yang bisa dianggap sebagai makanan ringan ini, diguyur dengan bumbu yang berasal dari campuran bawang putih, bawang merah, gula merah, dan juga cabai yang dihaluskan. Jika Anda penasaran dengan Tahu Gejrot, Anda bisa mencobanya saat mampir di kota Cirebon",
        "bahan utama yang digunakan adalah sayur kangkung. Kangkung direbus dan disiram dengan bumbu rujak yang telah dicampur dengan terasi udang khas Cirebon, Meskipun terlihat mirip dengan plecing kangkung, namun Rujak Kangkung dari Cirebon ini berbeda. Warna sambal yang disiram berwarna merah, tidak seperti plecing kangkung yang dikonsumsi dengan sambal kacang. Jika Anda mengonsumsi Rujak Kangkung, Anda juga bisa menambahkan kerupuk khas yang berasal dari Cirebon",
        "kuliner ini disajikan dengan menyiram kuah sop ayam ke bubur. Bubur yang digunakan berbeda dengan bubur ayam, tapi bisa dibilang seperti nasi tim. Sop ayam yang disiramkan juga ada sayur, ayam suwir, dan krupuknya. Selain itu, ada juga tambahan irisan tomat juga akan menambah citarasa dari Bubur Sop Ayam ini",
        "Entog memang terkenal enak jika dijadikan sebagai bahan untuk menciptakan makanan lezat, tak terkecuali dengan Pedesan Entog. Di sini, daging entog disiram dengan kuah yang gurih dan pedas,Kuliner khas dari Cirebon ini, akan mampu memberikan rasa yang sangat memanjakan lidah Anda. Untuk Anda yang tidak terlalu suka dengan makanan pedas, Anda bisa meminta Pedesan Entog yang tidak terlalu pedas."

    )

    private val heroesImages = intArrayOf(
        R.drawable.docang,
        R.drawable.empal_gentong,
        R.drawable.mie_koclok,
        R.drawable.nasi_lengko,
        R.drawable.empal_asem,
        R.drawable.sate_kalong,
        R.drawable.tahu_gejrot,
        R.drawable.rujak_kangkung,
        R.drawable.bubur_sop_ayam,
        R.drawable.pedesan_entog
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val hero = Food()
                hero.name = foodNames[position]
                hero.detail = foodDetails[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }
}