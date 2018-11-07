/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.materialfilemanager.settings;

import android.os.Bundle;

import com.takisoft.preferencex.PreferenceFragmentCompat;

import androidx.annotation.Nullable;
import me.zhanghai.android.materialfilemanager.R;
import me.zhanghai.android.materialfilemanager.util.NightModeHelper;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        SettingsLiveDatas.NIGHT_MODE.observe(this, nightMode -> NightModeHelper.updateNightMode(
                requireActivity()));
    }

    @Override
    public void onCreatePreferencesFix(@Nullable Bundle savedInstanceState,
                                       @Nullable String rootKey) {
        addPreferencesFromResource(R.xml.settings);
    }
}
