package cardview.com.naimsplanet.gridview_practiece;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter
{
    Context context;
    int [] flags;
    String [] countryNames;
    String[] country_details;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int[] flags, String[] countryNames, String[] country_details) {
        this.context = context;
        this.flags = flags;
        this.countryNames = countryNames;
        this.country_details = country_details;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public String[] getCountry_details() {
        return country_details;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


            view = inflater.inflate(R.layout.sample_view,viewGroup,false);

        }

        ImageView imageView = (ImageView) view.findViewById(R.id.imageId);
        TextView textView =(TextView) view.findViewById(R.id.textId);
        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);

        return view ;
    }
}
