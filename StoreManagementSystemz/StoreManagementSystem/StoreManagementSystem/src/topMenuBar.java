import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class topMenuBar extends JMenuBar {
    JMenu viewVendorsMenu, addGoodsMenu, viewGoodsMenu, viewBillsMenu, issuedGoodsMenu, viewIssuedGoodsMenu;

    ImageIcon viewVendorsIcon = new ImageIcon("src/img/vendors.png");
    Image iconimage = viewVendorsIcon.getImage();
    Image modifiedIconImage = iconimage.getScaledInstance(30,30, Image.SCALE_SMOOTH);

    ImageIcon addGoodsIcon = new ImageIcon("src/img/add-goods.png");
    Image iconimage1 = addGoodsIcon.getImage();
    Image modifiedIconImage1 = iconimage1.getScaledInstance(30,30, Image.SCALE_SMOOTH);



    ImageIcon viewGoodsIcon = new ImageIcon("src/img/view-goods.png");
    Image iconimage2 = viewGoodsIcon.getImage();
    Image modifiedIconImage2 = iconimage2.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

    ImageIcon viewBillsIcon = new ImageIcon("src/img/view-bills.png");
    Image iconimage3 = viewBillsIcon.getImage();
    Image modifiedIconImage3 = iconimage3.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

    ImageIcon issuedGoodsIcon = new ImageIcon("src/img/issued-goods.png");
    Image iconimage4 = issuedGoodsIcon.getImage();
    Image modifiedIconImage4 = iconimage4.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

    ImageIcon viewIssuedGoodsIcon = new ImageIcon("src/img/view-issued-goods.png");
    Image iconimage5 = viewIssuedGoodsIcon.getImage();
    Image modifiedIconImage5 = iconimage5.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);



    topMenuBar(){
        this.setPreferredSize(new Dimension(100,60));
        this.setBackground(new Color(187, 0, 255));
        this.setLayout(new GridLayout(1, 5));

        viewVendorsIcon = new ImageIcon(modifiedIconImage);
        addGoodsIcon = new ImageIcon(modifiedIconImage1);
        viewGoodsIcon = new ImageIcon(modifiedIconImage2);
        viewBillsIcon = new ImageIcon(modifiedIconImage3);
        issuedGoodsIcon = new ImageIcon(modifiedIconImage4);
        viewIssuedGoodsIcon = new ImageIcon(modifiedIconImage5);

        viewVendorsMenu = new JMenu("View Vendor");
        viewVendorsMenu.setHorizontalAlignment(JMenu.CENTER);
        viewVendorsMenu.setForeground(Color.white);
        viewVendorsMenu.setFont(new Font("Montserrat", Font.BOLD, 13));

        addGoodsMenu = new JMenu("Add Goods");
        addGoodsMenu.setHorizontalAlignment(JMenu.CENTER);
        addGoodsMenu.setForeground(Color.white);
        addGoodsMenu.setFont(new Font("Montserrat", Font.BOLD, 13));

        viewGoodsMenu = new JMenu("View Goods");
        viewGoodsMenu.setHorizontalAlignment(JMenu.CENTER);
        viewGoodsMenu.setForeground(Color.white);
        viewGoodsMenu.setFont(new Font("Montserrat", Font.BOLD, 13));

        viewBillsMenu = new JMenu("View Bills");
        viewBillsMenu.setHorizontalAlignment(JMenu.CENTER);
        viewBillsMenu.setForeground(Color.white);
        viewBillsMenu.setFont(new Font("Montserrat", Font.BOLD, 13));

        issuedGoodsMenu = new JMenu("Add Goods");
        issuedGoodsMenu.setHorizontalAlignment(JMenu.CENTER);
        issuedGoodsMenu.setForeground(Color.white);
        issuedGoodsMenu.setFont(new Font("Montserrat", Font.BOLD, 13));

        viewIssuedGoodsMenu = new JMenu("Add Goods");
        viewIssuedGoodsMenu.setHorizontalAlignment(JMenu.CENTER);
        viewIssuedGoodsMenu.setForeground(Color.white);
        viewIssuedGoodsMenu.setFont(new Font("Montserrat", Font.BOLD, 13));

        this.add(viewVendorsMenu);
        this.add(addGoodsMenu);
        this.add(viewGoodsMenu);
        this.add(viewBillsMenu);
        this.add(issuedGoodsMenu);
        this.add(viewIssuedGoodsMenu);
    }


}
