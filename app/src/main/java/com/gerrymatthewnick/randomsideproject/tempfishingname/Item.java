package com.gerrymatthewnick.randomsideproject.tempfishingname;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static com.gerrymatthewnick.randomsideproject.tempfishingname.GameActivity.currentItemId;


public class Item {

    private RelativeLayout rl;
    private Context con;

    private ImageView item;

    public Item(RelativeLayout rl, Context con) {
        this.rl = rl;
        this.con = con;
    }


    public void spawn() {
        item = new ImageView(con);
        item.setId(currentItemId);
        item.setImageResource(con.getResources().getIdentifier("item1", "drawable", con.getPackageName()));
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        item.setLayoutParams(lp);
        item.setX(300);
        item.setY(300);
        rl.addView(item);
    }
    public static void removeItem(ImageView item, RelativeLayout rl) {
        rl.removeView(item);
    }
}
