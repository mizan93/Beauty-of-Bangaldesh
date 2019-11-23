package cardview.com.naimsplanet.gridview_practiece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
   private String [] countryNames;
    private  String[] country_details;

    private int[] flags = {R.drawable.coxsb_bazar,R.drawable.dhaka,R.drawable.sylhet,
            R.drawable.kuakata,R.drawable.sremanggal,R.drawable.chitagong,
            R.drawable.comilla,R.drawable.barisal,R.drawable.rangpur,
            R.drawable.brahmanbaria,R.drawable.naraongong,R.drawable.gopalgong,
            R.drawable.bogura,R.drawable.tongi,R.drawable.pabna,
            R.drawable.savar

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        gridView = (GridView) findViewById(R.id.gridviewId);
        countryNames=getResources().getStringArray(R.array.country_names);
        country_details=getResources().getStringArray(R.array.country_details);

        final CustomAdapter adapter = new CustomAdapter(this,flags,countryNames,country_details);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String  value= countryNames[i];
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("countryNames",countryNames[i]);
                intent.putExtra("flags",flags[i]);
                intent.putExtra("country_details",country_details[i]);
                startActivity(intent);

            }
        });
    }
}
