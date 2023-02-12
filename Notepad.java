package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

class OpenFile extends JFrame{
	private JLabel fname;
	private JComboBox file;
	private JButton btnOk, btnCancel;
	static String Name = "";
	
	public OpenFile() {
		File d = new File("src/mySwing");
		fname = new JLabel("Open File:");
		fname.setBounds(10, 10, 90, 30);
		file = new JComboBox(d.list());
		file.setBounds(10,50,200,30);
		btnOk = new JButton("Open");
		btnOk.setBounds(60 ,80, 90, 30);
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(155, 80, 90, 30);
		
		
		setTitle("Open File");
		setLocation(200,200);
		setSize(300,200);
		setVisible(true);
		setLayout(null);
		add(fname);
		add(file);
		add(btnOk);
		add(btnCancel);
			
		ActionHandle AC = new ActionHandle();
		file.addActionListener(AC);
		btnOk.addActionListener(AC);
		btnCancel.addActionListener(AC);
	}
	
	class ActionHandle implements ActionListener{

		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOk) {
			try {
				FileReader fr = new FileReader("src/mySwing"+"/"+file.getSelectedItem().toString());
				Scanner in = new Scanner(fr);
				while(in.hasNextLine()) {
					Name += in.nextLine()+"\n";
				}
				Notepad.TxtMain.setText(Name);
				dispose();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource()==btnCancel) dispose();
		}  
		
	}
}

class SaveText extends JFrame {
	private JLabel name;
	private JTextField txtname;
	private JButton btnOk, btnCancel;
	private JComboBox type;
	static String FileName;
	
	public SaveText() {
		name = new JLabel("File Name:");
		name.setBounds(10, 10, 90, 30);
		txtname = new JTextField("Untitled1");
		txtname.setBounds(10, 45, 200, 30);
		btnOk = new JButton("Save");
		btnOk.setBounds(70 ,120, 90, 30);
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(165, 120, 90, 30);
		type = new JComboBox(new String[] {"All files(*)","c source file","c++ source file","java","python","sql"});
		type.setBounds(10,80,200,30);
		
		setTitle("Save File");
		setLocation(200,200);
		setSize(400,200);
		setVisible(true);
		setLayout(null);
		add(name);
		add(txtname);
		add(btnOk);
		add(btnCancel);
		add(type);
		
		ActionHandler AH = new ActionHandler();		
		type.addActionListener(AH);	
		btnOk.addActionListener(AH);
		btnCancel.addActionListener(AH);
		
	}
	class ActionHandler implements ActionListener{ 
		
			public void actionPerformed(ActionEvent e) {
				
			if(e.getSource()==btnOk) {	
				FileName = txtname.getText();
				
				
			if(type.getSelectedItem().toString()=="All files(*)")     FileName += ".txt";
			if(type.getSelectedItem().toString()=="c source file")    FileName += ".c";
			if(type.getSelectedItem().toString()=="c++ source file")  FileName += ".cpp";
			if(type.getSelectedItem().toString()=="java")       FileName += ".java";
			if(type.getSelectedItem().toString()=="python")     FileName += ".python";
			if(type.getSelectedItem().toString()=="sql")        FileName += ".sql";
			
			try {
				FileWriter fw = new FileWriter(FileName);
				Scanner sc = new Scanner(Notepad.getText());
				while(sc.hasNextLine()) {
					fw.write(sc.nextLine()+"\n");
				}
				fw.close();
				
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Saved Sucessfully");
			dispose();
			}
			
			if(e.getSource()==btnCancel) dispose();
				
			}
		
	}
		
}

public class Notepad extends JFrame{
	private JMenuBar Main;
	private JMenu file, edit, format,view,help,zoom,font,Style;
	private JMenuItem New,Open,Save,Print,Exit,Undo,Cut,Copy,Paste,Delete,Find,Replace,SelectAll;
	private JMenuItem WordWrap,ZoomIn,ZoomOut,RotateR,RotateL,ViewHelp,SendFeedback,About;
	private JCheckBoxMenuItem SBold,SItalic,StatusBar;
	private JRadioButtonMenuItem RArial,RForte,RCalibri,RCambria,RLatin;
	public static JTextArea TxtMain;
	private ButtonGroup BG;
	private JComboBox CSize;
	
	public static String getText() {
		return TxtMain.getText();
	}
	
	public Notepad() {
		Main = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		view = new JMenu("View");
		help = new JMenu("Help");
		zoom = new JMenu("Zoom");
		font = new JMenu("font");
		Style = new JMenu("Style");
		
		New = new JMenuItem("New",KeyEvent.VK_N);
		KeyStroke nn = KeyStroke.getKeyStroke("control N");
		New.setAccelerator(nn);
		
		Open = new JMenuItem("Open",KeyEvent.VK_O);
		KeyStroke oo = KeyStroke.getKeyStroke("control O");
		Open.setAccelerator(oo);
		
		Save = new JMenuItem("Save",KeyEvent.VK_S);
		KeyStroke ss = KeyStroke.getKeyStroke("control S");
		Save.setAccelerator(ss);
		
		Print = new JMenuItem("Print",KeyEvent.VK_P);
		KeyStroke pp = KeyStroke.getKeyStroke("control P");
		Print.setAccelerator(pp);
		
		Exit = new JMenuItem("Exit");
		Undo = new JMenuItem("Undo",KeyEvent.VK_Z);
		KeyStroke uz = KeyStroke.getKeyStroke("control Z");
		Undo.setAccelerator(uz);
		
		Cut = new JMenuItem("Cut",KeyEvent.VK_X);
		KeyStroke cx = KeyStroke.getKeyStroke("control X");
		Cut.setAccelerator(cx);
		
		Copy = new JMenuItem("Copy",KeyEvent.VK_C);
		KeyStroke cc = KeyStroke.getKeyStroke("control C");
		Copy.setAccelerator(cc);
		
		Paste = new JMenuItem("Paste",KeyEvent.VK_V);
		KeyStroke pv = KeyStroke.getKeyStroke("control V");
		Paste.setAccelerator(pv);
		
		Delete = new JMenuItem("Delete");
		Find = new JMenuItem("Find",KeyEvent.VK_F);
		KeyStroke ff = KeyStroke.getKeyStroke("control F");
		Find.setAccelerator(ff);
		
		Replace = new JMenuItem("Replace",KeyEvent.VK_R);
		KeyStroke rr = KeyStroke.getKeyStroke("control R");
		Find.setAccelerator(rr);
		
		SelectAll = new JMenuItem("Select All",KeyEvent.VK_A);
		KeyStroke sa = KeyStroke.getKeyStroke("control A");
		SelectAll.setAccelerator(sa);
		WordWrap = new JMenuItem("Word Wrap");
		ZoomIn = new JMenuItem("Zoom in");
		ZoomOut = new JMenuItem("Zoom out");
		RotateR = new JMenuItem("Rotate Right");
		RotateL = new JMenuItem("Rotate Left");
		ViewHelp = new JMenuItem("View Help");
		SendFeedback = new JMenuItem("Send Feedback");
		About = new JMenuItem("About");
		
		SBold = new JCheckBoxMenuItem("Bold");
		SItalic = new JCheckBoxMenuItem("Italic");
		StatusBar = new JCheckBoxMenuItem("Status Bar");
		
		RArial = new JRadioButtonMenuItem("Arial");
		RForte = new JRadioButtonMenuItem("Forte");
		RCalibri = new JRadioButtonMenuItem("Calibri");
		RCambria = new JRadioButtonMenuItem("Cambria");
		RLatin = new JRadioButtonMenuItem("Latin");
		
		BG = new ButtonGroup();
		BG.add(RArial);
		BG.add(RForte);
		BG.add(RCalibri);
		BG.add(RCambria);
		BG.add(RLatin);
		
		CSize = new JComboBox(new String[] {"Size","8","10","12","16","20","24"});
		
		file.add(New);
		file.add(Open);
		file.add(Save);
		file.add(Print);
		file.addSeparator();
		file.add(Exit);
		
		edit.add(Undo);
		edit.add(Cut);
		edit.add(Copy);
		edit.add(Paste);
		edit.add(Delete);
		edit.addSeparator();
		edit.add(Find);
		edit.add(Replace);
		edit.add(SelectAll);
		
		font.add(RArial);
		font.add(RCalibri);
		font.add(RCambria);
		font.add(RForte);
		font.add(RLatin);
		
		Style.add(SBold);
		Style.add(SItalic);
		
		format.add(WordWrap);
		format.add(font);
		format.add(Style);
		//format.add(CSize);
		
		zoom.add(ZoomIn);
		zoom.add(ZoomOut);
		
		view.add(zoom);
		view.add(RotateL);
		view.add(RotateR);
		view.add(StatusBar);
		
		help.add(ViewHelp);
		help.add(SendFeedback);
		help.add(About);
		
		Main.add(file);
		Main.add(edit);
		Main.add(format);
		Main.add(view);
		Main.add(help);
		Main.add(CSize);
		
		TxtMain = new JTextArea();
		
		setTitle("Notepad");
		setSize(450,450);
		setLocation(100,100);
		add(new JScrollPane(TxtMain));
		add(TxtMain);
		setJMenuBar(Main);
		setVisible(true);
		
		New.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtMain.setText("");
				
			}
		});
		
		Open.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new OpenFile();
			}
		});
		
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SaveText();			
			}
		});

		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		CheckRadioCombo CRC = new CheckRadioCombo();
		SBold.addItemListener(CRC);
		SItalic.addItemListener(CRC);
		
		RArial.addItemListener(CRC);
		RForte.addItemListener(CRC);
		RCalibri.addItemListener(CRC);
		RCambria.addItemListener(CRC);
		RLatin.addItemListener(CRC);
		
		CSize.addActionListener(CRC);
		
	}
	
	class CheckRadioCombo implements ItemListener, ActionListener{
     String S="Arial";
    int valBold = Font.PLAIN, valItalic = Font.PLAIN, size=14;
		
			public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==RArial) S="Arial";
			if(e.getSource()==RCalibri) S="Calibri";
			if(e.getSource()==RCambria) S="Cambria";
			if(e.getSource()==RForte) S="Forte";
			if(e.getSource()==RLatin) S="Latin";
			
			if(SBold.isSelected()) valBold = Font.BOLD;
			if(SItalic.isSelected()) valItalic = Font.ITALIC;
			
			TxtMain.setFont(new Font(S,valBold+valItalic,size));
		}
			
		public void actionPerformed(ActionEvent e) {
			int	sized = Integer.parseInt(CSize.getSelectedItem().toString());
					TxtMain.setFont(new Font(S,valBold+valItalic,sized));
		}
		
	}
	
	

	public static void main (String[] args) throws IOException{
		Notepad note = new Notepad();

	}

}
