package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileContactFragment extends Fragment implements View.OnClickListener {


    public ProfileContactFragment() {
        // Required empty public constructor
    }

    private Button bTlp, bEmail, bFb, bIg;
    private String dTelp,dEmail,dFb, dIg;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        bTlp = view.findViewById(R.id.telp);
        bEmail = view.findViewById(R.id.email);
        bFb = view.findViewById(R.id.fb);
        bIg = view.findViewById(R.id.ig);

        bTlp.setOnClickListener(this);
        bEmail.setOnClickListener(this);
        bFb.setOnClickListener(this);
        bIg.setOnClickListener(this);

        dTelp = bTlp.getText().toString();
        dEmail = bEmail.getText().toString();
        dFb = bFb.getText().toString();
        dIg = bIg.getText().toString();
        view = inflater.inflate(R.layout.fragment_profile_contact, container, false);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.telp:
                Intent intentTelp = new Intent(Intent.ACTION_DIAL);
                intentTelp.setData((Uri.parse("tel:"+dTelp)));
                startActivity(intentTelp);
            case R.id.email:
                Intent intentEmail = new Intent(Intent.ACTION_SEND);
                intentEmail.setType("text/html");
                intentEmail.putExtra(Intent.EXTRA_EMAIL, dEmail);
                startActivity(Intent.createChooser(intentEmail,"Send Email"));
            case R.id.fb:
                String uri= "https://www.facebook.com/zhafirah.sakinah";
                Intent intentFb = new Intent(Intent.ACTION_VIEW);
                intentFb.setData(Uri.parse(uri));
                startActivity(intentFb);
            case R.id.ig:
                String uri2= "https://www.instagram.com/zhafirah_sakinah";
                Intent intentIg = new Intent(Intent.ACTION_VIEW);
                intentIg.setData(Uri.parse(uri2));
                startActivity(intentIg);
        }
    }

}
