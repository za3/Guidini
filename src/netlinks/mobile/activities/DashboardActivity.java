package netlinks.mobile.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.guidini.R;

public class DashboardActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
	}
	public void onClickAnnonces(View view) {
		//startActivity(new Intent(DashboardActivity.this, AnnonceActivity.class));
	}
}