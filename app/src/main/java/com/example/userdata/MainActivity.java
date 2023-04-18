package com.example.userdata;

import static com.example.userdata.R.id.call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    LottieAnimationView loading;
    HashMap<String, String> hashMap;
    ArrayList< HashMap<String, String> > arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);
        loading = findViewById(R.id.loading);

        ///////////////////////////////////////////////////////////








        //data persing from server in using json=============
        String url = "https://dummyjson.com/users";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        //////////////////
                        loading.setVisibility(View.GONE);
                        Log.d("serverRes", response.toString());


                        try {
                            JSONArray jsonArray = response.getJSONArray("users");

                            for (int x=0; x<jsonArray.length(); x++){
                                //
                                JSONObject jsonObject = jsonArray.getJSONObject(x);

                                String id = jsonObject.getString("id");
                                String firstName = jsonObject.getString("firstName");
                                String lastName = jsonObject.getString("lastName");
                                String maidenName = jsonObject.getString("maidenName");
                                String age = jsonObject.getString("age");
                                String gender = jsonObject.getString("gender");
                                String email = jsonObject.getString("email");
                                String phone = jsonObject.getString("phone");
                                String username = jsonObject.getString("username");
                                String password = jsonObject.getString("password");
                                String birthDate = jsonObject.getString("birthDate");
                                String image = jsonObject.getString("image");
                                String bloodGroup = jsonObject.getString("bloodGroup");
                                String height = jsonObject.getString("height");
                                String weight = jsonObject.getString("weight");
                                String eyeColor = jsonObject.getString("eyeColor");
                                String domain = jsonObject.getString("domain");
                                String ip = jsonObject.getString("ip");
                                String macAddress = jsonObject.getString("macAddress");
                                String university = jsonObject.getString("university");
                                String ein = jsonObject.getString("ein");
                                String ssn = jsonObject.getString("ssn");
                                String userAgent = jsonObject.getString("userAgent");

                                //hair object
                                JSONObject hairObject = jsonObject.getJSONObject("hair");
                                String color = hairObject.getString("color");
                                String type = hairObject.getString("type");

                                //address object
                                JSONObject addressObject = jsonObject.getJSONObject("address");
                                String address = addressObject.getString("address");
                                String city = addressObject.getString("city");
                                String postalCode = addressObject.getString("postalCode");
                                String state = addressObject.getString("state");
                                //
                                JSONObject coordinatesObject  = addressObject.getJSONObject("coordinates");
                                String lat = coordinatesObject.getString("lat");
                                String lng = coordinatesObject.getString("lng");

                                //bank object
                                JSONObject bankObject = jsonObject.getJSONObject("bank");
                                String cardExpire = bankObject.getString("cardExpire");
                                String cardNumber = bankObject.getString("cardNumber");
                                String cardType = bankObject.getString("cardType");
                                String currency = bankObject.getString("currency");
                                String iban = bankObject.getString("iban");


                                //company object
                                JSONObject companyObject = jsonObject.getJSONObject("company");
                                String Cdepartment = companyObject.getString("department");
                                String Cname = companyObject.getString("name");
                                String Ctitle = companyObject.getString("title");
                                //
                                JSONObject companyAddressObject = companyObject.getJSONObject("address");
                                String Caddress = companyAddressObject.getString("address");
                                //String City = companyAddressObject.getString("city");
                                String CpostalCode = companyAddressObject.getString("postalCode");
                                String Cstate = companyAddressObject.getString("state");
                                //
                                JSONObject CompanyAddressCoordinatesObject = companyAddressObject.getJSONObject("coordinates");
                                String Clat = CompanyAddressCoordinatesObject.getString("lat");
                                String Clng = CompanyAddressCoordinatesObject.getString("lng");




                                //arreylist start=================
                                hashMap = new HashMap<>();
                                hashMap.put("id", id);
                                hashMap.put("firstName", firstName);
                                hashMap.put("lastName", lastName);
                                hashMap.put("maidenName", maidenName);
                                hashMap.put("age", age);
                                hashMap.put("gender", gender);
                                hashMap.put("email", email);
                                hashMap.put("phone", phone);
                                hashMap.put("username", username);
                                hashMap.put("password", password);
                                hashMap.put("birthDate", birthDate);
                                hashMap.put("image", image);
                                hashMap.put("bloodGroup", bloodGroup);
                                hashMap.put("height", height);
                                hashMap.put("weight", weight);
                                hashMap.put("eyeColor", eyeColor);
                                hashMap.put("domain", domain);
                                hashMap.put("ip", ip);
                                hashMap.put("macAddress", macAddress);
                                hashMap.put("university", university);
                                hashMap.put("ein", ein);
                                hashMap.put("ssn", ssn);
                                hashMap.put("userAgent", userAgent);

                                //hair object
                                hashMap.put("color", color);
                                hashMap.put("type", type);

                                //address object
                                hashMap.put("address", address);
                                hashMap.put("city", city);
                                hashMap.put("postalCode", postalCode);
                                hashMap.put("state", state);
                                hashMap.put("lat", lat);
                                hashMap.put("lng", lng);

                                //bank object
                                hashMap.put("cardExpire", cardExpire);
                                hashMap.put("cardNumber", cardNumber);
                                hashMap.put("cardType", cardType);
                                hashMap.put("currency", currency);
                                hashMap.put("iban", iban);

                                //company object
                                hashMap.put("Cdepartment", Cdepartment);
                                hashMap.put("Cname", Cname);
                                hashMap.put("Ctitle", Ctitle);
                                hashMap.put("Caddress", Caddress);
                                //hashMap.put("City", City);
                                hashMap.put("CpostalCode", CpostalCode);
                                hashMap.put("Cstate", Cstate);
                                hashMap.put("Clat", Clat);
                                hashMap.put("Clng", Clng);

                                arrayList.add(hashMap);
                                //end


                                //
                            }

                            //////
                            myAdaptr adaptr = new myAdaptr();
                            gridView.setAdapter(adaptr);


                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }












                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                loading.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "volley error!", Toast.LENGTH_SHORT).show();

            }
        });

        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        queue.add(jsonObjectRequest);
        //end=================







    }//on create a bundle end===========================


    //create a adaptar==============
    public class myAdaptr extends BaseAdapter{
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View myView = layoutInflater.inflate(R.layout.item, null);

            hashMap = arrayList.get(position);
            //id add========
            LinearLayout itemlly = myView.findViewById(R.id.itemlly);
            ImageView perImg = myView.findViewById(R.id.perImg);
            TextView perName = myView.findViewById(R.id.perName);
            TextView perAge = myView.findViewById(R.id.perAge);
            TextView perGender = myView.findViewById(R.id.perGender);
            ImageView call = myView.findViewById(R.id.call);
            ImageView sms = myView.findViewById(R.id.sms);
            //end========

            //arreylist convert to string==========
            String id = hashMap.get("id");
            String firstName = hashMap.get("firstName");
            String lastName = hashMap.get("lastName");
            String maidenName = hashMap.get("maidenName");
            String age = hashMap.get("age");
            String gender = hashMap.get("gender");
            String email = hashMap.get("email");
            String phone = hashMap.get("phone");
            String username = hashMap.get("username");
            String password = hashMap.get("password");
            String birthDate = hashMap.get("birthDate");
            String image = hashMap.get("image");
            String bloodGroup = hashMap.get("bloodGroup");
            String height = hashMap.get("height");
            String weight = hashMap.get("weight");
            String eyeColor = hashMap.get("eyeColor");
            String domain = hashMap.get("domain");
            String ip = hashMap.get("ip");
            String macAddress = hashMap.get("macAddress");
            String university = hashMap.get("university");
            String ein = hashMap.get("ein");
            String ssn = hashMap.get("ssn");
            String userAgent = hashMap.get("userAgent");

            //hair object
            String color = hashMap.get("color");
            String type = hashMap.get("type");

            //address object
            String address = hashMap.get("address");
            String city = hashMap.get("city");
            String postalCode = hashMap.get("postalCode");
            String state = hashMap.get("state");
            String lat = hashMap.get("lat");
            String lng = hashMap.get("lng");

            //bank object
            String cardExpire = hashMap.get("cardExpire");
            String cardNumber = hashMap.get("cardNumber");
            String cardType = hashMap.get("cardType");
            String currency = hashMap.get("currency");
            String iban = hashMap.get("iban");

            //company object
            String Cdepartment = hashMap.get("Cdepartment");
            String Cname = hashMap.get("Cname");
            String Ctitle = hashMap.get("Ctitle");
            String Caddress = hashMap.get("Caddress");
            //String City = hashMap.get("City");
            String CpostalCode = hashMap.get("CpostalCode");
            String Cstate = hashMap.get("Cstate");
            String Clat = hashMap.get("Clat");
            String Clng = hashMap.get("Clng");
            //end

            //data add=============
            //data add=============
            Picasso.get().load(image).into(perImg);
            perName.setText(firstName);
            perAge.setText("Age : "+age);
            perGender.setText("Gender : "+gender);
            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+phone));
                    startActivity(intent);
                    //
                }
            });
            //
            sms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri=Uri.parse("smsto:"+phone);
                    Intent host=new Intent(Intent.ACTION_SENDTO,uri);
                    host.putExtra("sms_body", "Hello! I'm Properly Working..");
                    startActivity(host);
                }
            });
            //
            itemlly.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //
                    MainActivity2.Name = firstName;
                    MainActivity2.PersonImg = image;
                    MainActivity2.Id = id;
                    MainActivity2.FirstName = firstName;
                    MainActivity2.LastName = lastName;
                    MainActivity2.MaidenName = maidenName;
                    MainActivity2.Age = age;
                    MainActivity2.Gender = gender;
                    MainActivity2.Email = email;
                    MainActivity2.Phone = phone;
                    MainActivity2.Username = username;
                    MainActivity2.Password = password;
                    MainActivity2.BirthDate = birthDate;
                    MainActivity2.BloodGroup = bloodGroup;
                    MainActivity2.Height = height;
                    MainActivity2.Weight = weight;
                    MainActivity2.EyeColor = eyeColor;
                    MainActivity2.Domain = domain;
                    MainActivity2.Ip = ip;
                    MainActivity2.MacAddress = macAddress;
                    MainActivity2.University = university;
                    MainActivity2.Ein = ein;
                    MainActivity2.Ssn = ssn;
                    MainActivity2.UserAgent = userAgent;

                    //hair object
                    MainActivity2.Hcolor = color;
                    MainActivity2.Htype = type;

                    //address object
                    MainActivity2.Haddress = address;
                    MainActivity2.Hcity = city;
                    MainActivity2.HpostalCode = postalCode;
                    MainActivity2.Hstate = state;
                    MainActivity2.Hlat = lat;
                    MainActivity2.Hlng = lng;

                    //bank object
                    MainActivity2.CardExpire = cardExpire;
                    MainActivity2.CardNumber = cardNumber;
                    MainActivity2.CardType = cardType;
                    MainActivity2.Currency = currency;
                    MainActivity2.Iban = iban;

                    //bank object
                    MainActivity2.Cdepartment = Cdepartment;
                    MainActivity2.Cname = Cname;
                    MainActivity2.Ctitle = Ctitle;
                    MainActivity2.Caddress = Caddress;
                    //MainActivity2.Ccity = City;
                    MainActivity2.CpostalCode = CpostalCode;
                    MainActivity2.Cstate = Cstate;
                    MainActivity2.Clat = Clat;
                    MainActivity2.Clng = Clng;

                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    //
                }
            });
            //end===========
            //end===========



            return myView;
        }
    }



}