/*
 */
package keboola.ares.ex.beans;

import cz.ares.basic.KodNace;
import cz.ares.basic.KodNace2;
import cz.ares.basic.Nace2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class AresInfoNaceRowBeanList {

    private List<AresInfoNaceRowBean> naceRowList;

    public AresInfoNaceRowBeanList(List<Nace2> naces, String ico) {
        this.naceRowList = new ArrayList();

        for (Nace2 n : naces) {
            for (KodNace2 k : n.getNACE()) {
                naceRowList.add(new AresInfoNaceRowBean(ico, k.getValue()));
            }
        }

    }

    public List<AresInfoNaceRowBean> getNaceRowList() {
        return naceRowList;
    }

}
