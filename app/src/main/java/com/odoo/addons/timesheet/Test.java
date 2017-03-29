package com.odoo.addons.timesheet;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.odoo.R;
import com.odoo.base.addons.res.BaseAbstractListener;
import com.odoo.base.addons.res.ResPartner;
import com.odoo.core.orm.ODataRow;
import com.odoo.core.rpc.helper.ODomain;
import com.odoo.core.support.addons.fragment.BaseFragment;
import com.odoo.core.support.drawer.ODrawerItem;

import java.util.List;

import odoo.controls.OForm;

/**
 * Author: Mark.
 * Email: mark.ma@elico-crop.com.
 * Created time: 17-3-29.
 * Describe:
 */

public class Test extends BaseFragment {

    private View view;
     OForm f;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.testlayout, container,false);
          f = (OForm) view.findViewById(R.id.form_test);
        final ResPartner resPartner = new ResPartner(getActivity(), null);
        resPartner.searchOnServerByDRL("",new BaseAbstractListener(){
            @Override
            public void OnSuccessful(List<ODataRow> listRow) {
                super.OnSuccessful(listRow);
                f.initForm(listRow.get(0));
            }
        });

        return view;
    }

    @Override
    public List<ODrawerItem> drawerMenus(Context context) {
        return null;
    }

    @Override
    public <T> Class<T> database() {
        return null;
    }
}
