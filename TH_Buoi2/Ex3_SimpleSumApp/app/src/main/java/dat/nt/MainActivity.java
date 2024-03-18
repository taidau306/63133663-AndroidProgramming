package dat.nt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Bo lang nghe và xử lý sự kiện lên nút Tính Tổng
    public void XuLyCong(View view){
        EditText editTextSoA =  findViewById(R.id.edtA);
        EditText editTextSoB =  findViewById(R.id.edtB);
        EditText editTextKetQua =  findViewById(R.id.edtKQ);
        //Lấy dữ liệu về
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();
        //Chuyen du lieu sang dang so
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        //Tinh tong
        int tong = soA + soB;
        String strTong = String.valueOf(tong);
        editTextKetQua.setText(strTong);
    }
}