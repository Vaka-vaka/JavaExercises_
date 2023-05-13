/**
 * Создайте Swing-приложение для размещения заказов на покупку велосипедов.
 * processing parts
 *
 * @author Valentyn Mozul
 * @version 1.0 from 14.05.2023
 */

package JavaKids.bikes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyingBikesEngine implements ActionListener {
    BuyingBikes parent;

    BuyingBikesEngine(BuyingBikes parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
