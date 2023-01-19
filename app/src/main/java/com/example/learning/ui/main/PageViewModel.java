package com.example.learning.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();

    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {

        @Override
        public String apply(Integer input) {

            if(input == 0){
                return "https://jeevasimba.github.io/Jeevasimba/English";
            }else if(input == 1) {
                return "https://jeevasimba.github.io/Jeevasimba/tenses";
            } else {
                return "https://jeevasimba.github.io/Jeevasimba/words";
            }

         //   return "https://github.com/Jeevasimba/webviewrotate/blob/main/app/src/main/res/layout/activity_main.xml" + input;

        }

    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }

}
