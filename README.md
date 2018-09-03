# FingerPrintDemo

1.添加依赖
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
    
    dependencies {
	        implementation 'com.github.zzz199316:FingerPrintDemo:v1.0.0'
	}


2.使用方式

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
    
     @Override
    public void onOtherAuthenticated() {
        Toast.makeText(this, "请使用其他认证方式", Toast.LENGTH_SHORT).show();
    }
}
