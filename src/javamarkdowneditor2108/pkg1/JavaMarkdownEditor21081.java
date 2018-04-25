/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javamarkdowneditor2108.pkg1;

import GUI.UtilMenu;
import java.awt.Container;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mhcrnl
 */
public class JavaMarkdownEditor21081 {

   public static void main(String[] args) throws IOException {
        JFrame frame=new JFrame("Java Markdown Editor 2018");
        Container rootPane=frame.getContentPane();
        frame.setLayout(null);

        JPanel left=new JPanel();
        left.setBounds(10,0,305,520);
        JPanel middle=new JPanel();
        middle.setBounds(315,0,305,520);
        JPanel right=new JPanel();
        right.setBounds(620,0,205,520);
        left.setLayout(null);
        middle.setLayout(null);
        right.setLayout(null);

        JLabel editLabel=new JLabel("Editor",JLabel.CENTER);
        editLabel.setBounds(0,0,300,50);
        JLabel displayLabel=new JLabel("HTML Viewer",JLabel.CENTER);
        displayLabel.setBounds(0,0,300,50);
        JLabel catalogLabel=new JLabel("Catalog",JLabel.CENTER);
        catalogLabel.setBounds(0,0,200,50);

        Catalog catalog=new Catalog();
        DisplayPane displayPane=new DisplayPane();
        Editor editor=new Editor(displayPane,catalog);

        left.add(editLabel);
        left.add(editor);
        middle.add(displayLabel);
        middle.add(displayPane);
        right.add(catalogLabel);
        right.add(catalog);

        UtilMenu menuBar=new UtilMenu(editor,displayPane);
        frame.setJMenuBar(menuBar);

        rootPane.add(left);
        rootPane.add(middle);
        rootPane.add(right);

        frame.setSize(850,600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
