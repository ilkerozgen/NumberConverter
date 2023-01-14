import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * A class that allows the users to convert numbers between decimal, hex and binary. 
 * @author İlker Özgen
 * @version 31.03.2021
*/ 
public class ConvertNumbers
{
    public static void main(String[] args)
    {
        // Program Code
        
        // Create a frame.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create and process the labels.
        JLabel decimalLabel = new JLabel( "Decimal:  " );
        JLabel hexLabel = new JLabel( "Hex:  " );
        JLabel binaryLabel = new JLabel( "Binary:  " );
        
        decimalLabel.setBounds( 10, 60, 160, 30 );
        hexLabel.setBounds( 10, 140, 160, 30 );
        binaryLabel.setBounds( 10, 220, 160, 30 );
        
        frame.add(decimalLabel);
        frame.add(hexLabel);
        frame.add(binaryLabel);
        
        // Create and process the text fields.
        JTextField decimalField = new JTextField();
        JTextField hexField = new JTextField();
        JTextField binaryField = new JTextField();
        
        decimalField.setBounds( 100, 60, 160, 30 );
        hexField.setBounds( 100, 140, 160, 30 );
        binaryField.setBounds( 100, 220, 160, 30 );
        
        frame.add(decimalField);
        frame.add(hexField);
        frame.add(binaryField);
        
        // Get input and process it.
        // For decimal inputs,
        decimalField.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
               String text = decimalField.getText();
               
               int decimalResult = Integer.parseInt( text );
               String hexResult = Integer.toHexString( decimalResult );
               String binaryResult = Integer.toBinaryString( decimalResult );
               
               hexField.setText( hexResult.toUpperCase() );
               binaryField.setText( binaryResult );
            }
         });
         
        // For hex inputs,
        hexField.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
               String text = hexField.getText();
               
               int decimalResult = Integer.parseInt( text, 16 );
               String binaryResult = Integer.toBinaryString( decimalResult );
               
               decimalField.setText( String.valueOf( decimalResult ) );
               binaryField.setText( binaryResult );
            }
         });
         
         // For binary inputs,
        binaryField.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
               String text = binaryField.getText();
               
               int decimalResult = Integer.parseInt( text, 2 );
               String hexResult = Integer.toHexString( decimalResult );
               
               decimalField.setText( String.valueOf( decimalResult ) );
               hexField.setText( hexResult.toUpperCase() );
            }
        });
         
        frame.setSize(320,360);  
        frame.setLayout(null);  
        frame.setVisible(true); 
        
    }
    
}
