package org.techtown.displaytest.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import org.techtown.displaytest.R;
import org.techtown.displaytest.adapter.TabPagerAdapter;


public class EMdemoActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emdemo);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("EmLog Tool"));
        tabLayout.addTab(tabLayout.newTab().setText("TAB TWO"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager=(ViewPager)findViewById(R.id.pager);
        TabPagerAdapter pagerAdapter=new TabPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.emdemo, menu);


        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_RunningService) {
            Toast.makeText(this.getApplicationContext(),"RunningService", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.take_Log) {
            Toast.makeText(this.getApplicationContext(),"take_Log", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.save_Log) {
            Toast.makeText(this.getApplicationContext(),"save_Log", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.QXDM) {
            Toast.makeText(this.getApplicationContext(),"QXDM", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.TCP) {
            Toast.makeText(this.getApplicationContext(),"TCP DUMP", Toast.LENGTH_SHORT).show();


        } else if (id == R.id.WLAN) {
            Toast.makeText(this.getApplicationContext(),"WRAN DRIVER", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

