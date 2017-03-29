/**
 * 2016 Suez Shanghai
 * License AGPL-3.0 or later (http://www.gnu.org/licenses/agpl.html).
 */
package com.odoo.base.addons.res;

import com.odoo.core.orm.ODataRow;
import com.odoo.core.rpc.helper.utils.gson.OdooResult;

import java.util.List;

public class BaseAbstractListener {
    public void OnSuccessful(List<ODataRow> listRow){}
    public void OnSuccessful(ODataRow row){}
    public void OnSuccessful(OdooResult result){}
    public void OnSuccessful(Boolean success){}
    public void OnSuccessful(Integer count){}
    public void OnSuccessful(String str){}
    public void OnCancelled(){}
}
