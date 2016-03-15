package client;

import server.SoapServer;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


/**
 * Created by smile on 14-Mar-16.
 */
public class MainWindow extends JFrame {

    private SoapServer hello;
    private JTable table;
    private ClientTableModel model;
    private List<String> list;
    private int columns;

    public MainWindow(SoapServer hello){
        this.hello = hello;
        this.setSize(900,500);
        this.setLocation(250,150);
        this.setTitle("SOAP Client");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        JToolBar toolBar = new JToolBar(1);
        JButton addButt = new JButton("Add");
        JButton findButt = new JButton("Change");
        JButton delButt = new JButton("Delete");
        addButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addContent();
            }
        });
        findButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeContent();
            }
        });
        delButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteContent();
            }
        });
        toolBar.add(addButt);
        toolBar.addSeparator();
        toolBar.add(findButt);
        toolBar.addSeparator();
        toolBar.add(delButt);
        this.add(toolBar, BorderLayout.WEST);
        setContent();
        table = new JTable();
        model = new ClientTableModel(list, columns);
        table.setModel(model);
        JScrollPane scroll = new JScrollPane(table);
        this.add(scroll, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void setContent(){
        list = hello.getContent();
        columns = hello.getColumns();
    }

    public void updateContent(){
        list = hello.getContent();
        model.updateList(this.list);
        getContentPane();
        this.table.updateUI();
    }

    private void addContent(){
        AddFrame frame = new AddFrame(this);
    }

    private void changeContent(){
        ChangeFrame frame = new ChangeFrame(this);
    }

    private void deleteContent(){
        DelFrame frame = new DelFrame(this);
    }

    public SoapServer getHello(){
        return this.hello;
    }

    public List<String> getList(){
        return this.list;
    }

    public int getColumns(){
        return this.columns;
    }
}
