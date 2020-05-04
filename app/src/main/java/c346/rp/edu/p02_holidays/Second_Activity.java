package c346.rp.edu.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Second_Activity extends AppCompatActivity {
    ListView HolidayName;
    TextView displayHoliday;

    ArrayList<holiday> holidays = new ArrayList<holiday>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second_main);
            HolidayName = findViewById(R.id.LvdisplayHoliday);
            displayHoliday = findViewById(R.id.TvdisplayHoliday);

            Intent intentRecieved = getIntent();
            final String holidayTypes = intentRecieved.getStringExtra("holidayCall");
            displayHoliday.setText(holidayTypes);



        final ArrayList<holiday> holidayS = new ArrayList<holiday>(Arrays.asList(new holiday("New years Day", R.drawable.newyear,"1 Jan 2017"), new holiday("Labour Day", R.drawable.labourday,"1 May 2017")));
        final ArrayList<holiday> holidayR = new ArrayList<holiday>(Arrays.asList(new holiday("Chinese new year", R.drawable.cny,"27-28 Jan 2017"), new holiday("Good Friday", R.drawable.goodfriday,"14 April 2017")));

            if(holidayTypes.equals("Secular")){
                ArrayAdapter holidayAdapter = new holidayAdapter(getApplicationContext(),R.layout.row,holidayS);
                HolidayName.setAdapter(holidayAdapter);
            }else if(holidayTypes.equals("Ethnic & Religion")){
                ArrayAdapter holidayAdapter = new holidayAdapter(getApplicationContext(),R.layout.row,holidayR);
                HolidayName.setAdapter(holidayAdapter);
            }

            HolidayName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(holidayTypes.equals("Secular")){
                        if(holidayS.get(position).getName().equals("New years Day")){
                            Toast.makeText(getApplicationContext(),"The start of the year celebration",Toast.LENGTH_LONG).show();
                        }else if(holidayS.get(position).getName().equals("Labour Day")){
                            Toast.makeText(getApplicationContext(),"Celebration for workers",Toast.LENGTH_LONG).show();
                        }

                    }else if (holidayTypes.equals("Ethnic & Religion")){
                        if(holidayR.get(position).getName().equals("Chinese new year")){
                            Toast.makeText(getApplicationContext(),"Chinese people celebration",Toast.LENGTH_LONG).show();
                        }else if(holidayR.get(position).getName().equals("Good Friday")){
                            Toast.makeText(getApplicationContext(),"Good friday christian holiday",Toast.LENGTH_LONG).show();
                        }
                    }
                }
            });



















    }
}
