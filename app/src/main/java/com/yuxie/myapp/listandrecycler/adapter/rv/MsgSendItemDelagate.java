package com.yuxie.myapp.listandrecycler.adapter.rv;


import com.yuxie.myapp.R;
import com.yuxie.myapp.commonadapter.recyclerview.ItemViewDelegate;
import com.yuxie.myapp.commonadapter.recyclerview.ViewHolder;
import com.yuxie.myapp.listandrecycler.bean.ChatMessage;

/**
 * Created by zhy on 16/6/22.
 */
public class MsgSendItemDelagate implements ItemViewDelegate<ChatMessage>
{

    @Override
    public int getItemViewLayoutId()
    {
        return R.layout.main_chat_send_msg;
    }

    @Override
    public boolean isForViewType(ChatMessage item, int position)
    {
        return !item.isComMeg();
    }

    @Override
    public void convert(ViewHolder holder, ChatMessage chatMessage, int position)
    {
        holder.setText(R.id.chat_send_content, chatMessage.getContent());
        holder.setText(R.id.chat_send_name, chatMessage.getName());
        holder.setImageResource(R.id.chat_send_icon, chatMessage.getIcon());
    }
}
