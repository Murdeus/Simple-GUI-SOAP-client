package client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by smile on 16-Mar-16.
 */
public class DelFrame extends JFrame {

    private JTextField name;
    private JTextField surname;
    private JTextField fathername;
    private MainWindow window;

    public DelFrame(MainWindow window){
        this.window = window;
        this.setSize(240,260);
        this.setLocation(550,150);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Delete info");
        name = new JTextField("", 20);
        JLabel namel = new JLabel("Name");
        surname = new JTextField("", 20);
        JLabel surnamel = new JLabel("Surname");
        fathername = new JTextField("", 20);
        JLabel fathernamel = new JLabel("FatherName");
        namel.setBounds(100, 10, 70, 20);
        name.setBounds(20, 30, 200, 25);
        surnamel.setBounds(90, 60, 70, 20);
        surname.setBounds(20, 80, 200, 25);
        fathernamel.setBounds(85, 110, 70, 20);
        fathername.setBounds(20, 130, 200, 25);
        this.add(namel);
        this.add(name);
        this.add(surnamel);
        this.add(surname);
        this.add(fathernamel);
        this.add(fathername);
        JButton button = new JButton("Delete");
        button.setBounds(70, 185, 100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateAndDelete();
            }
        });
        this.add(button);
        this.setVisible(true);
    }

    private void validateAndDelete(){
        List<String> personList = new ArrayList<String>();
        if((!(this.name.getText().equals(""))) && (!(this.surname.getText().equals("")))
                && (!(this.fathername.getText().equals("")))){
            List<String> buf = window.getList();
            int col = window.getColumns();
            boolean bool = false;
            for(int i=0; i<buf.size(); i+=col){
                if((this.name.getText().equals(buf.get(i))) && (this.surname.getText().equals(buf.get(i+1)))
                        &&(this.fathername.getText().equals(buf.get(i+2)))){
                    personList.add(this.name.getText());
                    personList.add(this.surname.getText());
                    personList.add(this.fathername.getText());
                    if(window.getHello()!=null) {
                        window.getHello().deleteContent(personList);
                    } else {
                        try {
                            window.getClient().deleteContent(personList);
                        } catch (Exception ex){
                            ex.printStackTrace();
                        }
                    }
                    window.updateContent();
                    bool = true;
                    this.dispose();
                }
            }
            if(!bool){
                JOptionPane.showMessageDialog(null, "No such person");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Incorect input");
        }
    }
}
