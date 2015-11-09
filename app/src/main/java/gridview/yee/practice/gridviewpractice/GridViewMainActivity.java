package gridview.yee.practice.gridviewpractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by Yee on 11/6/15.
 */
public class GridViewMainActivity extends Activity {

    GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_grid_layout);
        mGridView = (GridView) findViewById(R.id.gridView);
        mGridView.setAdapter(new GridViewAdapter(this));
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(), String.format("You are clicking on image %d.", position + 1), Toast
                        .LENGTH_LONG).show();
            }
        });
    }
}
