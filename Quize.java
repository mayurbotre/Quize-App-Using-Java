import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
class Details
{
	public static String Name="";
	public void setName(String s)
	{
		Name=s;
	}
	public String getName()
	{
		return Name;
	}
}
class HomeFrame extends JFrame implements ActionListener
{
	
	Container container = getContentPane();
    JLabel Label1 = new JLabel("Welcome to Quize Application!");
	JLabel nameLabel = new JLabel("NAME:");
    JTextField nameTextField = new JTextField();
    JButton submitButton = new JButton("SUBMIT");
    JButton startButton = new JButton("START");
    HomeFrame() {
        setLayoutManager();
		showHomeFrame(this);
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager() 
    {
        container.setLayout(null);
    }
	public void showHomeFrame(HomeFrame frame)
	{
		frame.setTitle("Quize Home Page");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
	}
    public void setLocationAndSize() 
    {
        Label1.setBounds(80,40,200,100);
        nameLabel.setBounds(50,140,100,30);
		nameTextField.setBounds(120,140,150,30);
        submitButton.setBounds(100, 200, 100, 30);
		startButton.setBounds(100, 250, 100, 30);
    }
    public void addComponentsToContainer() 
    {
        container.add(Label1);
        container.add(nameLabel);
		container.add(nameTextField);
        container.add(submitButton);
		container.add(startButton);
    }
    public void addActionEvent() 
    {
        submitButton.addActionListener(this);
        startButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == submitButton) 
        {   
            String cText;
            cText=nameTextField.getText();
            if(cText!=null)
            {
                JOptionPane.showMessageDialog(this, "Successfully Name Inserted!");
                Details d=new Details();
				d.setName(cText);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please Enter Valid Name...");
            }
        }
        if (e.getSource() == startButton) 
        {
			new Page1();
        }
	}
}
class Page1 extends JFrame implements ActionListener
{
	
	Container container = getContentPane();
    ButtonGroup b1=new ButtonGroup();
    JLabel Label1 = new JLabel("Q1.When Java Developed?");
	JRadioButton jck1= new JRadioButton("1970");
	JRadioButton jck2=new JRadioButton("1995");
	JRadioButton jck3=new JRadioButton("1992");
	JRadioButton jck4=new JRadioButton("1990");
    JButton submitButton = new JButton("SUBMIT");
    JButton nextButton = new JButton("NEXT");
    Page1() {
        setLayoutManager();
		showPage1(this);
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager() 
    {
        container.setLayout(null);
    }
	public void showPage1(Page1 frame)
	{
		frame.setTitle("Question No 1");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
	}
    public void setLocationAndSize() 
    {
        Label1.setBounds(80,0,200,100);
		jck1.setBounds(50, 60, 130, 30);
		jck2.setBounds(50, 100, 130, 30);
		jck3.setBounds(50, 140, 130, 30);
		jck4.setBounds(50, 180, 130, 30);
        submitButton.setBounds(100, 230, 100, 30);
		nextButton.setBounds(100, 280, 100, 30);
    }
    public void addComponentsToContainer() 
    {
		b1.add(jck1);
		b1.add(jck2);
		b1.add(jck3);
		b1.add(jck4);
        container.add(Label1);
		container.add(jck1);
		container.add(jck2);
		container.add(jck3);
		container.add(jck4);
        container.add(submitButton);
		container.add(nextButton);
    }
    public void addActionEvent() 
    {
        submitButton.addActionListener(this);
        nextButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == submitButton) 
        {   
			JOptionPane.showMessageDialog(this, "Wait While Storing Answer...");
            if(jck2.isSelected())
            {
				Total t=new Total();
				t.cMethod();
				/*int i=t.getC();
				System.out.println(i+" \n ");*/
            }
        }
        if (e.getSource() == nextButton) 
        {
			new Page2();
        }
	}
}
class Page2 extends JFrame implements ActionListener
{
	
	Container container = getContentPane();
    ButtonGroup b1=new ButtonGroup();
    JLabel Label1 = new JLabel("Q2.Who is the Developer of Java?");
	JRadioButton jck1= new JRadioButton("Guido van Rossum");
	JRadioButton jck2=new JRadioButton("Dennis Ritchie");
	JRadioButton jck3=new JRadioButton("James Gosling");
	JRadioButton jck4=new JRadioButton("Brendan Eich");
    JButton submitButton = new JButton("SUBMIT");
    JButton nextButton = new JButton("NEXT");
    Page2() {
        setLayoutManager();
		showPage2(this);
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager() 
    {
        container.setLayout(null);
    }
	public void showPage2(Page2 frame)
	{
		frame.setTitle("Question No 2");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
	}
    public void setLocationAndSize() 
    {
        Label1.setBounds(80,0,200,100);
		jck1.setBounds(50, 60, 150, 30);
		jck2.setBounds(50, 100, 150, 30);
		jck3.setBounds(50, 140, 150, 30);
		jck4.setBounds(50, 180, 150, 30);
        submitButton.setBounds(100, 230, 100, 30);
		nextButton.setBounds(100, 280, 100, 30);
    }
    public void addComponentsToContainer() 
    {
        b1.add(jck1);
		b1.add(jck2);
		b1.add(jck3);
		b1.add(jck4);
        container.add(Label1);
		container.add(jck1);
		container.add(jck2);
		container.add(jck3);
		container.add(jck4);
        container.add(submitButton);
		container.add(nextButton);
    }
    public void addActionEvent() 
    {
        submitButton.addActionListener(this);
        nextButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == submitButton) 
        {   
			JOptionPane.showMessageDialog(this, "Wait While Storing Answer...");
            if(jck3.isSelected())
            {
				Total t=new Total();
				t.cMethod();
				/*int i=t.getC();
				System.out.println(i+" \n ");*/
            }
        }
        if (e.getSource() == nextButton) 
        {
			new Page3();
        }
	}
}
class Page3 extends JFrame implements ActionListener
{
	
	Container container = getContentPane();
    ButtonGroup b1=new ButtonGroup();
    JLabel Label1 = new JLabel("Q3.How Many Keywords in Java?");
	JRadioButton jck1= new JRadioButton("32");
	JRadioButton jck2=new JRadioButton("48");
	JRadioButton jck3=new JRadioButton("56");
	JRadioButton jck4=new JRadioButton("51");
    JButton submitButton = new JButton("SUBMIT");
    JButton nextButton = new JButton("NEXT");
    Page3() {
        setLayoutManager();
		showPage3(this);
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager() 
    {
        container.setLayout(null);
    }
	public void showPage3(Page3 frame)
	{
		frame.setTitle("Question No 3");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
	}
    public void setLocationAndSize() 
    {
        Label1.setBounds(80,0,200,100);
		jck1.setBounds(50, 60, 100, 30);
		jck2.setBounds(50, 100, 100, 30);
		jck3.setBounds(50, 140, 100, 30);
		jck4.setBounds(50, 180, 100, 30);
        submitButton.setBounds(100, 230, 100, 30);
		nextButton.setBounds(100, 280, 100, 30);
    }
    public void addComponentsToContainer() 
    {
        b1.add(jck1);
		b1.add(jck2);
		b1.add(jck3);
		b1.add(jck4);
        container.add(Label1);
		container.add(jck1);
		container.add(jck2);
		container.add(jck3);
		container.add(jck4);
        container.add(submitButton);
		container.add(nextButton);
    }
    public void addActionEvent() 
    {
        submitButton.addActionListener(this);
        nextButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == submitButton) 
        {   
			JOptionPane.showMessageDialog(this, "Wait While Storing Answer...");
            if(jck4.isSelected())
            {
				Total t=new Total();
				t.cMethod();
				/*int i=t.getC();
				System.out.println(i+" \n ");*/
            }
        }
        if (e.getSource() == nextButton) 
        {
			new Page4();
        }
	}
}
class Page4 extends JFrame implements ActionListener
{
	
	Container container = getContentPane();
    ButtonGroup b1=new ButtonGroup();
    JLabel Label1 = new JLabel("Q4.Operator used for Compare?");
	JRadioButton jck1= new JRadioButton("><");
	JRadioButton jck2=new JRadioButton("=");
	JRadioButton jck3=new JRadioButton("==");
	JRadioButton jck4=new JRadioButton("<>");
    JButton submitButton = new JButton("SUBMIT");
    JButton nextButton = new JButton("NEXT");
    Page4() {
        setLayoutManager();
		showPage4(this);
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager() 
    {
        container.setLayout(null);
    }
	public void showPage4(Page4 frame)
	{
		frame.setTitle("Question No 4");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
	}
    public void setLocationAndSize() 
    {
        Label1.setBounds(20,0,300,100);
		jck1.setBounds(50, 60, 100, 30);
		jck2.setBounds(50, 100, 100, 30);
		jck3.setBounds(50, 140, 100, 30);
		jck4.setBounds(50, 180, 100, 30);
        submitButton.setBounds(100, 230, 100, 30);
		nextButton.setBounds(100, 280, 100, 30);
    }
    public void addComponentsToContainer() 
    {
        b1.add(jck1);
		b1.add(jck2);
		b1.add(jck3);
		b1.add(jck4);
        container.add(Label1);
		container.add(jck1);
		container.add(jck2);
		container.add(jck3);
		container.add(jck4);
        container.add(submitButton);
		container.add(nextButton);
    }
    public void addActionEvent() 
    {
        submitButton.addActionListener(this);
        nextButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == submitButton) 
        {   
			JOptionPane.showMessageDialog(this, "Wait While Storing Answer...");
            if(jck3.isSelected())
            {
				Total t=new Total();
				t.cMethod();
				/*int i=t.getC();
				System.out.println(i+" \n ");*/
            }
        }
        if (e.getSource() == nextButton) 
        {
			new Page5();
        }
	}
}
class Page5 extends JFrame implements ActionListener
{
	
	Container container = getContentPane();
    ButtonGroup b1=new ButtonGroup();
    JLabel Label1 = new JLabel("Q5.How to get text data in Java?");
	JRadioButton jck1= new JRadioButton("string");
	JRadioButton jck2=new JRadioButton("char");
	JRadioButton jck3=new JRadioButton("String");
	JRadioButton jck4=new JRadioButton("myString");
    JButton submitButton = new JButton("SUBMIT");
    JButton nextButton = new JButton("NEXT");
    Page5() {
        setLayoutManager();
		showPage5(this);
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager() 
    {
        container.setLayout(null);
    }
	public void showPage5(Page5 frame)
	{
		frame.setTitle("Question No 5");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
	}
    public void setLocationAndSize() 
    {
        Label1.setBounds(20,0,300,100);
		jck1.setBounds(50, 60, 100, 30);
		jck2.setBounds(50, 100, 100, 30);
		jck3.setBounds(50, 140, 100, 30);
		jck4.setBounds(50, 180, 100, 30);
        submitButton.setBounds(100, 230, 100, 30);
		nextButton.setBounds(100, 280, 100, 30);
    }
    public void addComponentsToContainer() 
    {
        b1.add(jck1);
		b1.add(jck2);
		b1.add(jck3);
		b1.add(jck4);
        container.add(Label1);
		container.add(jck1);
		container.add(jck2);
		container.add(jck3);
		container.add(jck4);
        container.add(submitButton);
		container.add(nextButton);
    }
    public void addActionEvent() 
    {
        submitButton.addActionListener(this);
        nextButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == submitButton) 
        {   
			JOptionPane.showMessageDialog(this, "Wait While Storing Answer...");
            if(jck3.isSelected())
            {
				Total t=new Total();
				t.cMethod();
				/*int i=t.getC();
				System.out.println(i+" \n ");*/
            }
        }
        if (e.getSource() == nextButton) 
        {
			new Result();
        }
	}
}
class Result extends JFrame implements ActionListener
{
	Details d=new Details();
	String n=d.getName();
	Container container = getContentPane();
    JLabel Label1 = new JLabel("Result of "+n+" is ");
	JProgressBar jb=new JProgressBar(0,100);
    JButton homeButton = new JButton("Home");
    Result() {
        setLayoutManager();
		showResult(this);
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager() 
    {
        container.setLayout(null);
    }
	public void showResult(Result frame)
	{
		frame.setTitle("Final Result");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
	}
    public void setLocationAndSize() 
    {
		System.out.println(n+" ");
        Label1.setBounds(80,40,200,100);
        jb.setBounds(50,100,200,70);
		Total t=new Total();
		int res=t.getC();
		System.out.println(res+" \n ");
		jb.setValue(res*20);    
		jb.setStringPainted(true);
		homeButton.setBounds(100, 250, 100, 30);
    }
    public void addComponentsToContainer() 
    {
        container.add(Label1);
        container.add(jb);
		container.add(homeButton);
    }
    public void addActionEvent() 
    {
        homeButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == homeButton) 
        {
			new HomeFrame();
        }
	}
}
class Total
{	public static int c=0;
	public void cMethod()
	{
		//static{
		c++;
		
	}
	public int getC()
	{
		return c;
	}
	
}
public class Quize
{
	String name="";
	static int count=0;
	public static void main(String[] args)
	{
		HomeFrame hf1=new HomeFrame();
		
	}
}
