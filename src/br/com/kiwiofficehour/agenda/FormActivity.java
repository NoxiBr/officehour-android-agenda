package br.com.kiwiofficehour.agenda;

import java.util.ArrayList;
import java.util.List;

import br.com.kiwiofficehour.agenda.entidades.Estado;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FormActivity extends Activity {
	private Spinner mComboboxEstado;
	private ArrayAdapter<Estado> mAdapter;
	private List<Estado> mItens;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);	
		mItens = new ArrayList<Estado>();		
		
		Estado e1 = new Estado();
		e1.setId(1);
		e1.setNome("Goiás");
		e1.setSigla("GO");
		mItens.add(e1);
		
		Estado e2 = new Estado();
		e2.setId(2);
		e2.setNome("São Paulo");
		e2.setSigla("SP");
		mItens.add(e2);
		
		Estado e3 = new Estado();
		e3.setId(3);
		e3.setNome("Belo Horizonte");
		e3.setSigla("BH");
		mItens.add(e3);
		
		Estado e4 = new Estado();
		e4.setId(4);
		e4.setNome("Bahia");
		e4.setSigla("BA");
		mItens.add(e4);
		
		mAdapter = new ArrayAdapter<Estado>(this, R.layout.activity_form_spinner_item,  mItens);
		
		mComboboxEstado = (Spinner) findViewById(R.activity_form.comboboxEstados);
		
		mComboboxEstado.setAdapter(mAdapter);
	}
}
