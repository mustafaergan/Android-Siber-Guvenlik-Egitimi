package tr.edu.ufuk.siberguvenlikegitimi.genericList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.entity.ImageGenericList;

/**
 * Created by mustafa_2 on 1.6.2019.
 */

public class YoneticiKullaniciGenericList  extends BaseAdapter {

    private LayoutInflater layoutInflater;
    List<ImageGenericList> yoneticiList;

    public YoneticiKullaniciGenericList(Activity activity, List<ImageGenericList> yoneticiList) {
        this.layoutInflater = (LayoutInflater)
                activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.yoneticiList = yoneticiList;
    }

    @Override
    public int getCount() {
        return yoneticiList.size();
    }

    @Override
    public Object getItem(int position) {
        return yoneticiList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myView;
        myView = layoutInflater.inflate(R.layout.generic_liste_image,null);
        TextView textViewName =
                (TextView) myView.findViewById(R.id.girisListName);
        ImageView ımageView =
                (ImageView)myView.findViewById(R.id.girisListImage);
        ImageGenericList person = this.yoneticiList.get(position);
        textViewName.setText(person.getName());

        for (ImageGenericList imageGenericList : yoneticiList) {
            if (imageGenericList.getImageNumber() == 0) {
                ımageView.setImageResource(R.drawable.giris0);
            } else if (imageGenericList.getImageNumber() == 1) {
                ımageView.setImageResource(R.drawable.giris1);
            } else if (imageGenericList.getImageNumber() == 2) {
                ımageView.setImageResource(R.drawable.giris2);
            }
        }
        return myView;
    }
}
