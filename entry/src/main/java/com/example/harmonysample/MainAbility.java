package com.example.harmonysample;

import com.example.harmonysample.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {

    private int layout_main_ability = 0x111;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
        setUIContent(layout_main_ability);
    }
}
