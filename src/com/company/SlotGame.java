package com.company;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.awt.image.ImageObserver;
import java.awt.Graphics;
import java.applet.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SlotGame extends JFrame {

    private static int creditt = 100;
    private static int bett = 2;
    private int winn = 0;
    private JButton spin;

    private JButton c;
    private JButton d;
    private JButton h;
    private JButton y;
    private JButton e;
    private JButton r;
    private JButton l;
    private JButton ea;
    private JButton w;

    private JLabel credit;
    private JLabel bet;
    private JLabel win;
    private Font bFont;
    private Font bigFont;


    private Icon coin;
    private Icon dragon;
    private Icon helmet;
    private Icon yinYan;
    private Icon eagle;
    private Icon rose;
    private Icon lion;
    private Icon earth;
    private Icon wizard;


    public SlotGame() {

        super("Kanasubg");

        setLayout(new GridLayout());
        setPreferredSize(new Dimension(1600, 1300));
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        credit = new JLabel("CREDIT:  " + creditt);
        bet = new JLabel("BET:  " + bett);
        win = new JLabel("WIN:  " + winn);
        spin = new JButton("      S P I N      ");
        spin.setForeground(Color.cyan);
        bFont = new Font("serif", Font.BOLD, 20);
        bigFont = new Font("serif", Font.BOLD, 40);

        credit.setFont(bFont);
        bet.setFont(bFont);
        win.setFont(bFont);
        spin.setFont(bigFont);

        credit.setBounds(30, 1050, 150, 50);
        bet.setBounds(255, 1050, 150, 50);
        win.setBounds(480, 1050, 150, 50);
        spin.setBounds(710, 1050, 300, 50);

        credit.setForeground(Color.white);
        bet.setForeground(Color.green);
        win.setForeground(Color.red);
        spin.setBackground(Color.black);

        add(credit);
        add(bet);
        add(win);
        add(spin);
        setLayout(null);
        setVisible(true);

        coin = new ImageIcon(getClass().getResource("1coin.png"));
        dragon = new ImageIcon(getClass().getResource("2dragon_299x300.png"));
        helmet = new ImageIcon(getClass().getResource("3helmet_299x300.png"));
        yinYan = new ImageIcon(getClass().getResource("4yin-yan_299x300.png"));
        eagle = new ImageIcon(getClass().getResource("5eagle_299x300.png"));
        rose = new ImageIcon(getClass().getResource("6rose_299x300.png"));
        lion = new ImageIcon(getClass().getResource("7lion_299x300.png"));
        earth = new ImageIcon(getClass().getResource("8earth_299x300.png"));
        wizard = new ImageIcon(getClass().getResource("9wizard_299x300.png"));


        c = new JButton("", coin);
        add(c);
        c.setBounds(15, 15, 303, 303);

        d = new JButton("", dragon);
        add(d);
        d.setBounds(360, 15, 303, 303);

        h = new JButton("", helmet);
        add(h);
        h.setBounds(710, 15, 303, 303);

        y = new JButton("", yinYan);
        add(y);
        y.setBounds(15, 360, 303, 303);

        e = new JButton("", eagle);
        add(e);
        e.setBounds(360, 360, 303, 303);

        r = new JButton("", rose);
        add(r);
        r.setBounds(710, 360, 303, 303);

        l = new JButton("", lion);
        add(l);
        l.setBounds(15, 710, 303, 303);

        ea = new JButton("", earth);
        add(ea);
        ea.setBounds(360, 710, 303, 303);

        w = new JButton("", wizard);
        add(w);
        w.setBounds(710, 710, 303, 303);


        thehandler handler = new thehandler();
        spin.addActionListener(handler);


    }

    private class thehandler implements ActionListener {


        public void actionPerformed(ActionEvent event) {


            List<JButton> listE1 = Arrays.asList(c, d, h, y, e, r, l, ea, w);

            Random rand = new Random();



            JButton randomElement1 = listE1.get(rand.nextInt(listE1.size()));
            randomElement1.setBounds( 15, 15, 303, 303);
            randomElement1.setVisible(true);
            randomElement1.repaint();
            randomElement1.revalidate();


            JButton randomElement2 =listE1.get(rand.nextInt(listE1.size()));
            randomElement2.setBounds( 360, 15, 303, 303);
            randomElement2.setVisible(true);
            randomElement2.repaint();
            randomElement2.revalidate();


            JButton randomElement3 = listE1.get(rand.nextInt(listE1.size()));
            randomElement3.setBounds( 710, 15, 303, 303);
            randomElement3.setVisible(true);
            randomElement3.repaint();
            randomElement3.revalidate();


            JButton randomElement4 = listE1.get(rand.nextInt(listE1.size()));
            randomElement4.setBounds( 15, 360, 303, 303);
            randomElement4.setVisible(true);
            randomElement4.repaint();
            randomElement4.revalidate();


            JButton randomElement5 = listE1.get(rand.nextInt(listE1.size()));
            randomElement5.setBounds( 360, 360, 303, 303);
            randomElement5.setVisible(true);
            randomElement5.repaint();
            randomElement5.revalidate();


            JButton randomElement6 = listE1.get(rand.nextInt(listE1.size()));
            randomElement6.setBounds( 710, 360, 303, 303);
            randomElement6.setVisible(true);
            randomElement6.repaint();
            randomElement6.revalidate();


            JButton randomElement7 = listE1.get(rand.nextInt(listE1.size()));
            randomElement7.setBounds( 15, 710, 303, 303);
            randomElement7.setVisible(true);
            randomElement7.repaint();
            randomElement7.revalidate();


            JButton randomElement8 =listE1.get(rand.nextInt(listE1.size()));
            randomElement8.setBounds( 360, 710, 303, 303);
            randomElement8.setVisible(true);
            randomElement8.repaint();
            randomElement8.revalidate();

            JButton randomElement9 = listE1.get(rand.nextInt(listE1.size()));
            randomElement9.setBounds( 710, 710, 303, 303);
            randomElement9.setVisible(true);
            randomElement9.repaint();
            randomElement9.revalidate();


        }

    }


}

