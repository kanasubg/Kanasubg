package com.company;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;
import     java.awt.image.ImageObserver;
import java.awt.Graphics;
import java.applet.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SlotGame extends JFrame implements ItemListener {

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
    BufferedImage coin34;
    BufferedImage  dragon34;


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

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();

    }

    public void paint(){

    }


    private class thehandler implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "") );

            List<JButton> listE = Arrays.asList(c, d, h, y, e, r, l, ea, w);
            Random rand = new Random();
            Object randomElement = listE.get(rand.nextInt(listE.size()));

//            try {
//                 coin34 = ImageIO.read(new File("C:\\Users\\User\\Desktop\\Kanasubg\\pictures\\6rose_299x300.jpg"));
//                dragon34 = ImageIO.read(new File("C:\\Users\\User\\Desktop\\Kanasubg\\pictures\\helmet_299x300.jpg"));
//
//
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//
//
//            List<BufferedImage> listElements = new ArrayList<>();
//            listElements.add(coin34);
//            listElements.add(dragon34);
//
//
//                Random rand = new Random();
//            Object randomElement = listElements.get(rand.nextInt(listElements.size()));
//            ((BufferedImage) randomElement).getSubimage(15, 15, 303, 303);
//            ((BufferedImage) randomElement).getSubimage(360, 15, 303, 303);
//            ((BufferedImage) randomElement).getTileGridXOffset();




        }

    }


}

