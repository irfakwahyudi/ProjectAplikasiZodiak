package com.irfak.projectdikoding.Star;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.irfak.projectdikoding.R;

public class Aquarius {
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater i, ViewGroup c, Bundle s) {
            View rootView = i.inflate(R.layout.fragment_main, c, false);

            Toast toast = Toast.makeText(getActivity(), "A", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
            toast.show();

            return rootView;
        }
    }
}
