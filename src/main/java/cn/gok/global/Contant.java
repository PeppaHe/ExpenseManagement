package cn.gok.global;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hq
 * @create time:2020/9/9 11:43
 * @desc:  ״̬
 */
//@Data
public class Contant {
    //ְ��
    public static final String POST_STAFF="Ա��";
    public static final String POST_FM="���ž���";
    public static final String POST_GM="�ܾ���";
    public static final String POST_CASHIER="����";
    public static List<String> getPost(){
        List<String> list = new ArrayList<String>();
        list.add(POST_STAFF);
        list.add(POST_FM);
        list.add(POST_GM);
        list.add(POST_CASHIER);
        return list;
    }

    //��������
    public List<String> getItem(){
        List<String> list = new ArrayList<String>();
        list.add("��ͨ");
        list.add("����");
        list.add("ס��");
        list.add("�칫");
        return list;
    }

    //������״̬
    public static final String CLAIMVOUCHER_CREATE="�´���";
    public static final String CLAIMVOUCHER_SUBMIT="���ύ";
    public static final String CLAIMVOUCHER_APPROVED="�����";
    public static final String CLAIMVOUCHER_BACK="�Ѵ��";
    public static final String CLAIMVOUCHER_TERMINATED="����ֹ";
    public static final String CLAIMVOUCHER_RECHECK="������";
    public static final String CLAIMVOUCHER_PAID="�Ѵ��";

    //��˶��
    public static final double LIMIT=5000;

    //����ʽ
    public static final String DEAL_CREATE="����";
    public static final String DEAL_SUBMIT="�ύ";
    public static final String DEAL_UPDATE="�޸�";
    public static final String DEAL_BACK="���";
    public static final String DEAL_REJECT="�ܾ�";
    public static final String DEAL_PASS="ͨ��";
    public static final String DEAL_PAID="���";




}
