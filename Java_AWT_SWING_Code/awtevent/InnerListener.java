import java.awt.*;
import java.awt.event.*;
class InnerListener implements ActionListener 
{
Frame f;
Button b,b1;
TextField tf;
	InnerListener(String s)
	{	
		f=new Frame(s);
		b=new Button("ok");
		b1=new Button("cancel");
		b.setBounds(20,100,40,40);
		b1.setBounds(20,180,40,40);
	     
		b.addActionListener(this);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
{

tf.setText("InnerListener");

}
			
		});


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
new InnerListener("event demo");
}
}


































