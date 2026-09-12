import java.awt.*;
import java.awt.event.*;
class AdapterClassDemo implements ActionListener 
{
Frame f;
Button b,b1;
TextField tf;
	AdapterClassDemo(String s)
	{	
		f=new Frame(s);
		b=new Button("ok");
		b1=new Button("cancel");
		b.setBounds(20,100,40,40);
		b1.setBounds(20,180,40,40);
	     
		b.addActionListener(this);
		b1.addActionListener(this);


		f.add(b);
		f.add(b1);
		tf=new TextField();
tf.addKeyListener(new KeyEventListener());
		tf.setBounds(20,40,100,40);
		f.add(tf);
f.addWindowListener(new WindowEventListener());
f.addMouseListener(new MouseEventListener(this));
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);

	}

public void actionPerformed(ActionEvent e)
{
System.out.println("ap");
if(e.getSource()==b)
tf.setText("ok");
if(e.getSource()==b1)
{
tf.setText("cancel");
}
}
public static void main(String s[])
{
new AdapterClassDemo("event demo");
}
}
                          //implements  WindowListener 
class WindowEventListener extends WindowAdapter
{
public void windowClosing(WindowEvent e1)
{
System.exit(0);
}

}
                         //implements  MouseListener 
class MouseEventListener extends MouseAdapter
{
AdapterClassDemo t;
MouseEventListener(AdapterClassDemo f)
{
this.t=f;
}
public void mouseClicked(MouseEvent e1)
{
t.tf.setText("mouseevent");
t.f.setBackground(Color.RED);
}
}
                       //implements  KeyListener   
class KeyEventListener extends KeyAdapter
{
public void keyTyped(KeyEvent e)
{

System.out.println(e.getKeyChar());   

}
}





//tf.addKeyListener(new KeyEventListener());



//f.addWindowListener(new WindowEventListener());
//f.addMouseListener(new MouseEventListener(this));






















