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
 * Created by mustafaergan.
 */

public class EgitimGenericList extends BaseAdapter {

    private LayoutInflater layoutInflater;
    List<ImageGenericList> imageGenericListList;

    public EgitimGenericList(Activity activity, List<ImageGenericList> imageGenericListList) {
        this.layoutInflater = (LayoutInflater)
                activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.imageGenericListList = imageGenericListList;
    }

    @Override
    public int getCount() {
        return imageGenericListList.size();
    }

    @Override
    public Object getItem(int position) {
        return imageGenericListList.get(position);
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
        ImageGenericList person = this.imageGenericListList.get(position);
        textViewName.setText(person.getName());

        for (ImageGenericList imageGenericList : imageGenericListList) {
            if (imageGenericList.getImageNumber() == 0) {
                ımageView.setImageResource(R.drawable.giris0);
            } else if (imageGenericList.getImageNumber() == 1) {
                ımageView.setImageResource(R.drawable.giris1);
            }
        }
        return myView;
    }
}
