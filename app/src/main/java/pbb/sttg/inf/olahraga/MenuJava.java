package pbb.sttg.inf.olahraga;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MenuJava extends AppCompatActivity {

    Button olahraga, about, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        olahraga= (Button) findViewById(R.id.olahraga);
        about= (Button) findViewById(R.id.about);
        btnExit = (Button) findViewById(R.id.btnExit);


        olahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJava.this,List_olahraga.class);
                MenuJava.this.startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJava.this,About.class);
                MenuJava.this.startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                finish();
            }
        });

    }
}


