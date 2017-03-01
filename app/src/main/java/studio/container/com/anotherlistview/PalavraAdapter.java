package studio.container.com.anotherlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

/**
 * Created by Eric on 28/02/2017.
 */

public class PalavraAdapter extends ArrayAdapter {

    public List<Palavra> listP;

    public PalavraAdapter(Context context, int resource, List list) {
        super(context, resource, list);
        this.listP = list;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.raw_layout, parent, false);

        TextView tv1 = (TextView) row.findViewById(R.id.tv1);
        TextView tv2 = (TextView) row.findViewById(R.id.tv2);
        TextView tv3 = (TextView) row.findViewById(R.id.tv3);


        tv1.setText(listP.get(position).getTv1());
        tv2.setText(listP.get(position).getTv2());
        tv3.setText(listP.get(position).getTv3());



        return row;
    }
}
