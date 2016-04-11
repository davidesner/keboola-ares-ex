/*
 */
package keboola.ares.ex.beans;

import cz.ares.basic.KodNace;
import cz.ares.basic.KodNace2;
import cz.ares.basic.Nace2;
import cz.ares.basic.OborCinnosti2;
import cz.ares.basic.OboryCinnosti2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class AresInfoOborRowBeanList {

    private List<AresInfoOborRowBean> oboryRowList;

    public AresInfoOborRowBeanList(OboryCinnosti2 obory, String ico) {
        this.oboryRowList = new ArrayList();

        for (OborCinnosti2 k : obory.getOborCinnosti()) {
            oboryRowList.add(new AresInfoOborRowBean(ico, k.getK(), k.getT()));
        }

    }

    public List<AresInfoOborRowBean> getNaceRowList() {
        return oboryRowList;
    }
}
