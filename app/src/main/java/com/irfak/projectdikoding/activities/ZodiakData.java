package com.irfak.projectdikoding.activities;

import java.util.ArrayList;

public class ZodiakData {
    private static String[] zodiakName = {
            "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagitarius", "Capricorn" };
    public static String[] zodiakDate = {
            "21 Januari - 18 Februari",
            "19 Februari - 20 Maret",
            "21 Maret - 19 April",
            "20 April - 20 Mei",
            "21 Mei - 20 Juni",
            "21 Juni - 22 Juli",
            "23 Juli - 22 Agustus",
            "23 Agustus - 22 September",
            "23 September - 22 Oktober",
            "23 Oktober - 21 November",
            "22 November - 21 Desember",
            "22 Desember - 20 Januari"
            };
    private  static String [] zodiakImage = {
        "https://4.bp.blogspot.com/-nCcldHy1AUo/W4K_bGyiBoI/AAAAAAAATWI/ZRvfXQupKyk9VpAKttizTPleCh1eeHiwQCEwYBhgL/s1600/zodiak%2Baquarius.JPG",
        "https://1.bp.blogspot.com/-OMRlxiKy1y4/W4K_eAUdIoI/AAAAAAAATXE/xNYpMSJxQrIBmrDOuYTFam4hMi-f1u8wQCEwYBhgL/s1600/zodiak%2Bpisces.JPG",
        "https://1.bp.blogspot.com/-Is8RMLg1Lhs/W4K_bdhfvAI/AAAAAAAATWM/NH71Ec84860qi0JMIjATd7qYzI7oy7anwCLcBGAs/s1600/zodiak%2Baries.JPG",
        "https://4.bp.blogspot.com/-qYbOoZ3FXe8/W4K_fNrzCzI/AAAAAAAATXI/TqAtNoZnQE4ZrMGg1JiolGAulsA_6bwrACEwYBhgL/s1600/zodiak%2Btaurus.JPG",
        "https://1.bp.blogspot.com/-k49tvFZZnhk/W4K_cxBTVoI/AAAAAAAATW0/h6h-9REMzac1zQh_3_sSgc9LIFuL597MQCEwYBhgL/s1600/zodiak%2Bgemini.JPG",
        "https://1.bp.blogspot.com/-g3ZgfFdebeA/W4K_bAbLBlI/AAAAAAAATW4/7Y1f2bxTJ-8UhsTZsa_21PoQ32FOYnVFACEwYBhgL/s1600/zodiak%2Bcancer.JPG",
        "https://2.bp.blogspot.com/-8IJ3xycZuPM/W4K_dLLdlmI/AAAAAAAATW8/hv1wawzP4uMQC8ieHdWnciP_zylCuP6UACEwYBhgL/s1600/zodiak%2Bleo.JPG",
        "https://1.bp.blogspot.com/-3vImiA1KQiw/W4K_fmAMAHI/AAAAAAAATWw/3tjeMIBHeioGPf5Fzuz1w6GntTjezkREACEwYBhgL/s1600/zodiak%2Bvirgo.JPG",
        "https://1.bp.blogspot.com/-N3ZdLuYMXV4/W4K_dlHMUTI/AAAAAAAATXA/SLUK_TH4y6U-_o_GovxzOzsJlfbL8wEDQCEwYBhgL/s1600/zodiak%2Blibra.JPG",
        "https://4.bp.blogspot.com/-vX8gKGtYMf8/W4K_ezQijaI/AAAAAAAATXE/tYxGjk-1chYCpRSnBKhSeC-abF4wtcKKACEwYBhgL/s1600/zodiak%2Bscorpio.JPG",
        "https://2.bp.blogspot.com/-71j5P09hP28/W4K_eK882MI/AAAAAAAATWg/MdqQB1FDYmQku549JQzRyWIn2qEtVLbTQCEwYBhgL/s1600/zodiak%2Bsagitarius.JPG",
        "https://2.bp.blogspot.com/-O84MpfcFdUY/W4K_chjKZeI/AAAAAAAATW4/TXp1xy9jQSg95qa5ZZPK_I6w7PqcQeBlwCEwYBhgL/s1600/zodiak%2Bcapricorn.JPG"
    };
    static ArrayList<Zodiak> getListData() {
        ArrayList <Zodiak> list = new ArrayList<>();
        for (int position = 0; position < zodiakName.length; position++) {
            Zodiak hero = new Zodiak();
            hero.setName(zodiakName[position]);
            hero.setDate(zodiakDate[position]);
            hero.setPhoto(zodiakImage[position]);
            list.add(hero);
        }
        return list;
    }
}
