package rovie.martin.francisco.exitdialog;

import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
            .setMessage("Are you sure you want to Exit?")
            .setCancelable(false)
            .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int id) {
                      finish();
                 }
            })
            .setNegativeButton("NO", null)
            .show();
    }
}