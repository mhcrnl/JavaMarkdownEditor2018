package javamarkdowneditor2108.pkg1;

import org.jsoup.Jsoup;

import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import java.awt.*;

public class DisplayPane extends JScrollPane {
    private JEditorPane htmlPane;
    private HTMLEditorKit kit;

    public DisplayPane(){
        this.htmlPane=new JEditorPane();
        this.kit=new HTMLEditorKit();
        this.htmlPane.setEditorKit(this.kit);
        this.htmlPane.setContentType("text/html");
        this.htmlPane.setEditable(false);
        this.htmlPane.setFont(new Font("TimesRoman", Font.PLAIN,14));
        this.getViewport().add(this.htmlPane);
        this.setBounds(5,40,300,480);
    }

    public void setContent(String html){
        this.htmlPane.setText(html);
    }

    public String getXHTML(){
        String html=this.htmlPane.getText();
        return Jsoup.parse(html).html();
    }

    public void importCss(String css){
        StyleSheet styleSheet=this.kit.getStyleSheet();
        styleSheet.addRule(css);
    }
}
