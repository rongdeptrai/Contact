<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#f5f6f8"
    tools:context=".profile.AddressActivity">

    <LinearLayout
        android:id="@+id/address"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:background="#FFFFFF"
        >

        <Button
            android:id="@+id/back3"
            android:layout_marginLeft="5dp"
            android:layout_width="25dp"
            android:layout_height="25dp"
            android:layout_gravity="center"
            android:layout_marginRight="5dp"
            android:background="@drawable/back" />

        <TextView
            android:layout_width="330dp"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:gravity="center_horizontal"
            android:text="Địa chỉ"
            android:textAlignment="center"
            android:textColor="#000000"
            android:textSize="20dp" />

    </LinearLayout>

        <ListView
            android:layout_marginTop="20dp"
            android:layout_below="@+id/address"
            android:id="@+id/lvAddress"
            android:divider="#fff"
            android:dividerHeight="8dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            />
</RelativeLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 