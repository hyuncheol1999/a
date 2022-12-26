package com.example.myapplication44;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class map extends AppCompatActivity
        implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.MAP);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {

        mMap = googleMap;

        LatLng no1 = new LatLng(35.823525,127.140598);
        LatLng no2 = new LatLng(35.817062,127.148060);
        LatLng no3 = new LatLng(35.824390,127.158340);
        LatLng no4 = new LatLng(35.809180,127.134811);
        LatLng no5 = new LatLng(35.802505,127.158272);
        LatLng no6 = new LatLng(35.793326,127.152561);
        LatLng no7 = new LatLng(35.814783,127.134363);
        LatLng no8 = new LatLng(35.817705,127.122236);
        LatLng no9 = new LatLng(35.832341,127.115854);
        LatLng no10 = new LatLng(35.795450,127.139484);
        LatLng no11 = new LatLng(35.785250,127.134827);
        LatLng no12 = new LatLng(35.796899,127.120429);
        LatLng no13 = new LatLng(35.785905,127.100031);
        LatLng no14 = new LatLng(35.796268,127.080686);
        LatLng no15 = new LatLng(35.805966,127.122852);
        LatLng no16 = new LatLng(35.805782,127.099220);
        LatLng no17 = new LatLng(35.824707,127.096516);
        LatLng no18 = new LatLng(35.817669,127.101531);
        LatLng no19 = new LatLng(35.829622,127.093284);
        LatLng no20 = new LatLng(35.827984,127.134031);
        LatLng no21 = new LatLng(35.832647,127.159769);
        LatLng no22 = new LatLng(35.842294,127.147535);
        LatLng no23 = new LatLng(35.827898,127.161203);
        LatLng no24 = new LatLng(35.845318,127.120647);
        LatLng no25 = new LatLng(35.837423,127.133120);
        LatLng no26 = new LatLng(35.838585,127.143081);
        LatLng no27 = new LatLng(35.853657,127.106218);
        LatLng no28 = new LatLng(35.816786,127.198479);
        LatLng no29 = new LatLng(35.832748,127.170416);
        LatLng no30 = new LatLng(35.863625,127.149632);
        LatLng no31 = new LatLng(35.859905,127.126133);
        LatLng no32 = new LatLng(35.871638,127.122106);
        LatLng no33 = new LatLng(35.874521,127.069241);
        LatLng no34 = new LatLng(35.867937,127.085086);
        LatLng no35 = new LatLng(35.832386,127.061277);
        LatLng no36 = new LatLng(35.905719,126.690947);
        LatLng no37 = new LatLng(35.940927,126.740228);
        LatLng no38 = new LatLng(35.902136,126.760029);
        LatLng no39 = new LatLng(35.972277,126.859639);
        LatLng no40 = new LatLng(36.000472,126.879198);
        LatLng no41 = new LatLng(35.936447,126.831007);
        LatLng no42 = new LatLng(35.960587,126.786076);
        LatLng no43 = new LatLng(36.000495,126.790589);
        LatLng no44 = new LatLng(36.028514,126.833266);
        LatLng no45 = new LatLng(35.878781,126.379839);
        LatLng no46 = new LatLng(35.911882,126.631730);
        LatLng no47 = new LatLng(35.989746,126.707026);
        LatLng no48 = new LatLng(35.984452,126.705050);
        LatLng no49 = new LatLng(35.980073,126.703492);
        LatLng no50 = new LatLng(35.976752,126.712250);
        LatLng no51 = new LatLng(35.985488,126.718462);
        LatLng no52 = new LatLng(35.978601,126.715779);
        LatLng no53 = new LatLng(35.972777,126.741064);
        LatLng no54 = new LatLng(35.980424,126.731229);
        LatLng no55 = new LatLng(35.982264,126.751969);
        LatLng no56 = new LatLng(35.967433,126.761027);
        LatLng no57 = new LatLng(35.964180,126.717354);
        LatLng no58 = new LatLng(35.966794,126.694807);
        LatLng no59 = new LatLng(35.965175,126.699212);
        LatLng no60 = new LatLng(35.958803,126.689285);
        LatLng no61 = new LatLng(35.971045,126.623614);
        LatLng no62 = new LatLng(35.959238,126.656886);
        LatLng no63 = new LatLng(36.061415,126.964369);
        LatLng no64 = new LatLng(35.937456,126.899693);
        LatLng no65 = new LatLng(36.017106,126.938213);
        LatLng no66 = new LatLng(36.040079,126.905092);
        LatLng no67 = new LatLng(36.093200,126.891541);
        LatLng no68 = new LatLng(36.095854,126.929670);
        LatLng no69 = new LatLng(36.122172,126.955374);
        LatLng no70 = new LatLng(36.060421,127.020892);
        LatLng no71 = new LatLng(36.118343,127.026194);
        LatLng no72 = new LatLng(36.051286,127.091193);
        LatLng no73 = new LatLng(36.007198,127.041705);
        LatLng no74 = new LatLng(35.973280,127.083938);
        LatLng no75 = new LatLng(35.926747,127.023440);
        LatLng no76 = new LatLng(36.020404,126.993529);
        LatLng no77 = new LatLng(36.106437,126.995520);
        LatLng no78 = new LatLng(35.939766,126.952349);
        LatLng no79 = new LatLng(35.930698,126.942983);
        LatLng no80 = new LatLng(35.929485,126.953604);
        LatLng no81 = new LatLng(35.926432,126.964293);
        LatLng no82 = new LatLng(35.940177,126.964357);
        LatLng no83 = new LatLng(35.949420,126.956655);
        LatLng no84 = new LatLng(35.948187,126.945465);
        LatLng no85 = new LatLng(35.939547,126.933633);
        LatLng no86 = new LatLng(35.952360,126.972479);
        LatLng no87 = new LatLng(35.959897,126.977026);
        LatLng no88 = new LatLng(35.957715,126.983295);
        LatLng no89 = new LatLng(35.964246,126.959742);
        LatLng no90 = new LatLng(35.961358,127.012626);
        LatLng no91 = new LatLng(35.962769,126.989383);
        LatLng no92 = new LatLng(35.9661,126.8646);





        MarkerOptions markerOptions = new MarkerOptions();

        markerOptions.title("전주시 완산구중앙동"); markerOptions.snippet("분리수거일: 일,화,목"); markerOptions.position(no1);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구풍남동"); markerOptions.snippet("분리수거일: 일,화,목"); markerOptions.position(no2);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구노송동"); markerOptions.snippet("분리수거일: 일,화,목"); markerOptions.position(no3);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구완산동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no4);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구동서학동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no5);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구서서학동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no6);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구중화산1동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no7);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구중화산2동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no8);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구서신동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no9);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구평화1동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no10);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구평화2동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no11);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구삼천1동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no12);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구삼천2동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no13);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구삼천3동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no14);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구효자1동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no15);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구효자2동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no16);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구효자3동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no17);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구효자4동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no18);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 완산구효자5동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no19);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구진북동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no20);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구인후1동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no21);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구인후2동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no22);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구인후3동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no23);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구덕진동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no24);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구금암1동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no25);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구금암2동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no26);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구팔복동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no27);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구우아1동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no28);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구우아2동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no29);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구호성동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no30);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구송천1동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no31);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구송천2동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no32);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구조촌동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no33);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구동산동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no34);mMap.addMarker(markerOptions);
        markerOptions.title("전주시 덕진구혁신동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no35);mMap.addMarker(markerOptions);
        markerOptions.title("군산시옥구읍"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no36);mMap.addMarker(markerOptions);
        markerOptions.title("군산시옥산면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no37);mMap.addMarker(markerOptions);
        markerOptions.title("군산시회현면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no38);mMap.addMarker(markerOptions);
        markerOptions.title("군산시임피면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no39);mMap.addMarker(markerOptions);
        markerOptions.title("군산시서수면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no40);mMap.addMarker(markerOptions);
        markerOptions.title("군산시대야면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no41);mMap.addMarker(markerOptions);
        markerOptions.title("군산시개정면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no42);mMap.addMarker(markerOptions);
        markerOptions.title("군산시성산면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no43);mMap.addMarker(markerOptions);
        markerOptions.title("군산시나포면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no44);mMap.addMarker(markerOptions);
        markerOptions.title("군산시옥도면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no45);mMap.addMarker(markerOptions);
        markerOptions.title("군산시옥서면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no46);mMap.addMarker(markerOptions);
        markerOptions.title("군산시해신동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no47);mMap.addMarker(markerOptions);
        markerOptions.title("군산시월명동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no48);mMap.addMarker(markerOptions);
        markerOptions.title("군산시신풍동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no49);mMap.addMarker(markerOptions);
        markerOptions.title("군산시삼학동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no50);mMap.addMarker(markerOptions);
        markerOptions.title("군산시중앙동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no51);mMap.addMarker(markerOptions);
        markerOptions.title("군산시흥남동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no52);mMap.addMarker(markerOptions);
        markerOptions.title("군산시조촌동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no53);mMap.addMarker(markerOptions);
        markerOptions.title("군산시경암동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no54);mMap.addMarker(markerOptions);
        markerOptions.title("군산시구암동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no55);mMap.addMarker(markerOptions);
        markerOptions.title("군산시개정동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no56);mMap.addMarker(markerOptions);
        markerOptions.title("군산시수송동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no57);mMap.addMarker(markerOptions);
        markerOptions.title("군산시나운1동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no58);mMap.addMarker(markerOptions);
        markerOptions.title("군산시나운2동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no59);mMap.addMarker(markerOptions);
        markerOptions.title("군산시나운3동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no60);mMap.addMarker(markerOptions);
        markerOptions.title("군산시소룡동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no61);mMap.addMarker(markerOptions);
        markerOptions.title("군산시미성동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no62);mMap.addMarker(markerOptions);
        markerOptions.title("익산시함열읍"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no63);mMap.addMarker(markerOptions);
        markerOptions.title("익산시오산면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no64);mMap.addMarker(markerOptions);
        markerOptions.title("익산시황등면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no65);mMap.addMarker(markerOptions);
        markerOptions.title("익산시함라면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no66);mMap.addMarker(markerOptions);
        markerOptions.title("익산시웅포면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no67);mMap.addMarker(markerOptions);
        markerOptions.title("익산시성당면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no68);mMap.addMarker(markerOptions);
        markerOptions.title("익산시용안면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no69);mMap.addMarker(markerOptions);
        markerOptions.title("익산시낭산면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no70);mMap.addMarker(markerOptions);
        markerOptions.title("익산시망성면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no71);mMap.addMarker(markerOptions);
        markerOptions.title("익산시여산면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no72);mMap.addMarker(markerOptions);
        markerOptions.title("익산시금마면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no73);mMap.addMarker(markerOptions);
        markerOptions.title("익산시왕궁면"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no74);mMap.addMarker(markerOptions);
        markerOptions.title("익산시춘포면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no75);mMap.addMarker(markerOptions);
        markerOptions.title("익산시삼기면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no76);mMap.addMarker(markerOptions);
        markerOptions.title("익산시용동면"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no77);mMap.addMarker(markerOptions);
        markerOptions.title("익산시중앙동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no78);mMap.addMarker(markerOptions);
        markerOptions.title("익산시평화동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no79);mMap.addMarker(markerOptions);
        markerOptions.title("익산시인화동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no80);mMap.addMarker(markerOptions);
        markerOptions.title("익산시동산동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no81);mMap.addMarker(markerOptions);
        markerOptions.title("익산시마동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no82);mMap.addMarker(markerOptions);
        markerOptions.title("익산시남중동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no83);mMap.addMarker(markerOptions);
        markerOptions.title("익산시모현동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no84);mMap.addMarker(markerOptions);
        markerOptions.title("익산시송학동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no85);mMap.addMarker(markerOptions);
        markerOptions.title("익산시영등1동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no86);mMap.addMarker(markerOptions);
        markerOptions.title("익산시영등2동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no87);mMap.addMarker(markerOptions);
        markerOptions.title("익산시어양동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no88);mMap.addMarker(markerOptions);
        markerOptions.title("익산시신동"); markerOptions.snippet("분리수거일: 일,화,목");           markerOptions.position(no89);mMap.addMarker(markerOptions);
        markerOptions.title("익산시팔봉동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no90);mMap.addMarker(markerOptions);
        markerOptions.title("익산시삼성동"); markerOptions.snippet("분리수거일: 월,수,금");           markerOptions.position(no91);mMap.addMarker(markerOptions);
        markerOptions.title("호원대학교"); markerOptions.snippet("현재위치"); markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));           markerOptions.position(no92);mMap.addMarker(markerOptions);





        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(no92, 16));

    }

}






