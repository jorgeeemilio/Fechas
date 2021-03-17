package es.studium.CambioDeFechas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;

public class Fechas_Cambiadas2  implements ActionListener, WindowListener
{
	Frame ventana = new Frame();
	Label lblFecha = new Label(" Dame una fecha Europea");
	Label lblEuropea = new Label("dd/mm/yyyy:");
	TextField txtFecha = new TextField(8);
	JButton btnTransformacion = new JButton("Transformación");
	TextField txtFechaTransformada= new TextField(8);
	Label lblAmericana =new Label ("Fecha Americana");

	public Fechas_Cambiadas2()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.getHSBColor(73,210,77));
		ventana.add(lblFecha);
		ventana.add(lblEuropea);
		ventana.add(txtFecha);
		ventana.add(btnTransformacion);
		ventana.add(txtFechaTransformada);
		ventana.add(lblAmericana);
		btnTransformacion.addActionListener(this);
		ventana.setSize(200,190);

		ventana.setResizable(true);
		ventana.setLocationRelativeTo(null);
		ventana.addWindowListener(this);
		ventana.requestFocus();
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Fechas_Cambiadas2();
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{


	}

	@Override
	public void actionPerformed(ActionEvent event)
	{	

		if (btnTransformacion.equals(event.getSource()))
		{

			//txtFecha.setText(arrayFecha2[0]+arrayFecha2[1]+arrayFecha2[2]);
			if (txtFecha.getText().length() >0)
			{
				String[] arrayFecha = txtFecha.getText().split("/");
				txtFechaTransformada.setText(arrayFecha[2]+"/"+arrayFecha[1]+"/"+arrayFecha[0]);

			}
			else 
			{
				String[] arrayFecha = txtFechaTransformada.getText().split("/");
				txtFecha.setText(arrayFecha[2]+"/"+arrayFecha[1]+"/"+arrayFecha[0]);

			}
		}
	}
}
