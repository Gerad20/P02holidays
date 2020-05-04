package c346.rp.edu.p02_holidays;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class holidayAdapter extends ArrayAdapter<holiday> {

    private ArrayList<holiday> Holidays;
    private Context context;
    private TextView tvholidayName;
    private TextView tvViewDate;
    private ImageView ivHolidayPic;

    public holidayAdapter(Context context, int resource, ArrayList<holiday> objects){
        super(context, resource, objects);

        Holidays = objects;

        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);


        tvholidayName = (TextView) rowView.findViewById(R.id.tvHolidayName);
        tvViewDate = (TextView) rowView.findViewById(R.id.textViewDate);
        ivHolidayPic = (ImageView) rowView.findViewById(R.id.IvHolidayPic);

        holiday currentHolidays = Holidays.get(position);
        tvholidayName.setText(currentHolidays.getName());
        ivHolidayPic.setImageResource(currentHolidays.getImage());
        tvViewDate.setText(currentHolidays.getDate());

        return rowView;
    }
}

