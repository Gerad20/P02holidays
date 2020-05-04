package c346.rp.edu.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView holidayType;

    ArrayList<String> HolidayTypesArr = new ArrayList<>();
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        holidayType = findViewById(R.id.typesOfholiday);

        HolidayTypesArr.add("Secular");
        HolidayTypesArr.add("Ethnic & Religion");

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, HolidayTypesArr);
        holidayType.setAdapter(aa);

        holidayType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String holiday = HolidayTypesArr.get(position);
                Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
                intent.putExtra("holidayCall", holiday);
                startActivity(intent);


            }
        });


















    }
}
