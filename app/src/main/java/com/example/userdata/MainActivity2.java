package com.example.userdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {


    LinearLayout hairDrop, hairList, addressDrop, addressList, bankDrop, bankList, companyDrop, companyList;
    ImageView Image;
    TextView name, id, firstName, lastName, maidenName, age, gender, email, phone, username, password, birthDate, bloodGroup,
            height, weight, eyeColor, hcolor, htype, domain, ip, haddress, hcity, hlat, hlng, hpostalCode, hstate, macAddress,
            university, cardExpire, cardNumber, cardType, currency, iban, caddress, ccity, clat, clng, cpostalCode, cstate,
            cdepartment, cname, ctitle, ein, ssn, userAgent;

    public static String PersonImg = "";
    public static String Name = "";
    public static String Id = "";
    public static String FirstName = "";
    public static String LastName = "";
    public static String MaidenName = "";
    public static String Age = "";
    public static String Gender = "";
    public static String Email = "";
    public static String Phone = "";
    public static String Username = "";
    public static String Password = "";
    public static String BirthDate = "";
    public static String BloodGroup = "";
    public static String Height = "";
    public static String Weight = "";
    public static String EyeColor = "";
    public static String Hcolor = "";
    public static String Htype = "";
    public static String Domain = "";
    public static String Ip = "";
    public static String Haddress = "";
    public static String Hcity = "";
    public static String Hlat = "";
    public static String Hlng = "";
    public static String HpostalCode = "";
    public static String Hstate = "";
    public static String MacAddress = "";
    public static String University = "";
    public static String CardExpire = "";
    public static String CardNumber = "";
    public static String CardType = "";
    public static String Currency = "";
    public static String Iban = "";
    public static String Caddress = "";
    public static String Ccity = "";
    public static String Clat = "";
    public static String Clng = "";
    public static String CpostalCode = "";
    public static String Cstate = "";
    public static String Cdepartment = "";
    public static String Cname = "";
    public static String Ctitle = "";
    public static String Ein = "";
    public static String Ssn = "";
    public static String UserAgent = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Image = findViewById(R.id.Image);
        name = findViewById(R.id.name);

        hairDrop = findViewById(R.id.hairDrop);
        hairList = findViewById(R.id.hairList);
        addressDrop = findViewById(R.id.addressDrop);
        addressList = findViewById(R.id.addressList);
        bankDrop = findViewById(R.id.bankDrop);
        bankList = findViewById(R.id.bankList);
        companyDrop = findViewById(R.id.companyDrop);
        companyList = findViewById(R.id.companyList);
        //
        id = findViewById(R.id.id);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        maidenName = findViewById(R.id.maidenName);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        birthDate = findViewById(R.id.birthDate);
        bloodGroup = findViewById(R.id.bloodGroup);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        eyeColor = findViewById(R.id.eyeColor);
        hcolor = findViewById(R.id.hcolor);
        htype = findViewById(R.id.htype);
        domain = findViewById(R.id.domain);
        ip = findViewById(R.id.ip);
        haddress = findViewById(R.id.haddress);
        hcity = findViewById(R.id.hcity);
        hlat = findViewById(R.id.hlat);
        hlng = findViewById(R.id.hlng);
        hpostalCode = findViewById(R.id.hpostalCode);
        hstate = findViewById(R.id.hstate);
        macAddress = findViewById(R.id.macAddress);
        university = findViewById(R.id.university);
        cardExpire = findViewById(R.id.cardExpire);
        cardNumber = findViewById(R.id.cardNumber);
        cardType = findViewById(R.id.cardType);
        currency = findViewById(R.id.currency);
        iban = findViewById(R.id.iban);
        caddress = findViewById(R.id.caddress);
        ccity = findViewById(R.id.ccity);
        clat = findViewById(R.id.clat);
        clng = findViewById(R.id.clng);
        cpostalCode = findViewById(R.id.cpostalCode);
        cstate = findViewById(R.id.cstate);
        cdepartment = findViewById(R.id.cdepartment);
        cname = findViewById(R.id.cname);
        ctitle = findViewById(R.id.ctitle);
        ein = findViewById(R.id.ein);
        ssn = findViewById(R.id.ssn);
        userAgent = findViewById(R.id.userAgent);

        //================================================================

        name.setText("About "+Name);
        Picasso.get().load(PersonImg).into(Image);
        id.setText("ID : "+Id);
        firstName.setText("FirstName : "+FirstName);
        lastName.setText("LastName : "+LastName);
        maidenName.setText("MaidenName : "+MaidenName);
        age.setText("Age : "+Age);
        gender.setText("Gender : "+Gender);
        email.setText("Email : "+Email);
        phone.setText("Phone : "+Phone);
        username.setText("Username : "+Username);
        password.setText("Password : "+Password);
        birthDate.setText("BirthDate : "+BirthDate);
        bloodGroup.setText("BloodGroup : "+BloodGroup);
        height.setText("Height : "+Height);
        weight.setText("Weight : "+Weight);
        eyeColor.setText("EyeColor : "+EyeColor);
        hcolor.setText("Color : "+Hcolor);
        htype.setText("Type : "+Htype);
        domain.setText("Domain : "+Domain);
        ip.setText("IP : "+Ip);
        haddress.setText("Address : "+Haddress);
        hcity.setText("City : "+Hcity);
        hlat.setText("lat : "+Hlat);
        hlng.setText("lng : "+Hlng);
        hpostalCode.setText("PostalCode : "+HpostalCode);
        hstate.setText("State : "+Hstate);
        macAddress.setText("MacAddress : "+MacAddress);
        university.setText("University : "+University);
        cardExpire.setText("CardExpire : "+CardExpire);
        cardNumber.setText("CardNumber : "+CardNumber);
        cardType.setText("CardType : "+CardType);
        currency.setText("Currency : "+Currency);
        iban.setText("Iban : "+Iban);
        caddress.setText("Address : "+Caddress);
        ccity.setText("City : "+Ccity);
        clat.setText("lat : "+Clat);
        clng.setText("lng : "+Clng);
        cpostalCode.setText("PostalCode : "+CpostalCode);
        cstate.setText("State : "+Cstate);
        cdepartment.setText("Department : "+Cdepartment);
        cname.setText("Name : "+Cname);
        ctitle.setText("Title : "+Ctitle);
        ein.setText("Ein : "+Ein);
        ssn.setText("Ssn : "+Ssn);
        userAgent.setText("UserAgent : "+UserAgent);




    }//======================================================================





}