# FingerPrintDemo


public class MainActivity extends AppCompatActivity implements CheckFinger {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new  FingerprintUtils().check(this);


    }

    @Override
    public void onAuthenticated() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        finish();
    }
}
