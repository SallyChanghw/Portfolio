/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import javax.swing.*;
import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.DialogTypeSelection;

/**
 *
 * @author josie
 */


public class PrintPreviewDemo {
    private JFrame frame;
    private JTable table;
    
    public PrintPreviewDemo() {
        frame = new JFrame("Print Preview Example");
        
        // Create a sample table (replace this with your table creation logic)
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        Object[][] data = {
            {"Row 1, Col 1", "Row 1, Col 2", "Row 1, Col 3"},
            {"Row 2, Col 1", "Row 2, Col 2", "Row 2, Col 3"},
            {"Row 3, Col 1", "Row 3, Col 2", "Row 3, Col 3"}
        };
        table = new JTable(data, columnNames);
        
        JButton printButton = new JButton("Print Preview");
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPrintPreview();
            }
        });
        
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(printButton, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    
    private void showPrintPreview() {
        JDialog printPreviewDialog = new JDialog(frame, "Print Preview", true);
        printPreviewDialog.setLayout(new BorderLayout());
        
        // Create a new JScrollPane to display the content you want to print
        JScrollPane printScrollPane = new JScrollPane(table);
        
        printPreviewDialog.add(printScrollPane, BorderLayout.CENTER);
        
        JButton printButton = new JButton("Print");
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to actually print the content
                PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
                attributes.add(DialogTypeSelection.COMMON);
                try {
                    table.print(JTable.PrintMode.NORMAL, null, null, true, attributes, true);
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                }
            }
        });
        printPreviewDialog.add(printButton, BorderLayout.SOUTH);
        
        printPreviewDialog.setSize(600, 400);
        printPreviewDialog.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrintPreviewDemo();
            }
        });
    }
}

