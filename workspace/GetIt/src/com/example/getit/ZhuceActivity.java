package com.example.getit;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
 
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
 
import com.example.getit.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint("NewApi")
public class ZhuceActivity extends Activity {
	private Context mC;
	EditText UserID=(EditText)findViewById(R.id.aid);
	EditText UserName=(EditText)findViewById(R.id.aname);
	EditText PassWord=(EditText)findViewById(R.id.atime);
	EditText PassWord1=(EditText)findViewById(R.id.apos);
    Button ok=(Button)findViewById(R.id.ok);
    Button cancle=(Button)findViewById(R.id.cancle);
    Toast wel=new Toast(mC);
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        // TODO Auto-generated method stub
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.enroll);
	        mC=this;

	        ok.setOnClickListener(new regisListner());
            cancle.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent quxiao=new Intent(mC, MainActivity.class);
					startActivity(quxiao);
					
				}
			});
	        
	        }
		class regisListner implements OnClickListener{
			
			public void onClick(View v){
				/*
				 * 在这里输入如网页所示语句；
				 * 
				 */
				
				
				wel=Toast.makeText(mC, "注册成功~请登录！",1000);
				Intent intent=new Intent(mC, MainActivity.class);
				startActivity(intent);
				
			}
			
		}
}
	

