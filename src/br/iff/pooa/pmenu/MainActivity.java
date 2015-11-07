package br.iff.pooa.pmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button bttoast;
	Button bttela2;
	Button bttela3;
	Button bttela4;
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bttoast = (Button) findViewById(R.id.bttoast);

		bttoast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(v.getContext(), "Toast", Toast.LENGTH_LONG)
						.show();

			}
		});

		bttela2 = (Button) findViewById(R.id.bttela2);

		bttela2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(v.getContext(),Tela2Activity.class);
				startActivity(i);

			}
		});
		
		
		bttela3 = (Button) findViewById(R.id.bttela3);

		bttela3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(v.getContext(),Tela3Activity.class);
				startActivity(i);

			}
		});
		
		//bttela4 = (Button) findViewById(R);

		bttela4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(v.getContext(),CadastroActivity.class);
				startActivity(i);

			}
		});

	}
}
