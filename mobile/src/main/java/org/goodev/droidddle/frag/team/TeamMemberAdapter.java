package org.goodev.droidddle.frag.team;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.goodev.droidddle.R;
import org.goodev.droidddle.holder.UserViewHolder;
import org.goodev.droidddle.pojo.User;
import org.goodev.droidddle.widget.BaseAdapter;

/**
 * Created by goodev on 2014/12/30.
 */
public class TeamMemberAdapter extends BaseAdapter<User> {

    public TeamMemberAdapter(Activity context) {
        super(context);
    }

    @Override
    public long getContentItemId(int position) {
        return mDataList.get(position).id;
    }


    @Override
    protected RecyclerView.ViewHolder onCreateContentViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.user_team_item, parent, false);
        return new UserViewHolder(view, mContext);
    }

    @Override
    public void onBindContentViewHolder(RecyclerView.ViewHolder holder, int position) {
        User data = getItem(position);
        UserViewHolder h = (UserViewHolder) holder;
        h.setData(data);

    }

}

