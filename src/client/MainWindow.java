package client;

import server.SoapServer;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import rpc.server.ThriftServer;


/**
 * Created by smile on 14-Mar-16.
 */
public class MainWindow extends JFrame {

    private SoapServer hello;
    private JTable table;
    private ClientTableModel model;
    private List<String> list;
    private int columns;
    private ThriftServer.Client client;

    public MainWindow(SoapServer hello, ThriftServer.Client client){
        this.hello = hello;
        this.client = client;
        this.setSize(900,500);
        this.setLocation(250,150);
        if(hello!=null) {
            this.setTitle("GUI Client   Server type Documet-style SOAP");
        } else {
            this.setTitle("GUI Client   Server type RPC");
        }
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
        if(hello!=null) {
            list = hello.getContent();
            columns = hello.getColumns();
        } else {
            try {
                list = client.getContent();
                columns = client.getColumns();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    public void updateContent(){
        if(hello!=null) {
            list = hello.getContent();
        } else {
            try {
                list = client.getContent();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
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

    public ThriftServer.Client getClient(){
        return this.client;
    }

    public List<String> getList(){
        return this.list;
    }

    public int getColumns(){
        return this.columns;
    }
}
