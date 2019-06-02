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
import tr.edu.ufuk.siberguvenlikegitimi.entity.Rol;

/**
 * Created by mustafaergan.
 */

public class RolGenericList extends BaseAdapter {

    private LayoutInflater layoutInflater;
    List<Rol> imageGenericListList;

    public RolGenericList(Activity activity, List<Rol> imageGenericListList) {
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
        Rol rol = this.imageGenericListList.get(position);
        textViewName.setText(rol.getRolAdı());
        ımageView.setImageResource(R.drawable.giris0);
        return myView;
    }
}
