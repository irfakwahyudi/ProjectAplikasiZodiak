package com.irfak.projectdikoding.activities;

import java.util.ArrayList;

public class ZodiakData {
    public static String[][] data = new String[][]{
            {"Aquarius","21 Januari - 18 Februari","https://4.bp.blogspot.com/-nCcldHy1AUo/W4K_bGyiBoI/AAAAAAAATWI/ZRvfXQupKyk9VpAKttizTPleCh1eeHiwQCEwYBhgL/s1600/zodiak%2Baquarius.JPG"},
            {"Pisces","19 Februari - 20 Maret","https://1.bp.blogspot.com/-OMRlxiKy1y4/W4K_eAUdIoI/AAAAAAAATXE/xNYpMSJxQrIBmrDOuYTFam4hMi-f1u8wQCEwYBhgL/s1600/zodiak%2Bpisces.JPG"},
            {"Aries", " 21 Maret - 19 April", "https://1.bp.blogspot.com/-Is8RMLg1Lhs/W4K_bdhfvAI/AAAAAAAATWM/NH71Ec84860qi0JMIjATd7qYzI7oy7anwCLcBGAs/s1600/zodiak%2Baries.JPG"},
            {"Taurus","20 April - 20 Mei","https://4.bp.blogspot.com/-qYbOoZ3FXe8/W4K_fNrzCzI/AAAAAAAATXI/TqAtNoZnQE4ZrMGg1JiolGAulsA_6bwrACEwYBhgL/s1600/zodiak%2Btaurus.JPG"},
            {"Gemini","21 Mei - 20 Juni","https://1.bp.blogspot.com/-k49tvFZZnhk/W4K_cxBTVoI/AAAAAAAATW0/h6h-9REMzac1zQh_3_sSgc9LIFuL597MQCEwYBhgL/s1600/zodiak%2Bgemini.JPG"},
            {"Cancer","21 Juni - 22 Juli","https://1.bp.blogspot.com/-g3ZgfFdebeA/W4K_bAbLBlI/AAAAAAAATW4/7Y1f2bxTJ-8UhsTZsa_21PoQ32FOYnVFACEwYBhgL/s1600/zodiak%2Bcancer.JPG"},
            {"Leo","23 Juli - 22 Agustus","https://2.bp.blogspot.com/-8IJ3xycZuPM/W4K_dLLdlmI/AAAAAAAATW8/hv1wawzP4uMQC8ieHdWnciP_zylCuP6UACEwYBhgL/s1600/zodiak%2Bleo.JPG"},
            {"Virgo","23 Agustus - 22 September","https://1.bp.blogspot.com/-3vImiA1KQiw/W4K_fmAMAHI/AAAAAAAATWw/3tjeMIBHeioGPf5Fzuz1w6GntTjezkREACEwYBhgL/s1600/zodiak%2Bvirgo.JPG"},
            {"Libra","23 September - 22 Oktober","https://1.bp.blogspot.com/-N3ZdLuYMXV4/W4K_dlHMUTI/AAAAAAAATXA/SLUK_TH4y6U-_o_GovxzOzsJlfbL8wEDQCEwYBhgL/s1600/zodiak%2Blibra.JPG"},
            {"Scorpio","23 Oktober - 21 November","https://4.bp.blogspot.com/-vX8gKGtYMf8/W4K_ezQijaI/AAAAAAAATXE/tYxGjk-1chYCpRSnBKhSeC-abF4wtcKKACEwYBhgL/s1600/zodiak%2Bscorpio.JPG"},
            {"Sagitarius"," 22 November - 21 Desember","https://2.bp.blogspot.com/-71j5P09hP28/W4K_eK882MI/AAAAAAAATWg/MdqQB1FDYmQku549JQzRyWIn2qEtVLbTQCEwYBhgL/s1600/zodiak%2Bsagitarius.JPG"},
            {"Capricorn","22 Desember - 20 Januari","https://2.bp.blogspot.com/-O84MpfcFdUY/W4K_chjKZeI/AAAAAAAATW4/TXp1xy9jQSg95qa5ZZPK_I6w7PqcQeBlwCEwYBhgL/s1600/zodiak%2Bcapricorn.JPG"}
    };
    public static ArrayList<Zodiak> getListData(){
        ArrayList<Zodiak> list = new ArrayList<>();
        for (String[] aData : data) {
            Zodiak zodiak = new Zodiak();
            Zodiak.setName(aData[0]);
            Zodiak.setDate(aData[1]);
            Zodiak.setPhoto(aData[2]);
            list.add(zodiak);
        }
        return list;
    }
}
