package cardview.com.naimsplanet.gridview_practiece;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    private TextView textView;
    private ImageView image;
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        image = (ImageView) findViewById(R.id.imageId);
        textView = (TextView) findViewById(R.id.textId);
        textView1= (TextView) findViewById(R.id.detailsId);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            textView.setText(bundle.getString("countryNames"));
            image.setImageResource(bundle.getInt("flags"));
            textView1.setText(bundle.getString("country_details"));



        }
    }
}
