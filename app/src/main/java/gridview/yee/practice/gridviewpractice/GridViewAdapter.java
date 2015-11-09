package gridview.yee.practice.gridviewpractice;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Yee on 11/6/15.
 */
public class GridViewAdapter extends BaseAdapter {

    private Context mContext;
    private int[] mThumbIds = {
            R.drawable.e1,
            R.drawable.e3,
            R.drawable.e4,
            R.drawable.e5,
            R.drawable.e6,
            R.drawable.e7
    };

    GridViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView view;
        if (convertView == null) {
            view = new ImageView(mContext);
            view.setLayoutParams(new GridView.LayoutParams(85, 85));
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setPadding(8, 8, 8, 8);
        } else {
            view = (ImageView) convertView;
        }
        view.setImageResource(mThumbIds[position]);
        int size = (int) mContext.getResources().getDimension(R.dimen.image_size);
        view.setLayoutParams(new GridView.LayoutParams(size, size));
        return view;
    }
}
