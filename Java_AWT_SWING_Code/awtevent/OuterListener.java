import java.awt.*;
import java.awt.event.*;
class OuterListener implements ActionListener 
{
Frame f;
Button b,b1;
TextField tf;
	OuterListener(String s)
	{	
		f=new Frame(s);
		b=new Button("ok");
		b1=new Button("cancel");
		b.setBounds(20,100,40,40);
		b1.setBounds(20,180,40,40);
	     Outer o=new Outer(this);
		b.addActionListener(this);
		b1.addActionListener(o);
		

		f.add(b);
		f.add(b1);
		tf=new TextField();

		tf.setBounds(20,40,100,40);
		f.add(tf);

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
new OuterListener("event demo");
}
}





class Outer implements ActionListener 
{
OuterListener f;
Outer(OuterListener f)
{
this.f=f;
}
public void actionPerformed(ActionEvent e)
{
	System.out.println("Outer's ap");
if(e.getSource()==f.b)
f.tf.setText("lalu");
if(e.getSource()==f.b1)
f.tf.setText("rabari");
}
}




























