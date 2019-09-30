package org.pwanb.checkers.ui.rules;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RulesViewModel extends ViewModel {

    private MutableLiveData<Boolean> playerWhite;
    private MutableLiveData<Boolean> playerRed;

    public RulesViewModel() {
        playerWhite = new MutableLiveData<>();
        playerWhite.setValue(true);

        playerRed = new MutableLiveData<>();
        playerRed.setValue(true);
    }

    public boolean isPlayerWhite() {
        return playerWhite.getValue();
    }

    public boolean isPlayerRed() {
        return playerRed.getValue();
    }

    public void setPlayerWhite(boolean playerWhite) {
        this.playerWhite.setValue(playerWhite);
    }

    public void setPlayerRed(boolean playerRed) {
        this.playerRed.setValue(playerRed);
    }


}
