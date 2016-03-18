package client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by smile on 15-Mar-16.
 */
public class ChangeFrame extends JFrame{

    private JTextField name;
    private JTextField surname;
    private JTextField fathername;
    private JTextField birthdate;
    private JTextField form;
    private JTextField phone;
    private MainWindow window;

    public ChangeFrame(MainWindow window){
        this.window = window;
        this.setSize(490,260);
        this.setLocation(450,150);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Change info");
        name = new JTextField("", 20);
        JLabel namel = new JLabel("Name");
        surname = new JTextField("", 20);
        JLabel surnamel = new JLabel("Surname");
        fathername = new JTextField("", 20);
        JLabel fathernamel = new JLabel("FatherName");
        birthdate  = new JTextField("", 20);
        JLabel birthdatel = new JLabel("Birth Date (YY.MM.DD)");
        form = new JTextField("", 20);
        JLabel forml = new JLabel("Form");
        phone = new JTextField("", 20);
        JLabel phonel = new JLabel("Phone");
        namel.setBounds(100,10,70,20);
        name.setBounds(20,30,200, 25);
        surnamel.setBounds(90,60,70,20);
        surname.setBounds(20,80,200, 25);
        fathernamel.setBounds(85,110,70,20);
        fathername.setBounds(20,130,200, 25);
        birthdatel.setBounds(300,10,150,20);
        birthdate.setBounds(260,30,200, 25);
        forml.setBounds(345,60,70,20);
        form.setBounds(260, 80, 200, 25);
        phonel.setBounds(345,110,70,20);
        phone.setBounds(260, 130, 200, 25);
        this.add(namel);
        this.add(name);
        this.add(surnamel);
        this.add(surname);
        this.add(fathernamel);
        this.add(fathername);
        this.add(birthdatel);
        this.add(birthdate);
        this.add(forml);
        this.add(form);
        this.add(phonel);
        this.add(phone);
        JButton button = new JButton("Change");
        button.setBounds(190, 185, 100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateAndChange();
            }
        });
        this.add(button);
        this.setVisible(true);
    }

    private void validateAndChange(){
        List<String> personList = new ArrayList<String>();
        List<String> changeList = new ArrayList<String>();
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
                    changeList.add(this.birthdate.getText());
                    changeList.add(this.form.getText());
                    changeList.add(this.phone.getText());
                    if(window.getHello()!=null) {
                        window.getHello().changeContent(personList, changeList);
                    } else {
                        try {
                            window.getClient().changeContent(personList, changeList);
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
